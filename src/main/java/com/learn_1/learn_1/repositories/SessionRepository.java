package com.learn_1.learn_1.repositories;

import com.learn_1.learn_1.models.Session;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
