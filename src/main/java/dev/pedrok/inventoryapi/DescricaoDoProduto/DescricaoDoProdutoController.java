package dev.pedrok.inventoryapi.DescricaoDoProduto;

import dev.pedrok.inventoryapi.Estoque.EstoqueModel;
import dev.pedrok.inventoryapi.Estoque.EstoqueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("descricao")
public class DescricaoDoProdutoController {

    private final EstoqueService estoqueService;

    public DescricaoDoProdutoController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    @GetMapping("/produtos/{id}")
    public EstoqueModel mostrarProdutosPorId(@PathVariable Long id){
        return estoqueService.listarProdutosPorId(id);
    }

    //Mostrar os produtos por sessão, mercearia, congelados, higiene(READ)

    @GetMapping("/produtos")
    public List<EstoqueModel> listarProduto(){
        return estoqueService.listarProdutos();
    }

    // Alterar alguma coisa do produto caso seja necessário(UPDATE)
    @PutMapping("/alterarInfoProduto")
    public String alterarProduto(){
        return "Alterar alguma coisa do produto";
    }

    // Deletar produto que a empresa não vende mais(DELETE)
    @DeleteMapping("/excluir/{id}")
    public void excluirProduto(@PathVariable Long id){
        estoqueService.deletarProdutoPorId(id);
    }

}
