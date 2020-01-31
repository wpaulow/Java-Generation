
/*Consultas Simples*/

select nomeUsuario from tbl_cadastroUsuario where idUsuario = 3;
select nome, sobrenome, mensagem from tbl_faleConosco where idFaleConosco =7; 
select email from tbl_cadastroUsuario where idUsuario = 5; 

/*Consultas com inner join*/

select tbl_cadastroUsuario.nomeUsuario as "Nome do Usuário", tbl_postagem.mensagem as "Mensagem"
from tbl_cadastroUsuario 
inner join tbl_postagem using(idUsuario); 

select tbl_cadastroUsuario.nomeUsuario as "Nome do Usuário", tbl_perfilUsuario.descricao as "Descrição do Usuário"
from tbl_cadastroUsuario
inner join tbl_perfilUsuario using (idUsuario);
        
select tbl_cadastroUsuario.email as "E-mail", tbl_comentario.texto as "Comentário" 
from tbl_cadastroUsuario 
inner join tbl_postagem using(idUsuario)
inner join tbl_comentario using(idPostagem)
;
        
        



