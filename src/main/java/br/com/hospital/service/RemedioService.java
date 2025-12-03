package br.com.hospital.service;
import br.com.hospital.model.Remedio;
import br.com.hospital.repository.RemedioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class RemedioService {
    private final RemedioRepository repo;
    public RemedioService(RemedioRepository repo){this.repo=repo;}
    public List<Remedio> listarTodos(){return repo.findAll();}
    public Optional<Remedio> buscarPorId(Integer id){return repo.findById(id);}
    @Transactional public Remedio salvar(Remedio obj){return repo.save(obj);}
    @Transactional public void deletar(Integer id){repo.deleteById(id);}
}
