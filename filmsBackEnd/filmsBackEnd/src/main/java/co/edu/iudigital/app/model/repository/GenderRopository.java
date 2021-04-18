package co.edu.iudigital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.model.entity.Gender;
/**
 * inteface que permite gestionar el crud para la tabla Gender
 * @author Luis Hurtado
 *
 */

public interface GenderRopository extends CrudRepository<Gender, Integer>{

}
