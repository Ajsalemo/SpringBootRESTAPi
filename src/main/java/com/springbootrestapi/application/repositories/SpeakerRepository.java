package com.springbootrestapi.application.repositories;

import com.springbootrestapi.application.models.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
