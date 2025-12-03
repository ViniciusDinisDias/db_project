package br.com.hospital.controller;
import br.com.hospital.model.Cargo;
import br.com.hospital.dto.CargoDTO;
import br.com.hospital.mapper.CargoMapper;
import br.com.hospital.service.CargoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.List;
@RestController
@RequestMapping("/api/cargo")
public class CargoController {
    private final CargoService service;
    private final CargoMapper mapper;
    public CargoController(CargoService service, CargoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @GetMapping
    public List<Cargo> listar(){return service.listarTodos();}
    @GetMapping("/{id}")
    public ResponseEntity<Cargo> get(@PathVariable Integer id){return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());}
    @PostMapping
    public ResponseEntity<Cargo> criar(@RequestBody Cargo obj){Cargo saved = service.salvar(obj); return ResponseEntity.created(URI.create("/api/cargo/"+saved.getIdCargo())).body(saved);}
    @PutMapping("/{id}")
    public ResponseEntity<Cargo> atualizar(@PathVariable Integer id, @RequestBody Cargo obj){obj.setIdCargo(id); return ResponseEntity.ok(service.salvar(obj));}
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Integer id){service.deletar(id); return ResponseEntity.noContent().build();}
}
