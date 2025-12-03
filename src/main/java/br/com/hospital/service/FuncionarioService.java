package br.com.hospital.service;
import br.com.hospital.model.Funcionario;
import br.com.hospital.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class FuncionarioService {
    private final FuncionarioRepository repo;
    public FuncionarioService(FuncionarioRepository repo){this.repo=repo;}
    public List<Funcionario> listarTodos(){return repo.findAll();}
    public Optional<Funcionario> buscarPorId(Integer id){return repo.findById(id);}
    @Transactional public Funcionario salvar(Funcionario obj){return repo.save(obj);}
    @Transactional public void deletar(Integer id){repo.deleteById(id);}
}
