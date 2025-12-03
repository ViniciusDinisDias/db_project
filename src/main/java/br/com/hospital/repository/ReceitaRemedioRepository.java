package br.com.hospital.repository;
import br.com.hospital.model.ReceitaRemedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ReceitaRemedioRepository extends JpaRepository<ReceitaRemedio, Integer> {}
