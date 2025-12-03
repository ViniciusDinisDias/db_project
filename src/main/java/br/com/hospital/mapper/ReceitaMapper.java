package br.com.hospital.mapper;
import org.mapstruct.Mapper;
import br.com.hospital.model.Receita;
import br.com.hospital.dto.ReceitaDTO;
@Mapper(componentModel = "spring")
public interface ReceitaMapper {
    ReceitaDTO toDto(Receita e);
    Receita toEntity(ReceitaDTO d);
}
