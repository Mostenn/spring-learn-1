package com.learn_1.learn_1.repositories;

import com.learn_1.learn_1.models.Speaker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
