package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * Entidad de la tabla usuarios
 * @author Luis Hurtado
 *
 */

@Entity
@Table(name = "users")
public class User implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	@Column(name = "name_user")
	private String userName;
	private String email;
	private String pass;
	@Column(name="create_at")
	private LocalDateTime createAt;
	@ManyToOne
	@JoinColumn(name="profile_id")
	private Profile profileId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public LocalDateTime getCreateAt() {
		return createAt;
	}
	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}
	public Profile getProfileId() {
		return profileId;
	}
	public void setProfileId(Profile profileId) {
		this.profileId = profileId;
	}
	
	
	

}
