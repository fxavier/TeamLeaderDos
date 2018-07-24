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
 * @author xavier
 *
 */
@Entity
@Table(name = "detalhes_tldos")
public class DetalheDos {
		

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
		
	@NotNull
	private LocalDate data;
	
	@Column(name = "SOPMixFor75")
	@NotNull
	private String sopMixFor75;
	
	@Column(name = "SOPEnxaugou3vezes")
	@NotNull
	private String sopEnxaugou3vezes;
	
	@Column(name = "SOPTemEPICompleto")
	@NotNull
	private String sopTemEPICompleto;
	
	@Column(name = "SOPPulvComBombaComCntFluxo")
	@NotNull
	private String sopPulvComBombaComCntFluxo;	

	@NotNull
	private String todosPertencesForaCasa;	

	@NotNull
	private String todosPertencesNTiradosCobertos;
	
	@NotNull
	private String existeVazamentoBomba;
	
	@Column(name = "SOPPulvComDist45cmParede")
	@NotNull
	private String sopPulvComDist45cmParede;
	
	@Column(name = "SOPMantemVelocCorrecta")
	@NotNull
	private String sopMantemVelocCorrecta;
	
	@NotNull
	private String existeSubreposicao5cm;
	
	@ManyToOne
	@JoinColumn(name = "codigo_totalDos")
    private TotaisTlDos totaisTlDos;
	
	@ManyToOne
	@JoinColumn(name = "codigo_roceador")
	private Roceador roceador;
	

	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	    
	public TotaisTlDos getTotaisTlDos() {
		return totaisTlDos;
	}


	public void setTotaisTlDos(TotaisTlDos totaisTlDos) {
		this.totaisTlDos = totaisTlDos;
	}


	public String getSopMixFor75() {
		return sopMixFor75;
	}

	public void setSopMixFor75(String sopMixFor75) {
		this.sopMixFor75 = sopMixFor75;
	}

	public String getSopEnxaugou3vezes() {
		return sopEnxaugou3vezes;
	}

	public void setSopEnxaugou3vezes(String sopEnxaugou3vezes) {
		this.sopEnxaugou3vezes = sopEnxaugou3vezes;
	}

	public String getSopTemEPICompleto() {
		return sopTemEPICompleto;
	}

	public void setSopTemEPICompleto(String sopTemEPICompleto) {
		this.sopTemEPICompleto = sopTemEPICompleto;
	}

	public String getSopPulvComBombaComCntFluxo() {
		return sopPulvComBombaComCntFluxo;
	}

	public void setSopPulvComBombaComCntFluxo(String sopPulvComBombaComCntFluxo) {
		this.sopPulvComBombaComCntFluxo = sopPulvComBombaComCntFluxo;
	}

	public String getTodosPertencesForaCasa() {
		return todosPertencesForaCasa;
	}

	public void setTodosPertencesForaCasa(String todosPertencesForaCasa) {
		this.todosPertencesForaCasa = todosPertencesForaCasa;
	}

	public String getTodosPertencesNTiradosCobertos() {
		return todosPertencesNTiradosCobertos;
	}

	public void setTodosPertencesNTiradosCobertos(String todosPertencesNTiradosCobertos) {
		this.todosPertencesNTiradosCobertos = todosPertencesNTiradosCobertos;
	}

	public String getExisteVazamentoBomba() {
		return existeVazamentoBomba;
	}

	public void setExisteVazamentoBomba(String existeVazamentoBomba) {
		this.existeVazamentoBomba = existeVazamentoBomba;
	}

	public String getSopPulvComDist45cmParede() {
		return sopPulvComDist45cmParede;
	}

	public void setSopPulvComDist45cmParede(String sopPulvComDist45cmParede) {
		this.sopPulvComDist45cmParede = sopPulvComDist45cmParede;
	}

	public String getSopMantemVelocCorrecta() {
		return sopMantemVelocCorrecta;
	}

	public void setSopMantemVelocCorrecta(String sopMantemVelocCorrecta) {
		this.sopMantemVelocCorrecta = sopMantemVelocCorrecta;
	}

	public String getExisteSubreposicao5cm() {
		return existeSubreposicao5cm;
	}

	public void setExisteSubreposicao5cm(String existeSubreposicao5cm) {
		this.existeSubreposicao5cm = existeSubreposicao5cm;
	}

	public Roceador getRoceador() {
		return roceador;
	}


	public void setRoceador(Roceador roceador) {
		this.roceador = roceador;
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
		DetalheDos other = (DetalheDos) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	

}
