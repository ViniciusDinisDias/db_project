package br.com.hospital.repository;
import br.com.hospital.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {}
