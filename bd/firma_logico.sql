drop database if exists firma;
create database if not exists firma;
use firma;

create table departamento (
	idDepto integer not null auto_increment,
    nomeDepto varchar(100) not null,
    andar varchar(10),
    constraint pk_idDepto primary key (idDepto)
);

create table funcionario (
	idFunc integer not null auto_increment,
    nomeFunc varchar(100) not null,
    email varchar(100) not null, 
    telefone varchar(20) not null, 
    idDepto integer,
    constraint pk_idFunc primary key (idFunc),
    constraint fk_idDepto foreign key (idDepto) references departamento (idDepto)
);

create table projeto (
	idProj integer not null auto_increment, 
    titulo varchar(100) not null,
    dataInicio date not null,
    numCont integer not null,
    cliente varchar(100) not null,
    constraint pk_idProj primary key (idProj)
);

create table projeto_funcionario (
	idFunc integer not null,
    idProj integer not null,
    dataInicio date not null,
    dataTermino date not null,
    constraint pk_projeto_funcionario primary key(idFunc, idProj, dataInicio),
    constraint fk_func foreign key (idFunc) references funcionario(idFunc),
    constraint fk_proj foreign key (idProj) references projeto(idProj)
);

