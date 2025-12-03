package br.com.hospital.repository;
import br.com.hospital.model.Remedio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RemedioRepository extends JpaRepository<Remedio, Integer> {}
