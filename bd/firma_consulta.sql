/*2. Quais funcionários estão em cada departamento?*/

select nomeFunc, nomeDepto from funcionario inner join departamento using (idDepto);

/*3. Existem funcionários sem departamento atribuído? Quantos são?*/

select count(idFunc) as qntdFuncionarios from funcionario where iddepto is null;

/*4. Existem funcionários sem departamento atribuído? Quais são?*/

select * from funcionario where idDepto is null;

/*5. Quais funcionários estão trabalhando em quais projetos? */

select nomeFunc as 'funcionario' 
