package br.com.exercicio.exercicio.Controllers;

import br.com.exercicio.exercicio.Models.Cliente;
import br.com.exercicio.exercicio.Repositorys.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClienteController {

    @Autowired
    ClienteRepository repository;

    @PostMapping
    public ResponseBody salvarCliente (@RequestBody Cliente cliente ){

    }
}
