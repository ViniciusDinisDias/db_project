package br.com.hospital.mapper;

import br.com.hospital.model.Remedio;
import br.com.hospital.dto.RemedioDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RemedioMapper {
    RemedioDTO toDTO(Remedio entity);
    Remedio toEntity(RemedioDTO dto);
}
