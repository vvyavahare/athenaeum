package com.viswekshal.atheneum.service;

import java.util.List;
import java.util.Optional;

import com.viswekshal.atheneum.model.Book;
import com.viswekshal.atheneum.model.BookDTO;

public interface IBooksService {

	public List<Book> saveAllAndFlush(List<Book> books) ;

	public Optional<Book> getBookById(String bookId);
}
