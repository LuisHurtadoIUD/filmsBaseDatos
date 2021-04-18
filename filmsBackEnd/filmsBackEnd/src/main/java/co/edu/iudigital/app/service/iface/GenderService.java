package co.edu.iudigital.app.service.iface;

import java.util.List;

import co.edu.iudigital.app.model.entity.Gender;

/**
 * interface para separar los servicios
 * @author Luis Hurtado
 *
 */

public interface GenderService {
	// lista todos los géneros
	public List<Gender> getAll();
	
}