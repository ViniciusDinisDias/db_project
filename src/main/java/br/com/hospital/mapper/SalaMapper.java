package br.com.hospital.mapper;

import br.com.hospital.model.Sala;
import br.com.hospital.dto.SalaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SalaMapper {
    SalaDTO toDTO(Sala entity);
    Sala toEntity(SalaDTO dto);
}
