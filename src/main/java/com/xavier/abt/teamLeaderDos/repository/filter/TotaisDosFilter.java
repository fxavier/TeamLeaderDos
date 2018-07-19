package com.xavier.abt.teamLeaderDos.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class TotaisDosFilter {
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataInicio;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate dataFinal;
	
	private String nomeBairro;

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(LocalDate dataFinal) {
		this.dataFinal = dataFinal;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}
	
	

}
