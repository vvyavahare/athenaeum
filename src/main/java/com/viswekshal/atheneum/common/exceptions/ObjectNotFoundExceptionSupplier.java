package com.viswekshal.atheneum.common.exceptions;

import java.text.MessageFormat;
import java.util.function.Supplier;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ObjectNotFoundExceptionSupplier implements Supplier<ObjectNotFoundException> {

	private final String message;

	public static ObjectNotFoundExceptionSupplier of(String messageFormat, Object... args) {
		return of(MessageFormat.format(messageFormat, args));
	}

	public static ObjectNotFoundExceptionSupplier of(String message) {
		return new ObjectNotFoundExceptionSupplier(message);
	}

	@Override
	public ObjectNotFoundException get() {
		return new ObjectNotFoundException(message);
	}
}
