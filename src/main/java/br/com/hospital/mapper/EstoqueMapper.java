package br.com.hospital.mapper;

import br.com.hospital.model.Estoque;
import br.com.hospital.dto.EstoqueDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EstoqueMapper {
    EstoqueDTO toDTO(Estoque entity);
    Estoque toEntity(EstoqueDTO dto);
}
