package br.com.hospital.mapper;

import br.com.hospital.dto.EstoqueDTO;
import br.com.hospital.model.Estoque;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-01T16:21:59-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class EstoqueMapperImpl implements EstoqueMapper {

    @Override
    public EstoqueDTO toDTO(Estoque entity) {
        if ( entity == null ) {
            return null;
        }

        EstoqueDTO estoqueDTO = new EstoqueDTO();

        estoqueDTO.setIdEstoque( entity.getIdEstoque() );
        estoqueDTO.setQuantidade( entity.getQuantidade() );
        estoqueDTO.setDataEntrada( entity.getDataEntrada() );
        estoqueDTO.setDataValidade( entity.getDataValidade() );

        return estoqueDTO;
    }

    @Override
    public Estoque toEntity(EstoqueDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Estoque estoque = new Estoque();

        estoque.setIdEstoque( dto.getIdEstoque() );
        estoque.setQuantidade( dto.getQuantidade() );
        estoque.setDataEntrada( dto.getDataEntrada() );
        estoque.setDataValidade( dto.getDataValidade() );

        return estoque;
    }
}
