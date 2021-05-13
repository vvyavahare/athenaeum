package com.viswekshal.atheneum.model;

import java.time.Instant;

import javax.money.MonetaryAmount;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "table_books")
@NoArgsConstructor
@AllArgsConstructor
public class Book {

	@Id
//    @GeneratedValue(generator = "platform-uuid")
//    @GenericGenerator(name = "platform-uuid",
//        strategy = "com.ispring.dataworkbench.common.PlatformUUIDGenerator")
	@Column(name = "id")
	private String id;

	@Column(name = "title")
	private String title;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id", referencedColumnName = "id")
	private AuthorName author;
//	
	// private MonetaryAmount price;

//	private Instant publishedOn;
//	private Instant auditModifiedOn;
//	private Instant auditCreatedOn;
//	private String auditCreatedBy;
//	private String auditUpdatedBy;
}
