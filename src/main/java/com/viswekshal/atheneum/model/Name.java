package com.viswekshal.atheneum.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "table_name")
public class Name {
	@Id
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;

	//private Address address;
}
