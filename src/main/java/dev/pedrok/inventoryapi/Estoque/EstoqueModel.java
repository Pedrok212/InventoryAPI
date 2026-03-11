package dev.pedrok.inventoryapi.Estoque;

import dev.pedrok.inventoryapi.DescricaoDoProduto.DescricaoDoProdutoModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
//@Data para criar os getters e os setters
@Data
public class EstoqueModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


   private int quantidade;

   private String fornecedor;

   private double precoDoProduto;

   // @ManyToOne um produto tem uma unica descricao
   @ManyToOne(cascade = CascadeType.PERSIST)
   @JoinColumn(name = "descricao_id")//Foreign Key ou Chave Estrangeira
   private DescricaoDoProdutoModel descricao;

}
