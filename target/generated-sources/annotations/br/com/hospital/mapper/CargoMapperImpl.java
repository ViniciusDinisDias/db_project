package br.com.hospital.mapper;

import br.com.hospital.dto.CargoDTO;
import br.com.hospital.model.Cargo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-01T16:21:59-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class CargoMapperImpl implements CargoMapper {

    @Override
    public CargoDTO toDTO(Cargo entity) {
        if ( entity == null ) {
            return null;
        }

        CargoDTO cargoDTO = new CargoDTO();

        cargoDTO.setIdCargo( entity.getIdCargo() );
        cargoDTO.setNome( entity.getNome() );

        return cargoDTO;
    }

    @Override
    public Cargo toEntity(CargoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cargo cargo = new Cargo();

        cargo.setIdCargo( dto.getIdCargo() );
        cargo.setNome( dto.getNome() );

        return cargo;
    }
}
