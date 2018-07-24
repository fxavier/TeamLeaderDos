/**
 * 
 */
package com.xavier.abt.teamLeaderDos.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
* @author
 *
 */
@Entity
@Table(name = "totais_dos")
public class TotaisTlDos {
			
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotNull
	private LocalDate data;
	
	@NotNull
	@Column(name = "sop_mix_for75_sim")
	private Long SOPMixFor75Sim;
	
	@NotNull
	@Column(name = "sop_mix_for75_nao")
	private Long SOPMixFor75Nao;
	    
	@NotNull
	@Column(name = "sop_enxaugou_sim")
    private Long SOPEnxaugou3vezesSim;
	
	@NotNull
	@Column(name = "sop_enxaugou_nao")
    private Long SOPEnxaugou3vezesNao;
	    
	@NotNull
	@Column(name = "sop_tem_epi_sim")
    private Long SOPTemEPICompletoSim;
	    
	@NotNull
	@Column(name = "sop_tem_epi_nao")
	private Long SOPTemEPICompletoNao;
	    
	@NotNull
	@Column(name = "sop_pul_comcntflx_sim")
	private Long SOPPulvComBombaComCntFluxoSim;
	    
	@NotNull
	@Column(name = "sop_pul_comcntflx_nao")
	private Long SOPPulvComBombaComCntFluxoNao;
	 
	@NotNull
	@Column(name = "todos_pert_fora_sim")
	private Long todosPertencesForaCasaSim;
	  
	@NotNull
	@Column(name = "todos_pert_fora_nao")
	private Long todosPertencesForaCasaNao;
	  
	@NotNull
	@Column(name = "todos_naotirados_cob_sim")
	private Long todosPertencesNTiradosCobertosSim;
	  
	@NotNull
	@Column(name = "todos_naotirados_cob_nao")
    private Long todosPertencesNTiradosCobertosNao;
	 
	@NotNull
	@Column(name = "vazamento_sim")
	private Long existeVazamentoBombaSim;
	 
	@NotNull
	@Column(name = "vazamento_nao")
	private Long existeVazamentoBombaNao;
	    
	@NotNull
	@Column(name = "sop_pulvdist45_parede_sim")
	private Long SOPPulvComDist45cmParedeSim;
	    
	@NotNull
	@Column(name = "sop_pulvdist45_parede_nao")
	private Long SOPPulvComDist45cmParedeNao;
	    
	@NotNull
	@Column(name = "sop_mantem_vcerta_sim")
	private Long SOPMantemVelocCorrectaSim;
	   
	@NotNull
	@Column(name = "sop_mantem_vcerta_nao")
	private Long SOPMantemVelocCorrectaNao;
	    
	@NotNull
	@Column(name = "exist_sobrep5_sim")
	private Long existeSubreposicao5cmSim;
	    
	@NotNull
	@Column(name = "exist_sobrep5_nao")
	private Long existeSubreposicao5cmNao;
	    
	 @ManyToOne
	 @JoinColumn(name = "codigo_teamleader")
	 private TeamLeader teamLeader;   
	    
	 @ManyToOne
	 @JoinColumn(name = "codigo_bairro")
	 private Bairro bairro;
	    
	    public Long getCodigo() {
			return codigo;
		}

		public void setCodigo(Long codigo) {
			this.codigo = codigo;
		}

		public LocalDate getData() {
			return data;
		}

		public void setData(LocalDate data) {
			this.data = data;
		}

		public Long getSOPMixFor75Sim() {
			return SOPMixFor75Sim;
		}

		public void setSOPMixFor75Sim(Long sOPMixFor75Sim) {
			SOPMixFor75Sim = sOPMixFor75Sim;
		}

		public Long getSOPMixFor75Nao() {
			return SOPMixFor75Nao;
		}

		public void setSOPMixFor75Nao(Long sOPMixFor75Nao) {
			SOPMixFor75Nao = sOPMixFor75Nao;
		}

		public Long getSOPEnxaugou3vezesSim() {
			return SOPEnxaugou3vezesSim;
		}

		public void setSOPEnxaugou3vezesSim(Long sOPEnxaugou3vezesSim) {
			SOPEnxaugou3vezesSim = sOPEnxaugou3vezesSim;
		}

		public Long getSOPEnxaugou3vezesNao() {
			return SOPEnxaugou3vezesNao;
		}

		public void setSOPEnxaugou3vezesNao(Long sOPEnxaugou3vezesNao) {
			SOPEnxaugou3vezesNao = sOPEnxaugou3vezesNao;
		}

		public Long getSOPTemEPICompletoSim() {
			return SOPTemEPICompletoSim;
		}

		public void setSOPTemEPICompletoSim(Long sOPTemEPICompletoSim) {
			SOPTemEPICompletoSim = sOPTemEPICompletoSim;
		}

		public Long getSOPTemEPICompletoNao() {
			return SOPTemEPICompletoNao;
		}

		public void setSOPTemEPICompletoNao(Long sOPTemEPICompletoNao) {
			SOPTemEPICompletoNao = sOPTemEPICompletoNao;
		}

		public Long getSOPPulvComBombaComCntFluxoSim() {
			return SOPPulvComBombaComCntFluxoSim;
		}

		public void setSOPPulvComBombaComCntFluxoSim(Long sOPPulvComBombaComCntFluxoSim) {
			SOPPulvComBombaComCntFluxoSim = sOPPulvComBombaComCntFluxoSim;
		}

		public Long getSOPPulvComBombaComCntFluxoNao() {
			return SOPPulvComBombaComCntFluxoNao;
		}

		public void setSOPPulvComBombaComCntFluxoNao(Long sOPPulvComBombaComCntFluxoNao) {
			SOPPulvComBombaComCntFluxoNao = sOPPulvComBombaComCntFluxoNao;
		}

		public Long getTodosPertencesForaCasaSim() {
			return todosPertencesForaCasaSim;
		}

		public void setTodosPertencesForaCasaSim(Long todosPertencesForaCasaSim) {
			this.todosPertencesForaCasaSim = todosPertencesForaCasaSim;
		}

		public Long getTodosPertencesForaCasaNao() {
			return todosPertencesForaCasaNao;
		}

		public void setTodosPertencesForaCasaNao(Long todosPertencesForaCasaNao) {
			this.todosPertencesForaCasaNao = todosPertencesForaCasaNao;
		}

		public Long getTodosPertencesNTiradosCobertosSim() {
			return todosPertencesNTiradosCobertosSim;
		}

		public void setTodosPertencesNTiradosCobertosSim(Long todosPertencesNTiradosCobertosSim) {
			this.todosPertencesNTiradosCobertosSim = todosPertencesNTiradosCobertosSim;
		}

		public Long getTodosPertencesNTiradosCobertosNao() {
			return todosPertencesNTiradosCobertosNao;
		}

		public void setTodosPertencesNTiradosCobertosNao(Long todosPertencesNTiradosCobertosNao) {
			this.todosPertencesNTiradosCobertosNao = todosPertencesNTiradosCobertosNao;
		}

		public Long getExisteVazamentoBombaSim() {
			return existeVazamentoBombaSim;
		}

		public void setExisteVazamentoBombaSim(Long existeVazamentoBombaSim) {
			this.existeVazamentoBombaSim = existeVazamentoBombaSim;
		}

		public Long getExisteVazamentoBombaNao() {
			return existeVazamentoBombaNao;
		}

		public void setExisteVazamentoBombaNao(Long existeVazamentoBombaNao) {
			this.existeVazamentoBombaNao = existeVazamentoBombaNao;
		}

		public Long getSOPPulvComDist45cmParedeSim() {
			return SOPPulvComDist45cmParedeSim;
		}

		public void setSOPPulvComDist45cmParedeSim(Long sOPPulvComDist45cmParedeSim) {
			SOPPulvComDist45cmParedeSim = sOPPulvComDist45cmParedeSim;
		}

		public Long getSOPPulvComDist45cmParedeNao() {
			return SOPPulvComDist45cmParedeNao;
		}

		public void setSOPPulvComDist45cmParedeNao(Long sOPPulvComDist45cmParedeNao) {
			SOPPulvComDist45cmParedeNao = sOPPulvComDist45cmParedeNao;
		}

		public Long getSOPMantemVelocCorrectaSim() {
			return SOPMantemVelocCorrectaSim;
		}

		public void setSOPMantemVelocCorrectaSim(Long sOPMantemVelocCorrectaSim) {
			SOPMantemVelocCorrectaSim = sOPMantemVelocCorrectaSim;
		}

		public Long getSOPMantemVelocCorrectaNao() {
			return SOPMantemVelocCorrectaNao;
		}

		public void setSOPMantemVelocCorrectaNao(Long sOPMantemVelocCorrectaNao) {
			SOPMantemVelocCorrectaNao = sOPMantemVelocCorrectaNao;
		}

		public Long getExisteSubreposicao5cmSim() {
			return existeSubreposicao5cmSim;
		}

		public void setExisteSubreposicao5cmSim(Long existeSubreposicao5cmSim) {
			this.existeSubreposicao5cmSim = existeSubreposicao5cmSim;
		}

		public Long getExisteSubreposicao5cmNao() {
			return existeSubreposicao5cmNao;
		}

		public void setExisteSubreposicao5cmNao(Long existeSubreposicao5cmNao) {
			this.existeSubreposicao5cmNao = existeSubreposicao5cmNao;
		}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TotaisTlDos other = (TotaisTlDos) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	

}
