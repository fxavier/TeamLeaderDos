package com.xavier.abt.teamLeaderDos.repository.helper;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import com.xavier.abt.teamLeaderDos.model.TotaisTlDos;
import com.xavier.abt.teamLeaderDos.model.TotaisTlDos_;
import com.xavier.abt.teamLeaderDos.repository.filter.TotaisDosFilter;



public class TotaisDosRepositoryImpl implements TotaisDosRepositoryQueries {
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<TotaisTlDos> filtrar(TotaisDosFilter totaisDosFilter, Pageable pageable) {
	    CriteriaBuilder builder = manager.getCriteriaBuilder();
	    CriteriaQuery<TotaisTlDos> criteria = builder.createQuery(TotaisTlDos.class);
	    Root<TotaisTlDos> root = criteria.from(TotaisTlDos.class);
	    
	    Predicate[] predicates = criarRestricoes(totaisDosFilter, builder, root);
	    criteria.where(predicates);
	    
	    TypedQuery<TotaisTlDos> query = manager.createQuery(criteria);
	    adicionarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList(), pageable, total(totaisDosFilter));
	}

	private Predicate[] criarRestricoes(TotaisDosFilter totaisDosFilter, CriteriaBuilder builder,
			Root<TotaisTlDos> root) {
	 List<Predicate> predicates = new ArrayList<>();
	 
	 if(totaisDosFilter.getDataInicio() != null) {
        predicates.add(builder.greaterThanOrEqualTo(root.get(TotaisTlDos_.DATA), totaisDosFilter.getDataInicio()));
        
	 }
	 
	  if(totaisDosFilter.getDataFinal() != null ) {
		  predicates.add(builder.lessThanOrEqualTo(root.get(TotaisTlDos_.DATA), totaisDosFilter.getDataFinal()));
	  }
	  
	
		return predicates.toArray(new Predicate[predicates.size()]);
	}
	
	private Long total(TotaisDosFilter totaisDosFilter) {
		  CriteriaBuilder builder = manager.getCriteriaBuilder();
		  CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
		  Root<TotaisTlDos> root = criteria.from(TotaisTlDos.class);
		    
		  Predicate[] predicates = criarRestricoes(totaisDosFilter, builder, root);
		  criteria.where(predicates);
		  
		  criteria.select(builder.count(root));
		    
		return manager.createQuery(criteria).getSingleResult();
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<TotaisTlDos> query, Pageable pageable) {
		int paginaActual = pageable.getPageNumber();
		int totalRegistosPorPagina = pageable.getPageSize();
		int primeiroRegistoPorPagina = paginaActual * totalRegistosPorPagina;
		
		query.setFirstResult(primeiroRegistoPorPagina);
		query.setMaxResults(totalRegistosPorPagina);
		
	}

	
	

}
