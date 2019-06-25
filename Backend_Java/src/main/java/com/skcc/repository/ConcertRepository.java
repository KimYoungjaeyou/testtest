package com.skcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcc.model.concert.Concert;

public interface ConcertRepository extends JpaRepository<Concert, Long>{
}
