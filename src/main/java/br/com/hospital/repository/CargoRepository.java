package br.com.hospital.repository;
import br.com.hospital.model.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CargoRepository extends JpaRepository<Cargo, Integer> {}
