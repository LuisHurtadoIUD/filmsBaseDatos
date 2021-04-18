package co.edu.iudigital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.model.entity.User;


/**
 * Intergace que permite gesionar el crud para la tabla user
 * @author Luis Hurtado
 *
 */

public interface UserRepository extends CrudRepository<User, Integer>{
	
	public User findByEmailAndPass(String email, String pass);

}
