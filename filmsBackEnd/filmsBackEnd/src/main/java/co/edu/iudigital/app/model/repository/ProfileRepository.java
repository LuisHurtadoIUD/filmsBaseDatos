package co.edu.iudigital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.model.entity.Profile;

/**
 * Intergace que permite gesionar el crud para la tabla Profile
 * @author Luis Hurtado
 *
 */
public interface ProfileRepository extends CrudRepository<Profile, Integer>{

}
