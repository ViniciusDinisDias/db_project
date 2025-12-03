package br.com.hospital.mapper;
import org.mapstruct.Mapper;
import br.com.hospital.model.Consulta;
import br.com.hospital.dto.ConsultaDTO;
@Mapper(componentModel = "spring")
public interface ConsultaMapper {
    ConsultaDTO toDto(Consulta e);
    Consulta toEntity(ConsultaDTO d);
}
