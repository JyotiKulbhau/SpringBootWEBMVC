package com.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.model.User;

@Service
public class UserService {

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "Rani", "rani@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"Kirti","kirti@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),"rajnikant","rajni1010@gmail.com"));
	}

	private List<User> store = new ArrayList<>();
	
	public List<User> getUsers(){
		return store;
	}

}
