package com.jsp.jpain10steps.repository;

import com.jsp.jpain10steps.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
