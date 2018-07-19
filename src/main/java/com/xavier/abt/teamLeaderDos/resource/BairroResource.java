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
import com.xavier.abt.teamLeaderDos.model.Bairro;
import com.xavier.abt.teamLeaderDos.repository.BairroRepository;


@RestController
@RequestMapping("\bairros")
public class BairroResource {
	@Autowired
	private BairroRepository bairroRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<Bairro> listar() {
		return bairroRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Bairro> criar(@Valid @RequestBody Bairro bairro, HttpServletResponse response) {
		Bairro bairroCriado = bairroRepository.save(bairro);
		
		publisher.publishEvent(new RecursoCriadoEvent(this, response, bairroCriado.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(bairroCriado);
	}

}
