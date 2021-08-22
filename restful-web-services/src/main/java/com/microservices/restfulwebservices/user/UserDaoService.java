package com.microservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> userList = new ArrayList<>();
	
	private static int count = 3;
	
	static {
		userList.add(new User(1, "Adam", new Date()));
		userList.add(new User(2, "Jack", new Date()));
		userList.add(new User(3, "Jawahar", new Date()));
	}
	
	public List<User> findAll() {
		return userList;
	}
	
	public User save(User addUser) {
		if(Objects.isNull(addUser.getId())) {
			addUser.setId(++count);
		} else if(userList.stream().anyMatch(item -> item.getId().equals(addUser.getId()))){
			throw new UserAlreadyExistException(String.valueOf(addUser.getId()));
		} else {
			throw new IdCannotBeGivenException(String.valueOf(addUser.getId()));
		}
		userList.add(addUser);
		return addUser;
	}
	
	public User findOne(int id) {
		Optional<User> user = userList.stream().filter(users -> users.getId().equals(id)).findFirst();
		return user.isPresent() ? user.get() : null;
	}
	
	public User deleteUser(int id) {
		Iterator<User> userIterator =userList.iterator();
		while(userIterator.hasNext()) {
			User currUser = userIterator.next();
			if(currUser.getId().equals(id)) {
				userIterator.remove();
				return currUser;
			}
		}
		return null;
	}
	
}
