package org.dnex.panya.user.controller;

import java.util.List;

import org.dnex.panya.user.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/v1/userservice")
public interface UserService {

	@RequestMapping(value="/login" ,method=RequestMethod.GET)
	public User login(@RequestParam(value = "name", defaultValue = "unknown") String name) ;
	
	@RequestMapping(value="/user" ,method=RequestMethod.GET)
	public User get(@RequestParam(value = "id") String id) ;
	
	@RequestMapping(value="/users" ,method=RequestMethod.GET)
	public List<User> getAll(@RequestParam(value = "id") String id) ;
	
	
	@RequestMapping(value="/user" ,method=RequestMethod.PUT)
	public boolean save(User user) ;
	
}
