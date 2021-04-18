package co.edu.iudigital.app.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.app.model.entity.User;
import co.edu.iudigital.app.service.iface.UserService;



/**
 * 
 * Controlador para la clase usuario
 * @author Luis Hurtado
 *
 */

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/login")
	public User login(@RequestBody User user) throws Exception{
		return userService.login(user);
	}
	

}
