package dev.pedrok.inventoryapi.Estoque;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class EstoqueController {

    private EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Primeira mensagem na rota";
    }

    // Adicionar produto (CREATE)
    @PostMapping("/criarProduto")
    public EstoqueModel criarProduto(@RequestBody EstoqueModel produto){
        return estoqueService.criarProduto(produto);
    }

    // Procurar produtos tanto por nome, quanto por código(READ)
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
