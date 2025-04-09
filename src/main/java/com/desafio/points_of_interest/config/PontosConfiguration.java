package com.desafio.points_of_interest.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.desafio.points_of_interest.entity.Pontos;
import com.desafio.points_of_interest.repository.PontosRepository;

@Configuration
public class PontosConfiguration {
	
	@Bean
	CommandLineRunner initPontos(PontosRepository pontosRepository) {
		return args ->{
			if(pontosRepository.count() == 0) {
				pontosRepository.save(new Pontos("Lanchonete", 27, 12));
				pontosRepository.save(new Pontos("Posto", 31, 18));
				pontosRepository.save(new Pontos("Joalheria", 15, 12));
				pontosRepository.save(new Pontos("Floricultura", 19, 21));
				pontosRepository.save(new Pontos("Pub", 12, 8));
				pontosRepository.save(new Pontos("Supermercado", 23, 6));
				pontosRepository.save(new Pontos("Churrascaria", 28, 2));
			}
		};
	}
}