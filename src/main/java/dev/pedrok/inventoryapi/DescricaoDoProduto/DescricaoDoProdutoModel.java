package dev.pedrok.inventoryapi.DescricaoDoProduto;


import dev.pedrok.inventoryapi.Estoque.EstoqueModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_descricao")
public class DescricaoDoProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String tipo;


    //@OneToMany uma descrição pode ter vários produtos
    @OneToMany(mappedBy = "descricao")
    private List<EstoqueModel> produto;

}
