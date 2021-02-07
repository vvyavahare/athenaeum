package com.viswekshal.atheneum.model;

import java.time.Instant;

import javax.money.MonetaryAmount;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Book {

	private String id;
	private String title;
	private Name author;
	private MonetaryAmount price;
	private Instant publishedOn;
	private Instant auditModifiedOn;
	private Instant auditCreatedOn;
	private String auditCreatedBy;
	private String auditUpdatedBy;
}
