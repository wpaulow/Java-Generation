drop database if exists vitrinevirtual;

create database if not exists vitrinevirtual;

use vitrinevirtual;


insert into tbl_departamento (localizacao, nome) values ('secao 1', 'Cama/Mesa/Banho');
insert into tbl_departamento (localizacao, nome) values ('secao 2', 'Informatica');
insert into tbl_departamento (localizacao, nome) values ('secao 3', 'Alimentacao');
insert into tbl_departamento (localizacao, nome) values ('secao 3', 'Limpeza');
insert into tbl_departamento (localizacao, nome) values ('secao 4', 'Pets'); 


insert into tbl_produto (detalhes, linkFoto, nome, preco, departamento_id)
		values ('Almofada','./foto11.jpg','Almofada',10.00,1),
				('Colcha','./foto12.jpg','Colcha',20.00,1),
                ('Lencol','./foto13.jpg','Lencol',15.00,1),
                ('Computador','./foto14.jpg','Computador',1000.00,2),
                ('Mouse','./foto15.jpg','Mouse',30.00,2),
                ('Teclado','./foto23.jpg','Teclado',45.00,2),
                ('Feijao','./foto31.jpg','Feijao',10.00,3),
                ('Carne','./foto15.jpg','Carne',10.00,3),
                ('Detergente','./foto41.jpg','Detergente',2.00,4),
                ('Alvejante','./foto42.jpg','Alvejante',5.00,4),
                ('Rodo','./foto43.jpg','Rodo',8.00,4),
                ('Racao','./foto51.jpg','Racao',20.00,4),
                ('Coleira','./foto51.jpg','Coleira',10.00,5),
                ('Shampoo','./foto53.jpg','Shampoo',15.00,5);
        