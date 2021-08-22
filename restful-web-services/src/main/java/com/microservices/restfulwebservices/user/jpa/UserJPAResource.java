package com.microservices.restfulwebservices.user.jpa;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
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

import com.microservices.restfulwebservices.user.NoUsersFoundException;
import com.microservices.restfulwebservices.user.User;
import com.microservices.restfulwebservices.user.UserNotFoundException;

@RestController
public class UserJPAResource {
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PostRepository postRepository;

	@GetMapping(path = "/jpa/users")
	public List<User> getUsers() {
		List<User> users = userRepository.findAll();
		if( users.isEmpty()) {
			throw new NoUsersFoundException(" No users Found");
		} else {
			return users;
		}
	}
	
	@GetMapping(path = "/jpa/users/{id}")
	private EntityModel<User> getUser(@PathVariable int id) {
		Optional<User> getUser = userRepository.findById(id);
		if(getUser.isPresent()) {			
			EntityModel<User> model = EntityModel.of(getUser.get());
//			model.
			WebMvcLinkBuilder linktoAllusers = linkTo(methodOn(this.getClass()).getUsers());
			model.add(linktoAllusers.withRel("all-users"));
			return model;
		} else {
			throw new UserNotFoundException(" id - " + id);
		}
	}

	@PostMapping(path ="/jpa/users")
	public ResponseEntity<User> createUser(@Validated @RequestBody User user) {
		User savedUser =  userRepository.save(user);
		URI uriLocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(savedUser.getId()).toUri();
		return ResponseEntity.created(uriLocation).build();
	}

	@DeleteMapping(path ="/jpa/users/{id}")
	public void deleteUser(@PathVariable int id) {
			userRepository.deleteById(id);
//		if(Objects.isNull(deletedUser)) {			
//			throw new UserNotFoundException(" id - " + id);
//		}

	}

	@GetMapping(path = "/jpa/users/{id}/posts")
	private List<Post> getPosts(@PathVariable int id) {
		Optional<User> getUser = userRepository.findById(id);
		if(getUser.isPresent()) {			
			return getUser.get().getPosts();
		} else {
			throw new UserNotFoundException(" id - " + id);
		}
	}

	@PostMapping(path = "/jpa/users/{id}/posts")
	private ResponseEntity<Post> setPosts(@PathVariable int id , @RequestBody Post post) {
		Optional<User> getUser = userRepository.findById(id);
		if(getUser.isPresent()) {			
			User user= getUser.get();
			post.setUser(user);
			postRepository.save(post);
			URI uriLocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(post.getId()).toUri();
			return ResponseEntity.created(uriLocation).build();
		} else {
			throw new UserNotFoundException(" id - " + id);
		}
	}

}
