CREATE TABLE roceador(
codigo BIGSERIAL,
numero BIGINT NOT NULL,
nome VARCHAR(100) NOT NULL,
codigo_distrito BIGINT NOT NULL,
activo BOOLEAN DEFAULT true,
PRIMARY KEY(codigo),
CONSTRAINT fk_sop_district 
  FOREIGN KEY(codigo_distrito) REFERENCES distrito(codigo)
);

CREATE TABLE mobilizador(
codigo BIGSERIAL,
mob_code BIGINT NOT NULL,
nome VARCHAR(100) NOT NULL,
codigo_distrito BIGINT NOT NULL,
activo BOOLEAN DEFAULT true,
PRIMARY KEY(codigo),
CONSTRAINT fk_mob_district 
  FOREIGN KEY(codigo_distrito) REFERENCES distrito(codigo)
);

CREATE TABLE team_leader(
codigo BIGSERIAL,
numero BIGINT NOT NULL,
nome VARCHAR(100) NOT NULL,
codigo_distrito BIGINT NOT NULL,
activo BOOLEAN DEFAULT true,
PRIMARY KEY(codigo),
CONSTRAINT fk_tl_district 
  FOREIGN KEY(codigo_distrito) REFERENCES distrito(codigo)
);

CREATE TABLE supervisor_brigada(
codigo BIGSERIAL,
numero BIGINT NOT NULL,
nome VARCHAR(100) NOT NULL,
codigo_distrito BIGINT NOT NULL,
activo BOOLEAN DEFAULT true,
PRIMARY KEY(codigo),
CONSTRAINT fk_bs_district 
  FOREIGN KEY(codigo_distrito) REFERENCES distrito(codigo)
);

