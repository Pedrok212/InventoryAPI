package dev.pedrok.inventoryapi.DescricaoDoProduto;

import dev.pedrok.inventoryapi.Estoque.EstoqueModel;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DescricaoDoProdutoService {

    private DescricaoDoProdutoRepository descricaoDoProdutoRepository;

    public DescricaoDoProdutoService(DescricaoDoProdutoRepository descricaoDoProdutoRepository) {
        this.descricaoDoProdutoRepository = descricaoDoProdutoRepository;
    }


    //Deletar produto por ID - Tem que ser um metodo VOID porque nao precisa mostrar pro usuario

    public void deletarProdutoPorId(Long id) {
        descricaoDoProdutoRepository.deleteById(id);
    }

    // Atualizar produto

    public DescricaoDoProdutoModel atualizarDescricao(Long id, DescricaoDoProdutoModel descricaoAtualizada) {
        if (descricaoDoProdutoRepository.existsById(id)) {
            descricaoAtualizada.setId(id);
            return descricaoDoProdutoRepository.save(descricaoAtualizada);
        }
        return null;
    }
}