package com.desafio.points_of_interest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.points_of_interest.entity.DistanciaMax;
import com.desafio.points_of_interest.entity.Pontos;
import com.desafio.points_of_interest.entity.PontosProximos;
import com.desafio.points_of_interest.service.PontosService;

@RestController
@RequestMapping("/")
public class PontosController {
	
	@Autowired
	PontosService pontosService;
	
	@GetMapping
	public ResponseEntity<List<Pontos>> listarTodos(){
		return ResponseEntity.ok(pontosService.listarTodos());
	}
	
	@PostMapping("/referencia")
	public ResponseEntity<List<Pontos>> listarPontosProximos(@RequestBody PontosProximos request){
		return ResponseEntity.ok(pontosService.cadastrarPonto(request.getPonto(), request.getDistanciaMax()));
	}
}
