package com.desafio.points_of_interest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.points_of_interest.entity.Pontos;

@Repository
public interface PontosRepository extends JpaRepository<Pontos, Long> {

}
