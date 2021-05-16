package com.viswekshal.atheneum.model.mapper;

import java.util.Optional;

import org.mapstruct.*;

import com.viswekshal.atheneum.model.Book;
import com.viswekshal.atheneum.model.BookDTO;

@Mapper(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.SET_TO_NULL, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface BooksMapper {

//	@Mapping(target = "creationDate", ignore = true)
//	@Mapping(target = "lastUpdateDate", ignore = true)
//	@Mapping(target = "createdBy", ignore = true)
//	@Mapping(target = "parentGroupId", ignore = true)
//	@Mapping(target = "skillId", ignore = true)
//	@Mapping(target = "nodeId", ignore = true)
//	@Mapping(target = "group", ignore = true)
//	@Mapping(target = "integrationGroupJson", ignore = true)
	void updateEntity(@MappingTarget Book target, BookDTO dto);

	Book toEntity(BookDTO b);

	BookDTO toDto(Book b);

}