use fj21;

create table contatos (
	id BIGINT NOT NULL AUTO_INCREMENT,
	nome VARCHAR(255),
	email VARCHAR(255),
	endereco VARCHAR(255),
	dataNascimento DATE,
    primary key (id)
);


create table funcionarios (
    id BIGINT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    usuario VARCHAR(255),
    senha VARCHAR(255),
    primary key (id)
);

