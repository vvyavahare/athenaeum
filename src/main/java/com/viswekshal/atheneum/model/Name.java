package com.viswekshal.atheneum.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity(name = "Name")
@Table(name = "table_name")
public class Name {
	private String firstName;
	private String middleName;
	private String lastName;
	private String id;
	private Address address;
}
