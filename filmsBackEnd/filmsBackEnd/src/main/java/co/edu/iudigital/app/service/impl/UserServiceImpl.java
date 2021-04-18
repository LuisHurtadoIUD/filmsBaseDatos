package co.edu.iudigital.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import co.edu.iudigital.app.model.entity.User;
import co.edu.iudigital.app.model.repository.UserRepository;
import co.edu.iudigital.app.service.iface.UserService;


public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void create(User user) {
		//TODO: implementar		
	}

	@Override
	public User login(User user) throws Exception {
		User existsUser = userRepository.findByEmailAndPass(user.getEmail(), user.getPass());
		if(existsUser == null) {
			throw new Exception("Usuario y/o contraseña invalido!");
		}
		return existsUser;
	}

}