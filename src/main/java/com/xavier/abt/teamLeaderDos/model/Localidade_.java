package com.xavier.abt.teamLeaderDos.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Localidade.class)
public abstract class Localidade_ {

	public static volatile SingularAttribute<Localidade, Distrito> distrito;
	public static volatile SingularAttribute<Localidade, Long> codigo;
	public static volatile SingularAttribute<Localidade, String> nome;

	public static final String DISTRITO = "distrito";
	public static final String CODIGO = "codigo";
	public static final String NOME = "nome";

}

