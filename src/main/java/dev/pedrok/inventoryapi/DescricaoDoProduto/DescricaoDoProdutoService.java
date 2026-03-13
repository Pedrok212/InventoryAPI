package dev.pedrok.inventoryapi.DescricaoDoProduto;

import java.util.List;
import java.util.Optional;

public class DescricaoDoProdutoService {

    private DescricaoDoProdutoRepository descricaoDoProdutoRepository;

    public DescricaoDoProdutoService(DescricaoDoProdutoRepository descricaoDoProdutoRepository) {
        this.descricaoDoProdutoRepository = descricaoDoProdutoRepository;
    }


    //Deletar produto por ID - Tem que ser um metodo VOID porque nao precisa mostrar pro usuario

    public void deletarProdutoPorId(Long id) {
        descricaoDoProdutoRepository.deleteById(id);
    }


}