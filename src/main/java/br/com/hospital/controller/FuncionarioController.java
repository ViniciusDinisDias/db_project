package br.com.hospital.controller;
import br.com.hospital.model.Funcionario;
import br.com.hospital.dto.FuncionarioDTO;
import br.com.hospital.mapper.FuncionarioMapper;
import br.com.hospital.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/api/funcionario")
public class FuncionarioController {
    private final FuncionarioService service;
    private final FuncionarioMapper mapper;
    public FuncionarioController(FuncionarioService service, FuncionarioMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<Funcionario> listar(){return service.listarTodos();}
    @GetMapping("/{id}")
    public ResponseEntity<Funcionario> get(@PathVariable Integer id){return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
    @PostMapping
    public ResponseEntity<Funcionario> criar(@RequestBody Funcionario obj){Funcionario saved = service.salvar(obj); return ResponseEntity.created(URI.create("/api/funcionario/"+saved.getIdFuncionario())).body(saved);}
    @PutMapping("/{id}")
    public ResponseEntity<Funcionario> atualizar(@PathVariable Integer id, @RequestBody Funcionario obj){obj.setIdFuncionario(id); return ResponseEntity.ok(service.salvar(obj));}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){service.deletar(id); return ResponseEntity.noContent().build();}
}
