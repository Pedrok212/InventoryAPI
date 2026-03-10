package dev.pedrok.inventoryapi.DescricaoDoProduto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("descricao")
public class DescricaoDoProdutoController {



    @PostMapping("/criar")
    public String criarDescricao() {
        return "Descrição criada com sucesso";
    }

    @PutMapping("/alterar")
    public String alterarDescricao() {
        return "Descrição alterada com sucesso";
    }

    @DeleteMapping("/delete")
    public String deletarDescricao() {
        return "Descrição deletada com sucesso";
    }

    @GetMapping("/listar")
    public String listarDescricao() {
        return "Descrição listada com sucesso";
    }
}
