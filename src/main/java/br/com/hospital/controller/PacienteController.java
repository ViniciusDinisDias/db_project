package br.com.hospital.controller;

import br.com.hospital.dto.PacienteDTO;
import br.com.hospital.mapper.PacienteMapper;
import br.com.hospital.model.Paciente;
import br.com.hospital.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/paciente")
public class PacienteController {

    private final PacienteService service;
    private final PacienteMapper mapper;

    public PacienteController(PacienteService service, PacienteMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public List<PacienteDTO> listar() {
        return service.listarTodos().stream()
                .map(mapper::toDto)
                .toList();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PacienteDTO> get(@PathVariable Integer id) {
        return service.buscarPorId(id)
                .map(mapper::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PacienteDTO> criar(@RequestBody PacienteDTO dto) {
        Paciente paciente = mapper.toEntity(dto);
        Paciente saved = service.salvar(paciente);
        URI location = URI.create("/api/paciente/" + saved.getIdPaciente());
        return ResponseEntity.created(location).body(mapper.toDto(saved));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PacienteDTO> atualizar(@PathVariable Integer id, @RequestBody PacienteDTO dto) {
        dto.setIdPaciente(id);
        Paciente paciente = mapper.toEntity(dto);
        Paciente updated = service.salvar(paciente);
        return ResponseEntity.ok(mapper.toDto(updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
