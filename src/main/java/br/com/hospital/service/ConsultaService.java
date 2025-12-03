package br.com.hospital.service;
import br.com.hospital.model.Consulta;
import br.com.hospital.repository.ConsultaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class ConsultaService {
    private final ConsultaRepository repo;
    public ConsultaService(ConsultaRepository repo){this.repo=repo;}
    public List<Consulta> listarTodos(){return repo.findAll();}
    public Optional<Consulta> buscarPorId(Integer id){return repo.findById(id);}
    @Transactional public Consulta salvar(Consulta obj){return repo.save(obj);}
    @Transactional public void deletar(Integer id){repo.deleteById(id);}
}
