package com.viswekshal.atheneum.service;

import java.util.List;

import com.viswekshal.atheneum.model.Book;

public interface IBooksService {

	public List<Book> saveAllAndFlush(List<Book> books) ;
}
