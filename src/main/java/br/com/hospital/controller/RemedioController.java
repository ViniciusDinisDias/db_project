package br.com.hospital.controller;
import br.com.hospital.model.Remedio;
import br.com.hospital.dto.RemedioDTO;
import br.com.hospital.mapper.RemedioMapper;
import br.com.hospital.service.RemedioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/api/remedio")
public class RemedioController {
    private final RemedioService service;
    private final RemedioMapper mapper;
    public RemedioController(RemedioService service, RemedioMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<Remedio> listar(){return service.listarTodos();}
    @GetMapping("/{id}")
    public ResponseEntity<Remedio> get(@PathVariable Integer id){return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
    @PostMapping
    public ResponseEntity<Remedio> criar(@RequestBody Remedio obj){Remedio saved = service.salvar(obj); return ResponseEntity.created(URI.create("/api/remedio/"+saved.getIdRemedio())).body(saved);}
    @PutMapping("/{id}")
    public ResponseEntity<Remedio> atualizar(@PathVariable Integer id, @RequestBody Remedio obj){obj.setIdRemedio(id); return ResponseEntity.ok(service.salvar(obj));}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){service.deletar(id); return ResponseEntity.noContent().build();}
}
