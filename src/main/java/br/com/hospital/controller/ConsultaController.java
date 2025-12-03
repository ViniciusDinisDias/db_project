package br.com.hospital.controller;
import br.com.hospital.model.Consulta;
import br.com.hospital.dto.ConsultaDTO;
import br.com.hospital.mapper.ConsultaMapper;
import br.com.hospital.service.ConsultaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/api/consulta")
public class ConsultaController {
    private final ConsultaService service;
    private final ConsultaMapper mapper;
    public ConsultaController(ConsultaService service, ConsultaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<Consulta> listar(){return service.listarTodos();}
    @GetMapping("/{id}")
    public ResponseEntity<Consulta> get(@PathVariable Integer id){return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
    @PostMapping
    public ResponseEntity<Consulta> criar(@RequestBody Consulta obj){Consulta saved = service.salvar(obj); return ResponseEntity.created(URI.create("/api/consulta/"+saved.getIdConsulta())).body(saved);}
    @PutMapping("/{id}")
    public ResponseEntity<Consulta> atualizar(@PathVariable Integer id, @RequestBody Consulta obj){obj.setIdConsulta(id); return ResponseEntity.ok(service.salvar(obj));}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){service.deletar(id); return ResponseEntity.noContent().build();}
}
