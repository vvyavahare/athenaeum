package com.viswekshal.atheneum.common.exceptions;

import java.text.MessageFormat;

public class ObjectNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7036056240137977824L;

	public ObjectNotFoundException(String message) {
		super(message);
	}

	public ObjectNotFoundException(String message, Object... args) {
		super(MessageFormat.format(message, args));
	}
}