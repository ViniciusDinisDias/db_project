package br.com.hospital.mapper;

import br.com.hospital.dto.FuncionarioDTO;
import br.com.hospital.model.Funcionario;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-01T16:21:59-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class FuncionarioMapperImpl implements FuncionarioMapper {

    @Override
    public FuncionarioDTO toDto(Funcionario e) {
        if ( e == null ) {
            return null;
        }

        FuncionarioDTO funcionarioDTO = new FuncionarioDTO();

        funcionarioDTO.setIdFuncionario( e.getIdFuncionario() );
        funcionarioDTO.setNome( e.getNome() );
        funcionarioDTO.setSexo( e.getSexo() );
        funcionarioDTO.setTelefone( e.getTelefone() );
        funcionarioDTO.setDataNascimento( e.getDataNascimento() );
        funcionarioDTO.setCpf( e.getCpf() );
        funcionarioDTO.setRg( e.getRg() );
        funcionarioDTO.setEndereco( e.getEndereco() );
        funcionarioDTO.setCep( e.getCep() );
        funcionarioDTO.setUf( e.getUf() );
        funcionarioDTO.setCrm( e.getCrm() );
        funcionarioDTO.setCoren( e.getCoren() );

        return funcionarioDTO;
    }

    @Override
    public Funcionario toEntity(FuncionarioDTO d) {
        if ( d == null ) {
            return null;
        }

        Funcionario funcionario = new Funcionario();

        funcionario.setIdFuncionario( d.getIdFuncionario() );
        funcionario.setNome( d.getNome() );
        funcionario.setSexo( d.getSexo() );
        funcionario.setTelefone( d.getTelefone() );
        funcionario.setDataNascimento( d.getDataNascimento() );
        funcionario.setCpf( d.getCpf() );
        funcionario.setRg( d.getRg() );
        funcionario.setEndereco( d.getEndereco() );
        funcionario.setCep( d.getCep() );
        funcionario.setUf( d.getUf() );
        funcionario.setCrm( d.getCrm() );
        funcionario.setCoren( d.getCoren() );

        return funcionario;
    }
}
