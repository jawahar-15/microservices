package com.microservices.restfulwebservices.user;

import java.net.URI;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService userService;
	
	@GetMapping(path = "/users")
	public List<User> getUsers() {
		List<User> users = userService.findAll();
		if( users.isEmpty()) {
			throw new NoUsersFoundException(" No users Found");
		} else {
			return users;
		}
	}
	
	@GetMapping(path = "/users/{id}")
	private EntityModel<User> getUser(@PathVariable int id) {
		User getUser = userService.findOne(id);
		if(Objects.nonNull(getUser)) {			
			EntityModel<User> model = EntityModel.of(getUser);
//			model.
			WebMvcLinkBuilder linktoAllusers = linkTo(methodOn(this.getClass()).getUsers());
			model.add(linktoAllusers.withRel("all-users"));
			return model;
		} else {
			throw new UserNotFoundException(" id - " + id);
		}
	}

	@PostMapping(path ="/users")
	public ResponseEntity<User> createUser(@Validated @RequestBody User user) {
		User savedUser =  userService.save(user);
		URI uriLocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(uriLocation).build();
	}

	@DeleteMapping(path ="/users/{id}")
	public void deleteUser(@PathVariable int id) {
		User deletedUser =  userService.deleteUser(id);
		if(Objects.isNull(deletedUser)) {			
			throw new UserNotFoundException(" id - " + id);
		}

	}

}
