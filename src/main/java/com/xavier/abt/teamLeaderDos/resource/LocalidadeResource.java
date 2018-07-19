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
import com.xavier.abt.teamLeaderDos.model.Localidade;
import com.xavier.abt.teamLeaderDos.repository.LocalidadeRepository;

@RestController
@RequestMapping("/localidades")
public class LocalidadeResource {
	
	@Autowired
	private LocalidadeRepository localidadeRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Localidade> pesquisar() {
		return localidadeRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Localidade> criar(@Valid @RequestBody Localidade localidade, HttpServletResponse response) {
		Localidade localidadeCriada = localidadeRepository.save(localidade);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, localidadeCriada.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(localidadeCriada);
	}
	
	

}
