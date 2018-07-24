package com.xavier.abt.teamLeaderDos.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(DetalheDos.class)
public abstract class DetalheDos_ {

	public static volatile SingularAttribute<DetalheDos, Long> codigo;
	public static volatile SingularAttribute<DetalheDos, Roceador> roceador;
	public static volatile SingularAttribute<DetalheDos, LocalDate> data;
	public static volatile SingularAttribute<DetalheDos, String> sopPulvComDist45cmParede;
	public static volatile SingularAttribute<DetalheDos, String> sopMantemVelocCorrecta;
	public static volatile SingularAttribute<DetalheDos, String> existeSubreposicao5cm;
	public static volatile SingularAttribute<DetalheDos, TotaisTlDos> totaisTlDos;
	public static volatile SingularAttribute<DetalheDos, String> existeVazamentoBomba;
	public static volatile SingularAttribute<DetalheDos, String> todosPertencesNTiradosCobertos;
	public static volatile SingularAttribute<DetalheDos, String> sopTemEPICompleto;
	public static volatile SingularAttribute<DetalheDos, String> sopEnxaugou3vezes;
	public static volatile SingularAttribute<DetalheDos, String> sopPulvComBombaComCntFluxo;
	public static volatile SingularAttribute<DetalheDos, String> sopMixFor75;
	public static volatile SingularAttribute<DetalheDos, String> todosPertencesForaCasa;

	public static final String CODIGO = "codigo";
	public static final String ROCEADOR = "roceador";
	public static final String DATA = "data";
	public static final String SOP_PULV_COM_DIST45CM_PAREDE = "sopPulvComDist45cmParede";
	public static final String SOP_MANTEM_VELOC_CORRECTA = "sopMantemVelocCorrecta";
	public static final String EXISTE_SUBREPOSICAO5CM = "existeSubreposicao5cm";
	public static final String TOTAIS_TL_DOS = "totaisTlDos";
	public static final String EXISTE_VAZAMENTO_BOMBA = "existeVazamentoBomba";
	public static final String TODOS_PERTENCES_NTIRADOS_COBERTOS = "todosPertencesNTiradosCobertos";
	public static final String SOP_TEM_EP_ICOMPLETO = "sopTemEPICompleto";
	public static final String SOP_ENXAUGOU3VEZES = "sopEnxaugou3vezes";
	public static final String SOP_PULV_COM_BOMBA_COM_CNT_FLUXO = "sopPulvComBombaComCntFluxo";
	public static final String SOP_MIX_FOR75 = "sopMixFor75";
	public static final String TODOS_PERTENCES_FORA_CASA = "todosPertencesForaCasa";

}

