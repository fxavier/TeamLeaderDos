
CREATE TABLE distrito(
codigo BIGSERIAL NOT NULL,
nome VARCHAR(100) NOT NULL,
activo BOOLEAN NOT NULL DEFAULT true,
PRIMARY KEY(codigo)

);


CREATE TABLE localidade(
codigo BIGSERIAL NOT NULL,
nome VARCHAR(100) NOT NULL,
codigo_distrito BIGINT NOT NULL,
activO BOOLEAN NOT NULL DEFAULT true,
PRIMARY KEY(codigo),
CONSTRAINT fk_distrito_localidade
     FOREIGN KEY(codigo_distrito) REFERENCES distrito(codigo)
);

CREATE TABLE bairro(
codigo BIGSERIAL NOT NULL,
nome VARCHAR(100) NOT NULL,
codigo_localidade BIGINT NOT NULL,
activo BOOLEAN NOT NULL DEFAULT true,
PRIMARY KEY(codigo),
CONSTRAINT fk_bairro_localidade
     FOREIGN KEY(codigo_localidade) REFERENCES localidade(codigo)
);