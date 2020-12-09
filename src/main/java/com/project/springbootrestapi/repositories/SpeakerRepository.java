package com.project.springbootrestapi.repositories;

import com.project.springbootrestapi.models.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
