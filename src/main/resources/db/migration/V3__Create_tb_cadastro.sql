CREATE TABLE tb_cadastro (
                             id BIGINT AUTO_INCREMENT PRIMARY KEY,
                             quantidade INT,
                             fornecedor VARCHAR(255),
                             preco_do_produto DOUBLE,
                             descricao_id BIGINT,
                             FOREIGN KEY (descricao_id) REFERENCES tb_descricao(id)
);