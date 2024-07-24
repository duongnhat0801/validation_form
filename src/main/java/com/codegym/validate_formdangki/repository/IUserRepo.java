package com.codegym.validate_formdangki.repository;

import com.codegym.validate_formdangki.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
}
