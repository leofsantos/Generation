#______creating & using
create database db_rh;
use db_rh;
#______DDL
create table tb_colaboradores (
	id bigint auto_increment,
	nome varchar(100) not null,
	idade int not null,
	salario double not null,
	cargo varchar(100) not null,
	nivel varchar(100),
	primary key (id)
);
#_____DML
insert into tb_colaboradores (nome,idade,salario,cargo,nivel)
value ("Leonardo",26,5000,"Dev","Jr");
insert into tb_colaboradores (nome,idade,salario,cargo,nivel)
value ("Maria",30,8000,"Dev","Pleno");
insert into tb_colaboradores (nome,idade,salario,cargo,nivel)
value ("Kelly",28,17500,"Scrum Master","Avançado");
insert into tb_colaboradores (nome,idade,salario,cargo,nivel)
value ("Lucio",40,1500,"Manutenção e Limpeza","Avançado");
insert into tb_colaboradores (nome,idade,salario,cargo,nivel)
value ("Debora",33,1750,"Estagiaria","Iniciante");

#_____Visualizing
select * from tb_colaboradores;

#____SELECT: colaboradores com salario > 2000
select * from tb_colaboradores where salario > 2000;
#____SELECT: colaboradores com salario < 2000
select * from tb_colaboradores where salario < 2000;
#____Updating
update tb_colaboradores set idade = 27 where id = 1;