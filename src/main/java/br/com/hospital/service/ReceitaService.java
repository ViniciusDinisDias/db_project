package br.com.hospital.service;
import br.com.hospital.model.Receita;
import br.com.hospital.repository.ReceitaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class ReceitaService {
    private final ReceitaRepository repo;
    public ReceitaService(ReceitaRepository repo){this.repo=repo;}
    public List<Receita> listarTodos(){return repo.findAll();}
    public Optional<Receita> buscarPorId(Integer id){return repo.findById(id);}
    @Transactional public Receita salvar(Receita obj){return repo.save(obj);}
    @Transactional public void deletar(Integer id){repo.deleteById(id);}
}
