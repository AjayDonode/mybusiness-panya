package org.dnex.panya.user.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.dnex.panya.user.model.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserService {
	private final AtomicLong counter = new AtomicLong();

	@Override
	public User login(
			@RequestParam(value = "name", defaultValue = "unknown") String name) {
		User user = new User();
		user.setId(counter.incrementAndGet());
		user.setName("Ajay");
		user.setLastName("Donode");
		// user.se
		return user;
	}

	@Override
	public User get(String id) {
		User user = new User();
		user.setId(counter.incrementAndGet());
		user.setName("Ajayk");
		user.setLastName("Donode");
		// user.se
		return user;
	}

	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAll(String id) {
		List<User> users = new ArrayList<User>();

		User user = new User();
		user.setId(counter.incrementAndGet());
		user.setName("Ajayk");
		user.setLastName("Donode");

		users.add(user);
		return users;
	}
}
