package br.com.hospital.repository;
import br.com.hospital.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SalaRepository extends JpaRepository<Sala, Integer> {}
