package com.viswekshal.atheneum.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viswekshal.atheneum.model.Book;
import com.viswekshal.atheneum.model.BookDTO;
import com.viswekshal.atheneum.service.BooksService;
import com.viswekshal.atheneum.service.IBooksService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

/**
 * @author Vishal Vyavahare
 */
@Api(tags = "Books API", value = "All the Books related API")
@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/v1/books")
public class BooksController {

	private final IBooksService booksService;

	@GetMapping
	public String findAll() {
		return "Vishal";
	}

	@PutMapping
	public ResponseEntity<BookDTO> update(@Valid @RequestBody BookDTO bookDTO) {
		if (StringUtils.isEmpty(bookDTO.getId())) {
			// Create

		} else {
			// Update
		}
		return null;
	}

	@PostMapping
	public ResponseEntity<BookDTO> create(@Valid @RequestBody BookDTO bookDTO) {
		return null;
	}

	@DeleteMapping
	public ResponseEntity<BookDTO> delete(@Valid @RequestBody BookDTO bookDTO) {
		return null;
	}

	@ApiOperation(value = "GET Books with Id")
	@GetMapping(value = "/{bookId}")
	public ResponseEntity<Optional<Book>> getStream(@PathVariable("bookId") String bookId) {
		return new ResponseEntity<>(booksService.getBookById(bookId), HttpStatus.OK);
	}

}