#______Create and initialize database
create database db_registro;
use db_registro;

#______Create: tabela de estudantes com 5 atributos
create table tb_estudantes(
id bigint auto_increment,
nome varchar(255) not null,
idade int not null,
ano varchar(50),
media double not null,
primary key(id)
);

#___Insert: inserindo 8 dados (registros)
insert into tb_estudantes (nome,idade,ano,media)
value ("Dwight Schrute",15,"2ºA",7.3);
insert into tb_estudantes (nome,idade,ano,media)
value ("Michael Scott",16,"2ºA",9.2);
insert into tb_estudantes (nome,idade,ano,media)
value ("Kelly Kapoor",15,"2ºB",8.6);
insert into tb_estudantes (nome,idade,ano,media)
value ("Kevin Malone",13,"1ºA",5.8);
insert into tb_estudantes (nome,idade,ano,media)
value ("Jim Halpert",15,"2ºB",7.8);
insert into tb_estudantes (nome,idade,ano,media)
value ("Erin Hannon ",14,"2ºC",6.3);
insert into tb_estudantes (nome,idade,ano,media)
value ("Stanley Hudson",17,"3ºA",7.0);
insert into tb_estudantes (nome,idade,ano,media)
value ("Meredith Palmer",16,"1ºA",3.2);

#___Select: estudantes com media maior que 7.0
select * from tb_estudantes where media >= 7.0;

#___Select: estudantes com media menor que 7.0
select * from tb_estudantes where media < 7.0;

#___Update: corrigindo media do estudante Michael
update tb_estudantes
set media = 7.1
where id = 2;

#___Visualizing
select * from tb_estudantes;