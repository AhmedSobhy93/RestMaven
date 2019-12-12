package com.ist.rest.user;

import java.util.Map;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserController {

	// solved in Spring by Dependency Injection
	UserService userService;

	public UserController() {
		userService = new UserService();
	}

//	@Path("")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void addUser(User user) {
		userService.addUser(user);
	}

	@Path("/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteUser(@PathParam("id") String id) {
		userService.deleteUser(id);
	}

	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@PathParam("id") String id) {
		return userService.getUser(id);
	}

	// @Path()
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Map<String, User> getUsers() {
		return userService.getUsers();
	}

}
