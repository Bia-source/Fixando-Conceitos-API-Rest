package br.com.exercicio.exercicio.Controllers;

import br.com.exercicio.exercicio.Models.Cliente;
import br.com.exercicio.exercicio.Services.Cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ClienteController {

    @Autowired
    ClienteService service;

    @PostMapping("/create")
    public ResponseEntity<?> salvarCliente (@RequestBody Cliente cliente ){
     return ResponseEntity.ok().body(service.saveCliente(cliente));
    }

  //  @GetMapping("/see")
    //public  ResponseEntity<?> mostrar(@RequestParam Long id ){

    //}
}
