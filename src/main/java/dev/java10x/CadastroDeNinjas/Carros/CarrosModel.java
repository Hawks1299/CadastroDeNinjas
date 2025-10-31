package dev.java10x.CadastroDeNinjas.Carros;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "tb_carros")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String tipo;

    // @OneToMany um carro pode ter mais de uma pessoa
    @OneToMany(mappedBy = "carros")
    @JsonIgnore
    private List<NinjaModel> ninjas;

}
