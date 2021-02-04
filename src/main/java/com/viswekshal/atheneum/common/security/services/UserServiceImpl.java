package com.viswekshal.atheneum.common.security.services;

import com.viswekshal.atheneum.common.model.User;
import com.viswekshal.atheneum.common.security.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Vishal Vyavahare
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findByUserNameAndPassword(String username, String password) {
		return userRepository.findAllByUserAndPassword(username, password);
	}
}
