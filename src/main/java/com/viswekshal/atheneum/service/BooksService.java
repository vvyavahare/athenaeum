package com.viswekshal.atheneum.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.viswekshal.atheneum.common.security.repository.BooksRepository;
import com.viswekshal.atheneum.model.Book;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BooksService implements IBooksService {
	private final BooksRepository booksRepository;

	@Override
	public List<Book> saveAllAndFlush(List<Book> books) {
		List<Book> savedBooks = booksRepository.saveAll(books);
		booksRepository.flush();
		return savedBooks;
	}

}
