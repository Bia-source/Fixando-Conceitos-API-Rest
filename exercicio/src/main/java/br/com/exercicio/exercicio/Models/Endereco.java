package br.com.exercicio.exercicio.Models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="TB_ENDERECO")
public class Endereco {

    @Column(name="endereco")
    private String endereco;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cliente_endereco")
    private Long id;

}
