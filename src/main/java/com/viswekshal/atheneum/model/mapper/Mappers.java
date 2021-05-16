package com.viswekshal.atheneum.model.mapper;

import static org.mapstruct.factory.Mappers.getMapper;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Mappers {
	public static final BooksMapper BOOKS_MAPPER = getMapper(BooksMapper.class);
}
