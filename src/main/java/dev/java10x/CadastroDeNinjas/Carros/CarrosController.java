package dev.java10x.CadastroDeNinjas.Carros;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("carros")
public class CarrosController {

    // GET -- Mandar uma requisicao para mostrar as missoes
    @GetMapping("/listar")
    public String listarCarros() {
        return "Carros listados com sucesso";
    }

    // POST -- Mandar uma requisicao para criar as missoes
    @PostMapping("/criar")
    public String criarCarro() {
        return "Carro criado com sucesso";
    }

    // PUT -- Mandar uma requisicao para alterar as missoes
    @PutMapping("/alterar")
    public String alterarCarro() {
        return "Carro alterado com sucesso";
    }

    // DELETE -- Mandar uma requisicao para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarCarro() {
        return "Carro deletado com sucesso";
    }

}
