package br.com.exercicio.exercicio.Services.Cliente;

import br.com.exercicio.exercicio.Models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ClienteService {
    @Autowired
    ClienteRepositorys repository;

    @PostMapping
    public ResponseEntity saveCliente (@RequestBody Cliente cliente){
        Cliente cliente1 = new Cliente();
        cliente1.setNome(cliente.getNome());
        return ResponseEntity.ok().body(repository.save(cliente1));
    }

   // @Override

}
