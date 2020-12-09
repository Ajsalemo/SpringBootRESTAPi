package com.project.springbootrestapi.repositories;

import com.project.springbootrestapi.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
