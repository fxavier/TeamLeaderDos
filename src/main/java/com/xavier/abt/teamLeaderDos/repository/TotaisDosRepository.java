package com.xavier.abt.teamLeaderDos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xavier.abt.teamLeaderDos.model.TotaisTlDos;
import com.xavier.abt.teamLeaderDos.repository.helper.TotaisDosRepositoryQueries;

public interface TotaisDosRepository extends JpaRepository<TotaisTlDos, Long>, TotaisDosRepositoryQueries {

}
