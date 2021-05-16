package com.viswekshal.atheneum.model;

import java.util.Set;

import lombok.Data;

@Data
public class AuthorNameDTO {

	private String id;

	private String firstName;

	private String middleName;

	private String lastName;

	private AddressDTO address;

	private Set<BookDTO> books;
}
