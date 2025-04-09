package com.desafio.points_of_interest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pontos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private int pontoX;
	private int pontoY;
	
	public Pontos() {
	}

	public Pontos(String nome, int pontoX, int pontoY) {
		this.nome = nome;
		this.pontoX = pontoX;
		this.pontoY = pontoY;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getPontoX() {
		return pontoX;
	}

	public int getPontoY() {
		return pontoY;
	}
	
	
	
}
