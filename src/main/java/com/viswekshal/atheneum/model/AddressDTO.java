package com.viswekshal.atheneum.model;

import lombok.Data;

@Data
public class AddressDTO {
	private String id;
	private String addressLine1;
	private String addressLine2;
	private String postalCode;
	private String city;
	private String state;
	private String country;
	private AuthorNameDTO author;

}
