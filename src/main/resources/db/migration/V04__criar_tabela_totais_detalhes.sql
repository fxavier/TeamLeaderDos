CREATE TABLE totais_dos (
    codigo BIGSERIAL,
    data DATE NOT NULL,
    SOPMixFor75Sim BIGINT,
    SOPMixFor75Nao BIGINT,
    SOPEnxaugou3vezesSim BIGINT,
    SOPEnxaugou3vezesNao BIGINT,
    SOPTemEPICompletoSim BIGINT,
    SOPTemEPICompletoNao BIGINT,
    SOPPulvComBombaComCntFluxoSim BIGINT,
    SOPPulvComBombaComCntFluxoNao BIGINT,
    todosPertencesForaCasaSim BIGINT,
    todosPertencesForaCasaNao BIGINT,
    todosPertencesNTiradosCobertosSim BIGINT,
    todosPertencesNTiradosCobertosNao BIGINT,
    existeVazamentoBombaSim BIGINT,
    existeVazamentoBombaNao BIGINT,
    SOPPulvComDist45cmParedeSim BIGINT,
    SOPPulvComDist45cmParedeNao BIGINT,
    SOPMantemVelocCorrectaSim BIGINT,
    SOPMantemVelocCorrectaNao BIGINT,
    existeSubreposicao5cmSim BIGINT,
    existeSubreposicao5cmNao BIGINT,
    referencia VARCHAR(45),
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
    SOPMixFor75Sim BIGINT,
    SOPMixFor75Nao BIGINT,
    SOPEnxaugou3vezesSim BIGINT,
    SOPEnxaugou3vezesNao BIGINT,
    SOPTemEPICompletoSim BIGINT,
    SOPTemEPICompletoNao BIGINT,
    SOPPulvComBombaComCntFluxoSim BIGINT,
    SOPPulvComBombaComCntFluxoNao BIGINT,
    todosPertencesForaCasaSim BIGINT,
    todosPertencesForaCasaNao BIGINT,
    todosPertencesNTiradosCobertosSim BIGINT,
    todosPertencesNTiradosCobertosNao BIGINT,
    existeVazamentoBombaSim BIGINT,
    existeVazamentoBombaNao BIGINT,
    SOPPulvComDist45cmParedeSim BIGINT,
    SOPPulvComDist45cmParedeNao BIGINT,
    SOPMantemVelocCorrectaSim BIGINT,
    SOPMantemVelocCorrectaNao BIGINT,
    existeSubreposicao5cmSim BIGINT,
    existeSubreposicao5cmNao BIGINT,
    referencia VARCHAR(45),
    codigo_totalDos BIGINT NOT NULL,
    codigo_teamLeader BIGINT NOT NULL,
    codigo_roceador BIGINT NOT NULL,
    PRIMARY KEY (codigo),
    CONSTRAINT fk_detalhes_totais
      FOREIGN KEY (codigo_totalDos) REFERENCES totais_dos(codigo),
    CONSTRAINT fk_detalhes_roceador   
       FOREIGN KEY (codigo_roceador) REFERENCES roceador(codigo),
    CONSTRAINT fk_detalhes_teamLeader   
       FOREIGN KEY (codigo_teamLeader) REFERENCES team_leader(codigo)

   );


   
   
