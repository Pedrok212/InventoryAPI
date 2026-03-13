package dev.pedrok.inventoryapi.DescricaoDoProduto;

import dev.pedrok.inventoryapi.Estoque.EstoqueModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescricaoDoProdutoRepository extends JpaRepository<DescricaoDoProdutoModel, Long> {
}
