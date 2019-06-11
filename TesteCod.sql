select * from personagem;
select * from corpo;
select * from usuario;
select * from instituto;
select * from instituto_has_personagem;

UPDATE personagem SET corpo_idCorpo = 1 where idPersonagem = 1;


INSERT INTO personagem (nomePersonagem,idadePersonagem,usuario_idUsuario,corpo_idCorpo) VALUES ("teste2",13,1, (SELECT MAX(idCorpo) FROM corpo));

insert into instituto (nomeInstituto,cidade,cursoInstituto) values ("ina","sant","gec");
insert into instituto_has_personagem(instituto_idInstituto,personagem_idPersonagem) values((select MAX(idInstituto) FROM instituto,(select MAX(idPersonagem) FROM personagem)));
insert into instituto_has_personagem(personagem_idPersonagem) values((select MAX(idPersonagem) FROM personagem));

insert into instituto_has_personagem(personagem_idPersonagem,instituto_idInstituto) values((select MAX(idPersonagem) FROM personagem),(select MAX(idInstituto) FROM instituto));

delete from personagem where idPersonagem = 1;

select MAX(idInstituto) FROM instituto;
select MAX(idPersonagem) FROM personagem;


SELECT MAX(idCorpo) FROM corpo;
Insert into corpo (numeroOrdem) values (0);