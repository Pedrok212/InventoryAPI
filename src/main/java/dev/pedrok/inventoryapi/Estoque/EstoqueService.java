package dev.pedrok.inventoryapi.Estoque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {
    
    private EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    //Listar todos produtos

    public List<EstoqueModel> listarProdutos(){

        return estoqueRepository.findAll();

    }

    //Listar produtos por ID

    public EstoqueModel listarProdutosPorId(Long id){
        Optional<EstoqueModel> produtoPorId = estoqueRepository.findById(id);
        return produtoPorId.orElse(null);
    }

    // Criar um novo produto

    public EstoqueModel criarProduto(EstoqueModel produto){
        return estoqueRepository.save(produto);
    }


    //Deletar produto por ID - Tem que ser um metodo VOID porque nao precisa mostrar pro usuario

    public void deletarProdutoPorId(Long id){
         estoqueRepository.deleteById(id);
    }
}
