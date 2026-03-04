-- V2: Migration para adicionar a coluna de Validade na tabela de descrição

ALTER TABLE tb_descricao ADD COLUMN data_de_validade_do_produto DATE;