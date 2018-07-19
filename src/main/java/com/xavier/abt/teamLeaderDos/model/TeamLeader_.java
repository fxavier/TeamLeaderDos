package com.xavier.abt.teamLeaderDos.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TeamLeader.class)
public abstract class TeamLeader_ {

	public static volatile SingularAttribute<TeamLeader, Distrito> distrito;
	public static volatile SingularAttribute<TeamLeader, Long> codigo;
	public static volatile SingularAttribute<TeamLeader, Long> numero;
	public static volatile SingularAttribute<TeamLeader, String> nome;
	public static volatile SingularAttribute<TeamLeader, Boolean> activo;

	public static final String DISTRITO = "distrito";
	public static final String CODIGO = "codigo";
	public static final String NUMERO = "numero";
	public static final String NOME = "nome";
	public static final String ACTIVO = "activo";

}

