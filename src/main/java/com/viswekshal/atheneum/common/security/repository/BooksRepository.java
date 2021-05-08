package com.viswekshal.atheneum.common.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viswekshal.atheneum.common.model.User;
import com.viswekshal.atheneum.model.Book;

/**
 * @author Vishal Vyavahare
 */
@Repository
public interface BooksRepository extends JpaRepository<Book, String> {

//	User findAllByUserAndPassword(String user, String password);
}
