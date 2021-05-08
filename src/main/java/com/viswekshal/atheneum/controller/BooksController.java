package com.viswekshal.atheneum.controller;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viswekshal.atheneum.model.BookDTO;
import com.viswekshal.atheneum.service.BooksService;
import com.viswekshal.atheneum.service.IBooksService;

import io.swagger.annotations.Api;
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
			booksService
		} else {
			// Update
		}
		return null;
	}

	@PostMapping
	public ResponseEntity<BookDTO> create(@Valid @RequestBody BookDTO bookDTO) {
		return null;
	}

}