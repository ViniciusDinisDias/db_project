package br.com.hospital.mapper;

import br.com.hospital.model.Cargo;
import br.com.hospital.dto.CargoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CargoMapper {
    CargoDTO toDTO(Cargo entity);
    Cargo toEntity(CargoDTO dto);
}
