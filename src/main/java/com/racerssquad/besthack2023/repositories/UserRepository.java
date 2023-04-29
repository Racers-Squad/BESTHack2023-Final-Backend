package com.racerssquad.besthack2023.repositories;

import com.racerssquad.besthack2023.entites.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    boolean existsByEmail(String email);

    UserEntity findByEmail(String email);
}