package br.com.exercicio.exercicio.Services.Cliente;

import br.com.exercicio.exercicio.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepositorys extends JpaRepository <Cliente, Long> {
    List<Cliente> findByNome(String nome);
}
