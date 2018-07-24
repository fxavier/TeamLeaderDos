package com.xavier.abt.teamLeaderDos.resource;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xavier.abt.teamLeaderDos.event.RecursoCriadoEvent;
import com.xavier.abt.teamLeaderDos.model.Roceador;
import com.xavier.abt.teamLeaderDos.repository.RoceadorRepository;

@CrossOrigin(maxAge = 10, origins = { "*" })
@RestController
@RequestMapping("/roceadores")
public class RoceadorResource {
	
	@Autowired
	private RoceadorRepository roceadorRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Roceador> pesquisar() {
		return roceadorRepository.findAll();
	}

	@PostMapping
	public ResponseEntity<Roceador> criar(@Valid @RequestBody Roceador roceador, HttpServletResponse response ) {
		Roceador roceadorCriado = roceadorRepository.save(roceador);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, roceadorCriado.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(roceadorCriado);
	}
}
