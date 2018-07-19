package com.xavier.abt.teamLeaderDos.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xavier.abt.teamLeaderDos.event.RecursoCriadoEvent;
import com.xavier.abt.teamLeaderDos.model.TotaisTlDos;
import com.xavier.abt.teamLeaderDos.repository.TotaisDosRepository;

@RestController
@RequestMapping("/totais")
public class TotaisDosResource {
	
	@Autowired
	private TotaisDosRepository totaisDosRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	
	@GetMapping
	public List<TotaisTlDos> pesquisar() {
		return totaisDosRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<TotaisTlDos> criar(@Valid @RequestBody TotaisTlDos totaisTlDos, HttpServletResponse response) {
		TotaisTlDos totaisCriados = totaisDosRepository.save(totaisTlDos);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, totaisCriados.getCodigo()));
		return ResponseEntity.status(HttpStatus.CREATED).body(totaisCriados);
	}

}
