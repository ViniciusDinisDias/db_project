package br.com.hospital.service;
import br.com.hospital.model.Paciente;
import br.com.hospital.repository.PacienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;
@Service
public class PacienteService {
    private final PacienteRepository repo;
    public PacienteService(PacienteRepository repo){this.repo=repo;}
    public List<Paciente> listarTodos(){return repo.findAll();}
    public Optional<Paciente> buscarPorId(Integer id){return repo.findById(id);}
    @Transactional public Paciente salvar(Paciente obj){return repo.save(obj);}
    @Transactional public void deletar(Integer id){repo.deleteById(id);}
}
