package com.springbootrestapi.repositories;

import com.springbootrestapi.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
