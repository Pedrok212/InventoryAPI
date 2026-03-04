package dev.pedrok.inventoryapi.Estoque;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.*;

@RequestMapping
@RestController
public class EstoqueController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Primeira mensagem na rota";
    }

    // Adicionar produto (CREATE)
    @PostMapping("/criarProduto")
    public String criarProduto(){
        return "Produto criado";
    }

    // Procurar produtos tanto por nome, quanto por código(READ)
    @GetMapping("/procura")
    public String procurarProduto(){
        return "Caçando produto";
    }

    //Mostrar os produtos por sessão, mercearia, congelados, higiene(READ)

    @GetMapping("/produtos")
    public String mostrarProduto(){
        return "Mostrar produto por sessão";
    }

    // Alterar alguma coisa do produto caso seja necessário(UPDATE)
    @PutMapping("/alterarInfoProduto")
    public String alterarProduto(){
        return "Alterar alguma coisa do produto";
    }

    // Deletar produto que a empresa não vende mais(DELETE)
        @DeleteMapping("/excluirProduto")
        public String excluirProduto(){
            return "Tirar o produto de estoque";
        }
}
