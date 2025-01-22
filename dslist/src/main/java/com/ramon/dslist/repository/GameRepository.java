package com.ramon.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramon.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
