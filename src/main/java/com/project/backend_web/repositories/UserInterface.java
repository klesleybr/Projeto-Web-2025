package com.project.backend_web.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.backend_web.domain.users.User;

public interface UserInterface extends JpaRepository<User, UUID> {

}
