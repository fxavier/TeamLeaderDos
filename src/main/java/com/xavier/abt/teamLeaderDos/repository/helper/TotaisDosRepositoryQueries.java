package com.xavier.abt.teamLeaderDos.repository.helper;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xavier.abt.teamLeaderDos.model.TotaisTlDos;
import com.xavier.abt.teamLeaderDos.repository.filter.TotaisDosFilter;


public interface TotaisDosRepositoryQueries {
	
	public Page<TotaisTlDos> filtrar(TotaisDosFilter totaisDosFilter, Pageable pageable);

}
