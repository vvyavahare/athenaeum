package com.viswekshal.atheneum.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.id.GUIDGenerator;
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

import com.viswekshal.atheneum.model.Address;
import com.viswekshal.atheneum.model.AuthorName;
import com.viswekshal.atheneum.model.Book;
import com.viswekshal.atheneum.model.BookDTO;
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

//			Address address = Address.builder().id(UUID.randomUUID().toString()).addressLine1("Thekchen Choeling")
//					.addressLine2("McLeod Ganj,").city("Dharamshala").state("Himachal Pradesh (H.P.)").country("India")
//					.postalCode("176219").build();
//			AuthorName a = AuthorName.builder().id(UUID.randomUUID().toString()).firstName("Dalai").lastName("lama")
//					.address(address).build();
//			Book b = Book.builder().id(UUID.randomUUID().toString()).title("Freedom in Exile").author(a).build();

			Address address = Address.builder().id(UUID.randomUUID().toString()).addressLine1(" c/o Scholastic Inc.")
					.addressLine2("557 Broadway").city("New York").state("NY").country("USA").postalCode("10012-3999")
					.build();
			AuthorName a = AuthorName.builder().id(UUID.randomUUID().toString()).firstName("J.").lastName("K.")
					.lastName("Rowling").address(address).build();
			Book b1 = Book.builder().id(UUID.randomUUID().toString()).title("HARRY POTTER AND THE PHILOSOPHER’S STONE")
					.author(a).build();
			Book b2 = Book.builder().id(UUID.randomUUID().toString()).title("HARRY POTTER AND THE CHAMBER OF SECRETS")
					.author(a).build();

			List<Book> booksList = new ArrayList<Book>();
			booksList.add(b1);
			booksList.add(b2);
			booksService.saveAllAndFlush(booksList);

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