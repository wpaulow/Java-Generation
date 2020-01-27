
insert into departamento values (null, 'Desenvolvimento', 1);
insert into departamento values (null, 'Administracao', 2);
insert into departamento values (null, 'Infra', 3);
insert into departamento values (null, 'Suporte', 4);
insert into departamento values (null, 'RH', 5);

insert into funcionario values (null, 'Funcionario 1-1', 'email11@firma.com', '1111-1111', 1);
insert into funcionario values (null, 'Funcionario 1-2', 'email12@firma.com', '1111-1111', 1);
insert into funcionario values (null, 'Funcionario 2-1', 'email21@firma.com', '1111-1111', 2);
insert into funcionario values (null, 'Funcionario 2-2', 'email22@firma.com', '1111-1111', 2);
insert into funcionario values (null, 'Funcionario 3-1', 'email31@firma.com', '1111-1111', 3);
insert into funcionario values (null, 'Funcionario 3-2', 'email32@firma.com', '1111-1111', 3);
insert into funcionario values (null, 'Funcionario 4-1', 'email41@firma.com', '1111-1111', 4);
insert into funcionario values (null, 'Funcionario 4-2', 'email42@firma.com', '1111-1111', 4);
insert into funcionario values (null, 'Funcionario 5-1', 'email51@firma.com', '1111-1111', 5);
insert into funcionario values (null, 'Funcionario 5-2', 'email52@firma.com', '1111-1111', 5);
insert into funcionario values (null, 'Funcionario 6-1', 'email61@firma.com', '1111-1111', null);
insert into funcionario values (null, 'Funcionario 6-2', 'email62@firma.com', '1111-1111', null);

insert into projeto values (null, 'Projeto 1', '2020-01-01', 1, 'Cliente 1');
insert into projeto values (null, 'Projeto 2', '2020-01-01', 2, 'Cliente 2');
insert into projeto values (null, 'Projeto 3', '2020-01-01', 3, 'Cliente 3');


insert into projeto_funcionario values (1, 1, '2020-01-01','2020-12-31');
insert into projeto_funcionario values (5, 1, '2020-01-01','2020-12-31');
insert into projeto_funcionario values (8, 1, '2020-01-01','2020-12-31');

insert into projeto_funcionario values (2, 2, '2020-01-10','2020-12-31');
insert into projeto_funcionario values (6, 2, '2020-01-10','2020-12-31');
insert into projeto_funcionario values (7, 2, '2020-01-10','2020-12-31');

insert into projeto_funcionario values (3, 3, '2020-01-20' ,'2020-12-31');
insert into projeto_funcionario values (9, 3, '2020-01-20','2020-12-31');
