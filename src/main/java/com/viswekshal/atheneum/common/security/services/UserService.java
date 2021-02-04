package com.viswekshal.atheneum.common.security.services;

import com.viswekshal.atheneum.common.model.User;

/**
 * @author Vishal Vyavahare
 */
public interface UserService {

	User createUser(User user);

	User findByUserNameAndPassword(String username, String password);
}
