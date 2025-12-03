package br.com.hospital.mapper;

import br.com.hospital.dto.SalaDTO;
import br.com.hospital.model.Sala;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-01T16:21:59-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class SalaMapperImpl implements SalaMapper {

    @Override
    public SalaDTO toDTO(Sala entity) {
        if ( entity == null ) {
            return null;
        }

        SalaDTO salaDTO = new SalaDTO();

        salaDTO.setIdSala( entity.getIdSala() );
        salaDTO.setNumero( entity.getNumero() );

        return salaDTO;
    }

    @Override
    public Sala toEntity(SalaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Sala sala = new Sala();

        sala.setIdSala( dto.getIdSala() );
        sala.setNumero( dto.getNumero() );

        return sala;
    }
}
