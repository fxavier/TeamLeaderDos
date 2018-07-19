package com.xavier.abt.teamLeaderDos.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Bairro.class)
public abstract class Bairro_ {

	public static volatile SingularAttribute<Bairro, Long> codigo;
	public static volatile SingularAttribute<Bairro, Localidade> localidade;
	public static volatile SingularAttribute<Bairro, String> nome;

	public static final String CODIGO = "codigo";
	public static final String LOCALIDADE = "localidade";
	public static final String NOME = "nome";

}

