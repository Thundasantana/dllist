package com.devlyon.dllist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlyon.dllist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}


