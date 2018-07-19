package com.xavier.abt.teamLeaderDos.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Roceador.class)
public abstract class Roceador_ {

	public static volatile SingularAttribute<Roceador, Distrito> distrito;
	public static volatile SingularAttribute<Roceador, Long> codigo;
	public static volatile SingularAttribute<Roceador, Long> numero;
	public static volatile SingularAttribute<Roceador, String> nome;
	public static volatile SingularAttribute<Roceador, Boolean> activo;

	public static final String DISTRITO = "distrito";
	public static final String CODIGO = "codigo";
	public static final String NUMERO = "numero";
	public static final String NOME = "nome";
	public static final String ACTIVO = "activo";

}

