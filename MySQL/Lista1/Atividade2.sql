#____creating database
create database db_ecommerce;
use db_ecommerce;
#____DDL (5 attributes)
create table tb_produtos (
id bigint auto_increment,
nome varchar (255) not null,
tamanho varchar(10) not null,
cor char(100) not null,
valor double not null,
estoque int not null,
primary key (id)
);
#____DML (8 data)
insert into tb_produtos (nome,tamanho,cor,valor,estoque)
values ("Camisa - Homem da meia noite","M","Preta",200,1500),
("Camisa - Galo da Madrugada","P","Rosa",250,1000),
("Camisa - Bloco Generation","G","Laranja",180,200),
("Camisa - Eu acho eh pouco","M","Vermelha",300,1200),
("Camisa - Amantes de Gloria","G","Verde",250,800),
("Camisa - Bloco da Lama","P","Bege",250,600),
("Camisa - Bloco da Saudade","GG","Branca",280,1150),
("Camisa - Vassourinhas de Olinda","P","Azul",220,900);
#____SELECT: valor produto > 230
select * from tb_produtos where valor > 230;
#____SELECT: valor produto < 230
select * from tb_produtos where valor < 230;
#____Updating
update tb_produtos set estoque = 800 where id = 2;
#____Visualizing
select * from tb_produtos;