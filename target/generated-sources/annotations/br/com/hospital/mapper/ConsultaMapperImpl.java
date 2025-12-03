package br.com.hospital.mapper;

import br.com.hospital.dto.ConsultaDTO;
import br.com.hospital.model.Consulta;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-01T16:21:59-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class ConsultaMapperImpl implements ConsultaMapper {

    @Override
    public ConsultaDTO toDto(Consulta e) {
        if ( e == null ) {
            return null;
        }

        ConsultaDTO consultaDTO = new ConsultaDTO();

        consultaDTO.setIdConsulta( e.getIdConsulta() );
        consultaDTO.setDiagnostico( e.getDiagnostico() );
        consultaDTO.setDataHora( e.getDataHora() );
        consultaDTO.setTemperatura( e.getTemperatura() );
        consultaDTO.setPressao( e.getPressao() );
        consultaDTO.setFrequenciaCardiaca( e.getFrequenciaCardiaca() );

        return consultaDTO;
    }

    @Override
    public Consulta toEntity(ConsultaDTO d) {
        if ( d == null ) {
            return null;
        }

        Consulta consulta = new Consulta();

        consulta.setIdConsulta( d.getIdConsulta() );
        consulta.setDiagnostico( d.getDiagnostico() );
        consulta.setDataHora( d.getDataHora() );
        consulta.setTemperatura( d.getTemperatura() );
        consulta.setPressao( d.getPressao() );
        consulta.setFrequenciaCardiaca( d.getFrequenciaCardiaca() );

        return consulta;
    }
}
