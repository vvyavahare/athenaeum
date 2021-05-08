package com.viswekshal.atheneum.common.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viswekshal.atheneum.common.model.User;

/**
 * @author Vishal Vyavahare
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findAllByUserAndPassword(String user, String password);
}