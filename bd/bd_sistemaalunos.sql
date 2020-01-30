drop database sistemaalunos;

create database sistemaalunos;

use sistemaalunos;

desc tbl_curso;
desc tbl_aluno;

insert into tbl_curso (nome, valormensal)
	values ("Administração", 250.00),
			("Ciência da Computação", 350.00),
            ("Odontologia",350.00),
            ("Direito", 400.00),
            ("Filosofia", -100.00),
            ("Pedagogia",200.00);
            
insert into tbl_aluno(linkfoto, nome, curso_codigocurso) 
	values ("https://www.professorisidro.com.br/wp-content/uploads/2017/09/Profgame045.jpg", "Fulano", 1),
			("https://www.professorisidro.com.br/wp-content/uploads/2017/09/Profgame045.jpg", "Fulaninho", 2),
            ("https://www.professorisidro.com.br/wp-content/uploads/2017/09/Profgame045.jpg", "Beltrano", 3),
            ("https://www.professorisidro.com.br/wp-content/uploads/2017/09/Profgame045.jpg", "Beltraninho", 4),
            ("https://www.professorisidro.com.br/wp-content/uploads/2017/09/Profgame045.jpg", "Ciclano", 5),
            ("https://www.professorisidro.com.br/wp-content/uploads/2017/09/Profgame045.jpg", "Ciclaninho", 6);
            
select * from tbl_aluno;
select * from tbl_curso;