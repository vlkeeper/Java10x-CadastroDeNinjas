-- V2: Migrations para adicionar RANK a tb_cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);