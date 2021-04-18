package co.edu.iudigital.app.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * entidad de la tabla perfiles
 * @author Luis Hurtado
 *
 */

@Entity
@Table(name= "profiles")
public class Profile implements Serializable{
	
	@Id
	@Column(name="profile_id")
	private int id;
	@Column (name = "name_profile")
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
