package br.com.hospital.mapper;

import br.com.hospital.dto.RemedioDTO;
import br.com.hospital.model.Remedio;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-01T16:21:59-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class RemedioMapperImpl implements RemedioMapper {

    @Override
    public RemedioDTO toDTO(Remedio entity) {
        if ( entity == null ) {
            return null;
        }

        RemedioDTO remedioDTO = new RemedioDTO();

        remedioDTO.setIdRemedio( entity.getIdRemedio() );
        remedioDTO.setNome( entity.getNome() );
        remedioDTO.setDescricao( entity.getDescricao() );

        return remedioDTO;
    }

    @Override
    public Remedio toEntity(RemedioDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Remedio remedio = new Remedio();

        remedio.setIdRemedio( dto.getIdRemedio() );
        remedio.setNome( dto.getNome() );
        remedio.setDescricao( dto.getDescricao() );

        return remedio;
    }
}
