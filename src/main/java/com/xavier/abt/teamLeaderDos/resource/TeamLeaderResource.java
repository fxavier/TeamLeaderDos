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
import com.xavier.abt.teamLeaderDos.model.TeamLeader;
import com.xavier.abt.teamLeaderDos.repository.TeamLeaderRepository;

@RestController
@RequestMapping("/team_leaders")
public class TeamLeaderResource {
	
	@Autowired
	private TeamLeaderRepository teamLeaderRepository;
	
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@GetMapping
	public List<TeamLeader> pesquisar() {
		return teamLeaderRepository.findAll();
	}
	
	@PostMapping
	public ResponseEntity<TeamLeader> criar(@Valid @RequestBody TeamLeader teamLeader, HttpServletResponse response) {
		TeamLeader teamLeaderCriado = teamLeaderRepository.save(teamLeader);
		publisher.publishEvent(new RecursoCriadoEvent(this, response, teamLeaderCriado.getCodigo()));
		
		return ResponseEntity.status(HttpStatus.CREATED).body(teamLeader);
	}

}
