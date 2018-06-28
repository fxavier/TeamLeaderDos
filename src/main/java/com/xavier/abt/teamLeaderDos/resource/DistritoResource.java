package com.xavier.abt.teamLeaderDos.resource;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.xavier.abt.teamLeaderDos.event.RecursoCriadoEvent;
import com.xavier.abt.teamLeaderDos.model.Distrito;
import com.xavier.abt.teamLeaderDos.repository.DistritoRepository;

@RestController
@RequestMapping("/distritos")
public class DistritoResource {
	
	@Autowired
	private DistritoRepository distritoRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Distrito> pesquisar(){
		return distritoRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Distrito> criar(@Valid @RequestBody Distrito distrito, HttpServletResponse response) {
		Distrito distritoSalvo = distritoRepository.save(distrito);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, distritoSalvo.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(distritoSalvo);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Distrito> buscarPeloCodigo(@PathVariable Long codigo) {
		Optional<Distrito> distrito = distritoRepository.findById(codigo);
		return distrito.isPresent() ? ResponseEntity.ok(distrito.get()) : ResponseEntity.notFound().build();
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		distritoRepository.deleteById(codigo);
	}

}
