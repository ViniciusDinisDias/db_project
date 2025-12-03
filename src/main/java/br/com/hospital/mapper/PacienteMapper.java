package br.com.hospital.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import br.com.hospital.model.Paciente;
import br.com.hospital.dto.PacienteDTO;
@Mapper(componentModel = "spring")
public interface PacienteMapper {
    PacienteMapper INSTANCE = Mappers.getMapper(PacienteMapper.class);
    @Mapping(target = "cpf", expression = "java(Paciente.formatarCpf(paciente.getCpf()))")
    PacienteDTO toDto(Paciente paciente);
    Paciente toEntity(PacienteDTO d);
}
