package br.com.hospital.mapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import br.com.hospital.model.Funcionario;
import br.com.hospital.dto.FuncionarioDTO;
@Mapper(componentModel = "spring")
public interface FuncionarioMapper {
    FuncionarioDTO toDto(Funcionario e);
    Funcionario toEntity(FuncionarioDTO d);
}
