package com.viswekshal.atheneum.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viswekshal.atheneum.model.BookDTO;

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

	@GetMapping
	public String findAll() {
		return "Vishal";
	}

	@PutMapping
	public String update(@Valid @RequestBody BookDTO bookDTO) {
		return null;
	}

}