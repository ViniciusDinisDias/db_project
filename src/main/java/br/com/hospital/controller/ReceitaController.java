package br.com.hospital.controller;
import br.com.hospital.model.Receita;
import br.com.hospital.dto.ReceitaDTO;
import br.com.hospital.mapper.ReceitaMapper;
import br.com.hospital.service.ReceitaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/api/receita")
public class ReceitaController {
    private final ReceitaService service;
    private final ReceitaMapper mapper;
    public ReceitaController(ReceitaService service, ReceitaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<Receita> listar(){return service.listarTodos();}
    @GetMapping("/{id}")
    public ResponseEntity<Receita> get(@PathVariable Integer id){return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
    @PostMapping
    public ResponseEntity<Receita> criar(@RequestBody Receita obj){Receita saved = service.salvar(obj); return ResponseEntity.created(URI.create("/api/receita/"+saved.getIdReceita())).body(saved);}
    @PutMapping("/{id}")
    public ResponseEntity<Receita> atualizar(@PathVariable Integer id, @RequestBody Receita obj){obj.setIdReceita(id); return ResponseEntity.ok(service.salvar(obj));}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){service.deletar(id); return ResponseEntity.noContent().build();}
}
