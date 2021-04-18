package co.edu.iudigital.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.app.model.entity.Movie;

/**
 * Intergace que permite gesionar el crud para la tabla Movie
 * @author Luis Hurtado
 *
 */

public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
