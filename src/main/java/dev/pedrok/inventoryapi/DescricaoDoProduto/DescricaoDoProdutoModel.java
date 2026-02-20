package dev.pedrok.inventoryapi.DescricaoDoProduto;


import dev.pedrok.inventoryapi.Estoque.EstoqueModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table (name = "tb_descricao")
@NoArgsConstructor
@AllArgsConstructor
//@Data para criar os getters e os setters
@Data
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
