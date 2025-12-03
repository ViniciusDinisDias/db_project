package br.com.hospital.controller;
import br.com.hospital.model.Estoque;
import br.com.hospital.dto.EstoqueDTO;
import br.com.hospital.mapper.EstoqueMapper;
import br.com.hospital.service.EstoqueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/api/estoque")
public class EstoqueController {
    private final EstoqueService service;
    private final EstoqueMapper mapper;
    public EstoqueController(EstoqueService service, EstoqueMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<Estoque> listar(){return service.listarTodos();}
    @GetMapping("/{id}")
    public ResponseEntity<Estoque> get(@PathVariable Integer id){return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
    @PostMapping
    public ResponseEntity<Estoque> criar(@RequestBody Estoque obj){Estoque saved = service.salvar(obj); return ResponseEntity.created(URI.create("/api/estoque/"+saved.getIdEstoque())).body(saved);}
    @PutMapping("/{id}")
    public ResponseEntity<Estoque> atualizar(@PathVariable Integer id, @RequestBody Estoque obj){obj.setIdEstoque(id); return ResponseEntity.ok(service.salvar(obj));}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){service.deletar(id); return ResponseEntity.noContent().build();}
}
