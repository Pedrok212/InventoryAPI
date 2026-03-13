package dev.pedrok.inventoryapi.DescricaoDoProduto;

import dev.pedrok.inventoryapi.Estoque.EstoqueModel;
import dev.pedrok.inventoryapi.Estoque.EstoqueService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("descricao")
public class DescricaoDoProdutoController {

    private final EstoqueService estoqueService;
    private final DescricaoDoProdutoService descricaoService;

    public DescricaoDoProdutoController(EstoqueService estoqueService,
                                        DescricaoDoProdutoService descricaoService) {
        this.estoqueService = estoqueService;
        this.descricaoService = descricaoService;
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
    @PutMapping("/alterarInfoProduto/{id}")
    public DescricaoDoProdutoModel alterarProduto(@PathVariable Long id,
                                                  @RequestBody DescricaoDoProdutoModel produtoAtualizado) {
        return descricaoService.atualizarDescricao(id, produtoAtualizado);
    }

    // Deletar produto que a empresa não vende mais(DELETE)
    @DeleteMapping("/excluir/{id}")
    public void excluirProduto(@PathVariable Long id){
        estoqueService.deletarProdutoPorId(id);
    }

}
