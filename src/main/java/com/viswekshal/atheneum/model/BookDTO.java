package com.viswekshal.atheneum.model;

import java.time.Instant;
import java.util.Set;

import javax.money.MonetaryAmount;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookDTO {

	private String id;
	private String title;
	private MonetaryAmount price;
	private Instant publishedOn;
	private Instant auditModifiedOn;
	private Instant auditCreatedOn;
	private String auditCreatedBy;
	private String auditUpdatedBy;
	private AuthorNameDTO author;
}
