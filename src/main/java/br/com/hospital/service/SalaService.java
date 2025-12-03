package br.com.hospital.service;
import br.com.hospital.model.Sala;
import br.com.hospital.repository.SalaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class SalaService {
    private final SalaRepository repo;
    public SalaService(SalaRepository repo){this.repo=repo;}
    public List<Sala> listarTodos(){return repo.findAll();}
    public Optional<Sala> buscarPorId(Integer id){return repo.findById(id);}
    @Transactional public Sala salvar(Sala obj){return repo.save(obj);}
    @Transactional public void deletar(Integer id){repo.deleteById(id);}
}
