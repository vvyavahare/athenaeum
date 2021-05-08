package com.viswekshal.atheneum.model;

import java.time.Instant;

import javax.money.MonetaryAmount;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "table_books")
public class Book {

	@Id
//    @GeneratedValue(generator = "platform-uuid")
//    @GenericGenerator(name = "platform-uuid",
//        strategy = "com.ispring.dataworkbench.common.PlatformUUIDGenerator")
    @Column(name = "id")
    private String id;
	
	@Column(name = "title")
	private String title;

//	@Column(name ="name")
//	private Name author;
//	
	//private MonetaryAmount price;
	
//	private Instant publishedOn;
//	private Instant auditModifiedOn;
//	private Instant auditCreatedOn;
//	private String auditCreatedBy;
//	private String auditUpdatedBy;
}
