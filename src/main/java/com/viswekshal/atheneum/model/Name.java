package com.viswekshal.atheneum.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity(name = "Name")
public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	private String id;
	private Address address;
}
