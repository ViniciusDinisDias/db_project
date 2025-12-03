package br.com.hospital.mapper;

import br.com.hospital.dto.PacienteDTO;
import br.com.hospital.model.Paciente;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-01T16:21:59-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class PacienteMapperImpl implements PacienteMapper {

    @Override
    public PacienteDTO toDto(Paciente paciente) {
        if ( paciente == null ) {
            return null;
        }

        PacienteDTO pacienteDTO = new PacienteDTO();

        pacienteDTO.setIdPaciente( paciente.getIdPaciente() );
        pacienteDTO.setNome( paciente.getNome() );
        pacienteDTO.setSexo( paciente.getSexo() );
        pacienteDTO.setTelefone( paciente.getTelefone() );
        pacienteDTO.setDataNascimento( paciente.getDataNascimento() );
        pacienteDTO.setRg( paciente.getRg() );
        pacienteDTO.setEndereco( paciente.getEndereco() );
        pacienteDTO.setCep( paciente.getCep() );
        pacienteDTO.setUf( paciente.getUf() );

        pacienteDTO.setCpf( Paciente.formatarCpf(paciente.getCpf()) );

        return pacienteDTO;
    }

    @Override
    public Paciente toEntity(PacienteDTO d) {
        if ( d == null ) {
            return null;
        }

        Paciente paciente = new Paciente();

        paciente.setNome( d.getNome() );
        paciente.setSexo( d.getSexo() );
        paciente.setTelefone( d.getTelefone() );
        paciente.setDataNascimento( d.getDataNascimento() );
        paciente.setCpf( d.getCpf() );
        paciente.setRg( d.getRg() );
        paciente.setEndereco( d.getEndereco() );
        paciente.setCep( d.getCep() );
        paciente.setUf( d.getUf() );

        return paciente;
    }
}
