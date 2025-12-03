package br.com.hospital.service;
import br.com.hospital.model.Estoque;
import br.com.hospital.repository.EstoqueRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class EstoqueService {
    private final EstoqueRepository repo;
    public EstoqueService(EstoqueRepository repo){this.repo=repo;}
    public List<Estoque> listarTodos(){return repo.findAll();}
    public Optional<Estoque> buscarPorId(Integer id){return repo.findById(id);}
    @Transactional public Estoque salvar(Estoque obj){return repo.save(obj);}
    @Transactional public void deletar(Integer id){repo.deleteById(id);}
}
