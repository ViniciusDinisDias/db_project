package br.com.hospital.service;
import br.com.hospital.model.Cargo;
import br.com.hospital.repository.CargoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class CargoService {
    private final CargoRepository repo;
    public CargoService(CargoRepository repo){this.repo=repo;}
    public List<Cargo> listarTodos(){return repo.findAll();}
    public Optional<Cargo> buscarPorId(Integer id){return repo.findById(id);}
    @Transactional public Cargo salvar(Cargo obj){return repo.save(obj);}
    @Transactional public void deletar(Integer id){repo.deleteById(id);}
}
