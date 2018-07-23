package com.xavier.abt.teamLeaderDos.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xavier.abt.teamLeaderDos.model.Roceador;
import com.xavier.abt.teamLeaderDos.repository.RoceadorRepository;

@RestController
@RequestMapping("/roceadores")
public class RoceadorResource {
	
	@Autowired
	private RoceadorRepository roceadorRepository;
	
	@GetMapping
	public List<Roceador> pesquisar() {
		return roceadorRepository.findAll();
	}

}
