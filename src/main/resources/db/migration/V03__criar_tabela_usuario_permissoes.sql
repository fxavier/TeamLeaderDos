CREATE TABLE usuario (
	codigo BIGSERIAL,
	nome VARCHAR(50) NOT NULL,
	email VARCHAR(50) NOT NULL,
	senha VARCHAR(150) NOT NULL,
	PRIMARY KEY(codigo)
);

CREATE TABLE permissao (
	codigo BIGSERIAL,
	descricao VARCHAR(50) NOT NULL,
	PRIMARY KEY(codigo)
);

CREATE TABLE usuario_permissao (
	codigo_usuario BIGSERIAL NOT NULL,
	codigo_permissao BIGINT NOT NULL,
	PRIMARY KEY (codigo_usuario, codigo_permissao),
	CONSTRAINT fk_usuario_permissao
	   FOREIGN KEY (codigo_usuario) REFERENCES usuario(codigo),
	CONSTRAINT fk_permissao_usuario
	   FOREIGN KEY (codigo_permissao) REFERENCES permissao(codigo)
);

INSERT INTO usuario (codigo, nome, email, senha) values (1, 'Administrador', 'admin@creativehr.com', '$2a$10$X607ZPhQ4EgGNaYKt3n4SONjIv9zc.VMWdEuhCuba7oLAL5IvcL5.');
INSERT INTO usuario (codigo, nome, email, senha) values (2, 'Maria Silva', 'maria@creativehr.com', '$2a$10$Zc3w6HyuPOPXamaMhh.PQOXvDnEsadztbfi6/RyZWJDzimE8WQjaq');

INSERT INTO permissao (codigo, descricao) values (1, 'ROLE_CADASTRAR_ACTORES');
INSERT INTO permissao (codigo, descricao) values (2, 'ROLE_PESQUISAR_ACTORES');

INSERT INTO permissao (codigo, descricao) values (3, 'ROLE_CADASTRAR_USUARIOS');
INSERT INTO permissao (codigo, descricao) values (4, 'ROLE_REMOVER_USUARIO');
INSERT INTO permissao (codigo, descricao) values (5, 'ROLE_PESQUISAR_USUARIO');

INSERT INTO permissao (codigo, descricao) values (6, 'ROLE_CADASTRAR_TOTAIS');
INSERT INTO permissao (codigo, descricao) values (7, 'ROLE_REMOVER_TOTAIS');
INSERT INTO permissao (codigo, descricao) values (8, 'ROLE_PESQUISAR_TOTAIS');


INSERT INTO permissao (codigo, descricao) values (9, 'ROLE_CADASTRAR_DETALHES');
INSERT INTO permissao (codigo, descricao) values (10, 'ROLE_REMOVER_DETALHES');
INSERT INTO permissao (codigo, descricao) values (11, 'ROLE_PESQUISAR_DETALHES');

-- admin
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 1);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 2);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 3);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 4);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 5);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 6);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 7);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 8);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 9);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 10);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (1, 11);

-- maria
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (2, 2);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (2, 5);
INSERT INTO usuario_permissao (codigo_usuario, codigo_permissao) values (2, 8);