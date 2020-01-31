drop database if exists eureka_db; 
create database if not exists eureka_db; 

use eureka_db; 

create table tbl_cadastro_usuario (
	id_usuario integer not null auto_increment, 
	email varchar (100) not null,
	nome_usuario varchar (100) not null,
	senha varchar(32) not null,
    telefone varchar(20) not null,

	constraint pk_idusuario primary key (idusuario, email)
);

create table tbl_perfil_usuario(
	id_usuario integer not null,
	foto_perfil varchar(255),
	descricao text not null,

	constraint pk_id_usuario primary key (id_usuario),
	constraint fk_id_usuario foreign key (id_usuario) references tbl_cadastro_usuario (id_usuario)
);

create table tbl_postagem (
	id_postagem integer not null auto_increment,
    id_usuario integer not null,
    mensagem text not null,
    data_post date not null,
    
    constraint pk_id_postagem primary key (id_postagem),
    constraint fk_id_usuario_post foreign key (id_usuario) references tbl_cadastro_usuario(id_usuario)
);

create table tbl_comentario (
	id_comentario integer not null auto_increment,
    id_postagem integer not null,
	texto text not null,
    data_coment date,
    
    constraint pk_id_comentario primary key (id_comentario),
    constraint fk_id_postagem foreign key (id_postagem) references tbl_postagem (id_postagem)
);

create table tbl_fale_conosco (
	id_fale_conosco integer not null auto_increment,
    nome varchar (45) not null,
    sobrenome varchar (100) not null,
    telefone varchar(20) not null,
    mensagem text not null,
    
    constraint pk_id_fale_conosco primary key (id_fale_conosco)
);

