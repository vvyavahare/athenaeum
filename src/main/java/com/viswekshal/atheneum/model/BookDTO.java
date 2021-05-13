package com.viswekshal.atheneum.model;

import java.time.Instant;

import javax.money.MonetaryAmount;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class BookDTO {

	private String id;
	private String title;
	private AuthorName author;
	private MonetaryAmount price;
	private Instant publishedOn;
	private Instant auditModifiedOn;
	private Instant auditCreatedOn;
	private String auditCreatedBy;
	private String auditUpdatedBy;
}
