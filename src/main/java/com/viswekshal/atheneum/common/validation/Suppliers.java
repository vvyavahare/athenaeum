package com.viswekshal.atheneum.common.validation;

import java.util.function.Supplier;

import com.viswekshal.atheneum.common.exceptions.ObjectNotFoundException;
import com.viswekshal.atheneum.common.exceptions.ObjectNotFoundExceptionSupplier;
import static com.viswekshal.atheneum.common.validation.ValidationMessages.OBJECT_NOT_FOUND_BY_ID;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Suppliers {

	public static Supplier<ObjectNotFoundException> objectNotFound(String type, String id) {
		return ObjectNotFoundExceptionSupplier.of(OBJECT_NOT_FOUND_BY_ID, type, id);
	}
}
