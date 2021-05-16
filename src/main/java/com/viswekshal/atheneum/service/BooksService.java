package com.viswekshal.atheneum.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.viswekshal.atheneum.common.security.repository.BooksRepository;
import com.viswekshal.atheneum.common.validation.Suppliers;
import com.viswekshal.atheneum.model.Book;
import com.viswekshal.atheneum.model.BookDTO;
import com.viswekshal.atheneum.model.mapper.BooksMapper;
import com.viswekshal.atheneum.model.mapper.Mappers;

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

	@Override
	public Optional<BookDTO> getBookById(String bookId) {

		BookDTO bookDTO = Mappers.BOOKS_MAPPER
				.toDto(booksRepository.findById(bookId).orElseThrow(Suppliers.objectNotFound("Book", bookId)));
		return null;
	}

}
