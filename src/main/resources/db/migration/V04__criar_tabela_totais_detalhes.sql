CREATE TABLE totais_dos (
    codigo BIGSERIAL,
    data DATE NOT NULL,
    sop_mix_for75_sim BIGINT,
    sop_mix_for75_nao BIGINT,
    sop_enxaugou_sim BIGINT,
    sop_enxaugou_nao BIGINT,
    sop_tem_epi_sim BIGINT,
    sop_tem_epi_nao BIGINT,
    sop_pul_comcntflx_sim BIGINT,
    sop_pul_comcntflx_nao BIGINT,
    todos_pert_fora_sim BIGINT,
    todos_pert_fora_nao BIGINT,
    todos_naotirados_cob_sim BIGINT,
    todos_naotirados_cob_nao BIGINT,
    vazamento_sim BIGINT,
    vazamento_nao BIGINT,
    sop_pulvdist45_parede_sim BIGINT,
    sop_pulvdist45_parede_nao BIGINT,
    sop_mantem_vcerta_sim  BIGINT,
    sop_mantem_vcerta_nao BIGINT,
    exist_sobrep5_sim BIGINT,
    exist_sobrep5_nao BIGINT,
    codigo_teamLeader BIGINT NOT NULL,
    codigo_bairro BIGINT NOT NULL,
    PRIMARY KEY (codigo),
    CONSTRAINT fk_totais_teamLeader
      FOREIGN KEY (codigo_teamLeader) REFERENCES team_leader(codigo),
    CONSTRAINT fk_totais_bairro  
       FOREIGN KEY (codigo_bairro) REFERENCES bairro(codigo)
   );
   
   CREATE TABLE detalhes_dos (
    codigo BIGSERIAL,
    data DATE NOT NULL,
    SOPMixFor75 VARCHAR(20) NOT NULL,
    SOPEnxaugou3vezes VARCHAR(20) NOT NULL,
    SOPTemEPICompleto VARCHAR(20) NOT NULL,
    SOPPulvComBombaComCntFluxo VARCHAR(20) NOT NULL,
    todosPertencesForaCasa VARCHAR(20) NOT NULL,
    todosPertencesNTiradosCobertos VARCHAR(20) NOT NULL,
    existeVazamentoBomba VARCHAR(20) NOT NULL,
    SOPPulvComDist45cmParede VARCHAR(20) NOT NULL,
    SOPMantemVelocCorrecta VARCHAR(20) NOT NULL,
    existeSubreposicao5cm VARCHAR(20),
    codigo_totalDos BIGINT NOT NULL,
    codigo_roceador BIGINT NOT NULL,
    PRIMARY KEY (codigo),
    CONSTRAINT fk_detalhes_totais
      FOREIGN KEY (codigo_totalDos) REFERENCES totais_dos(codigo),
    CONSTRAINT fk_detalhes_roceador   
       FOREIGN KEY (codigo_roceador) REFERENCES roceador(codigo)
   );


   
   
