package dev.pedrok.inventoryapi.DescricaoDoProduto;


import dev.pedrok.inventoryapi.Estoque.EstoqueModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DateTimeException;
import java.time.LocalDate;
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

    //@Column(unique = true) para deixar algo único no banco de dados
    private String tipo;

    private LocalDate dataDeValidadeDoProduto;


    //@OneToMany uma descrição pode ter vários produtos
    @OneToMany(mappedBy = "descricao")
    private List<EstoqueModel> produto;

}
