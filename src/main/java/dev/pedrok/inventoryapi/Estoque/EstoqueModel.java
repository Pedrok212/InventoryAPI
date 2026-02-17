package dev.pedrok.inventoryapi.Estoque;

import dev.pedrok.inventoryapi.DescricaoDoProduto.DescricaoDoProdutoModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
public class EstoqueModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

   private String nomeDoProduto;

   private int quantidade;

   private List<DescricaoDoProdutoModel> descricaoDoProduto;

   private String fornecedor;

   private double precoDoProduto;

   // @ManyToOne um produto tem uma unica descricao
   @ManyToOne
   @JoinColumn(name = "descricao_id") //Foreign Key ou Chave Estrangeira
   private DescricaoDoProdutoModel descricao;

    public EstoqueModel(){

    }

    public EstoqueModel(String nomeDoProduto, String descricaoDoProduto, int quantidade, String fornecedor, double precoDoProduto) {
        this.nomeDoProduto = EstoqueModel;
        this.descricaoDoProduto = descricaoDoProduto;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.precoDoProduto = precoDoProduto;
    }

    public String getNome() {
        return nomeDoProduto;
    }

    public void setNome(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricaoDoProduto() {
        return descricaoDoProduto;
    }

    public void setDescricaoDoProduto(List<DescricaoDoProdutoModel> descricaoDoProduto) {
        this.descricaoDoProduto = descricaoDoProduto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }
}
