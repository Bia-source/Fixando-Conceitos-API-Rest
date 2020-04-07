package br.com.exercicio.exercicio.Controllers;

import br.com.exercicio.exercicio.Models.Cliente;
import br.com.exercicio.exercicio.Services.Cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class ClienteController {

    @Autowired
    ClienteService service;

    @PostMapping("/create")
    public ResponseEntity<?> salvarCliente (@RequestBody Cliente cliente ){
     return service.saveCliente(cliente);
    }

  //  @GetMapping("/see")
    //public  ResponseEntity<?> mostrar(@RequestParam Long id ){

    //}
}
