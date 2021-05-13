package com.viswekshal.atheneum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "table_address")
public class Address {
	@Id
	@Column(name = "id")
	private String id;
	private String addressLine1;
	private String addressLine2;
	private String postalCode;
	private String city;
	private String state;
	private String country;
	@OneToOne(mappedBy = "address")
	private AuthorName author;

}
