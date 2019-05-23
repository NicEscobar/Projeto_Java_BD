USE mydb;

INSERT INTO corpo (cor) values ("preto");
INSERT INTO usuario (nomeUsuario,senha,sexo, email) values ("Nicole",123,true,"n@hotm");
INSERT INTO personagem (nomePersonagem, personagem_idUsuario, personagem_idCorpo) values ("Mario",1,1);

DELETE from corpo where idCorpo = 1; 

SELECT * FROM corpo;
SELECT * FROM personagem;
SELECT * FROM usuario;