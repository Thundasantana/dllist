package com.devlyon.dllist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlyon.dllist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}


