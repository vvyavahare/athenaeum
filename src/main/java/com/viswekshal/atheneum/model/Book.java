package com.viswekshal.atheneum.model;

import java.time.Instant;

import javax.money.MonetaryAmount;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id", referencedColumnName = "id")
	@JsonBackReference
	private AuthorName author;
//	
	// private MonetaryAmount price;

//	private Instant publishedOn;
//	private Instant auditModifiedOn;
//	private Instant auditCreatedOn;
//	private String auditCreatedBy;
//	private String auditUpdatedBy;
}
