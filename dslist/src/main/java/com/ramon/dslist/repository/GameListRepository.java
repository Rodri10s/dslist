package com.ramon.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramon.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
