package com.desafio.points_of_interest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.points_of_interest.entity.DistanciaMax;
import com.desafio.points_of_interest.entity.Pontos;
import com.desafio.points_of_interest.exceptions.ValoresNegativosException;
import com.desafio.points_of_interest.repository.PontosRepository;

@Service
public class PontosService {

	@Autowired
	PontosRepository pontosRepository;

	public List<Pontos> listarTodos() {
		return pontosRepository.findAll();
	}

	public List<Pontos> cadastrarPonto(Pontos pontoReferencia, DistanciaMax d_max) {
	    if (pontoReferencia.getPontoX() < 0 || pontoReferencia.getPontoY() < 0 || d_max.distancia() < 0) {
	        throw new ValoresNegativosException("Não é permitido valores negativos");
	    }

	    List<Pontos> pontosProximos = new ArrayList<>();
	    for (Pontos ponto : pontosRepository.findAll()) {
	        double distancia = Math.sqrt(
	            Math.pow(ponto.getPontoX() - pontoReferencia.getPontoX(), 2) + Math.pow(ponto.getPontoY() - pontoReferencia.getPontoY(), 2)
	        );

	        if (distancia <= d_max.distancia()) {
	            pontosProximos.add(ponto);
	        }
	    }

	    return pontosProximos;
	}

}
