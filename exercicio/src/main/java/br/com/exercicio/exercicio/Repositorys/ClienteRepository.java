package br.com.exercicio.exercicio.Repositorys;

import br.com.exercicio.exercicio.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository <Cliente ,Long> {
     List<Cliente> findByName(String nome);
     Optional<Cliente> findById(Long id);
}
