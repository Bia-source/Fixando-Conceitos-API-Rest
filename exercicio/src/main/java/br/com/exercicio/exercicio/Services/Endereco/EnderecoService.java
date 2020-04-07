package br.com.exercicio.exercicio.Services.Endereco;

import br.com.exercicio.exercicio.Models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class EnderecoService {

    @Autowired
    EnderecoRepositorys repository;

    @PostMapping
    public ResponseEntity salvarCliente (@RequestBody Cliente cliente){
        Cliente cliente1 = new Cliente();
        cliente1.setNome(cliente.getNome());
        return ResponseEntity.ok().body(cliente1);
    }


}
