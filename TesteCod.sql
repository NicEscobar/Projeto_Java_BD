select * from personagem;
select * from corpo;
select * from usuario;

UPDATE personagem SET corpo_idCorpo = 1 where idPersonagem = 1;

INSERT INTO personagem (nomePersonagem,idadePersonagem,usuario_idUsuario,corpo_idCorpo) VALUES ("teste2",13,1, (SELECT MAX(idCorpo) FROM corpo));
SELECT MAX(idCorpo) FROM corpo;
Insert into corpo (numeroOrdem) values (0);