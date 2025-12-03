package br.com.hospital.controller;
import br.com.hospital.model.Sala;
import br.com.hospital.dto.SalaDTO;
import br.com.hospital.mapper.SalaMapper;
import br.com.hospital.service.SalaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/api/sala")
public class SalaController {
    private final SalaService service;
    private final SalaMapper mapper;
    public SalaController(SalaService service, SalaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<Sala> listar(){return service.listarTodos();}
    @GetMapping("/{id}")
    public ResponseEntity<Sala> get(@PathVariable Integer id){return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
    @PostMapping
    public ResponseEntity<Sala> criar(@RequestBody Sala obj){Sala saved = service.salvar(obj); return ResponseEntity.created(URI.create("/api/sala/"+saved.getIdSala())).body(saved);}
    @PutMapping("/{id}")
    public ResponseEntity<Sala> atualizar(@PathVariable Integer id, @RequestBody Sala obj){obj.setIdSala(id); return ResponseEntity.ok(service.salvar(obj));}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){service.deletar(id); return ResponseEntity.noContent().build();}
}
