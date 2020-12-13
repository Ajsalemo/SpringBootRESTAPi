package com.springbootrestapi.application.repositories;

import com.springbootrestapi.application.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
