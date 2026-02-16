package dev.pedrok.inventoryapi;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_cadastro")
public class EstoqueModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nomeDoProduto;
    int quantidade;
    String descricaoDoProduto;
    String fornecedor;
    double precoDoProduto;

    public EstoqueModel(){

    }

    public EstoqueModel(String nomeDoProduto, String descricaoDoProduto, int quantidade, String fornecedor, double precoDoProduto) {
        this.nomeDoProduto = EstoqueModel.this.nomeDoProduto;
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

    public void setDescricaoDoProduto(String descricaoDoProduto) {
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
