package br.com.exercicio.exercicio.Services.Cliente;

import br.com.exercicio.exercicio.Models.Cliente;
import br.com.exercicio.exercicio.Repositorys.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// joanna watala
@Service("ClienteService")
public class ClienteService {
    @Autowired
    ClienteRepository repository;

    @PostMapping
    public ResponseEntity saveCliente (@RequestBody Cliente cliente){
        Cliente cliente1 = new Cliente();
        cliente1.setNome(cliente.getNome());
        return ResponseEntity.ok().body(repository.save(cliente1));
    }

   // @Override

}
