package co.edu.iudigital.app.model.entity;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
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
 * Entidadd de la tabla peliculas
 * @author Luis Hurtado
 *
 */

@Entity
@Table(name ="movie")
public class Movie implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="movie_id")
	private int id;
	@Column(name="name_movie")
	private String movieName;
	private String descriptions;
	private String image;
	@Column
	private LocalDateTime crateAt;
	@Column
	private LocalDate releaseDate;
	private String Actor;
	@ManyToOne
	@JoinColumn(name="gender_id")
	private Profile genderId;
	private int rating;
	
	public void Movie() {
		
	}
	
	

	public Movie(int id, String movieName, String descriptions, String image, LocalDateTime crateAt,
			LocalDate releaseDate, String actor, Profile genderId, int rating) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.descriptions = descriptions;
		this.image = image;
		this.crateAt = crateAt;
		this.releaseDate = releaseDate;
		Actor = actor;
		this.genderId = genderId;
		this.rating = rating;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDateTime getCrateAt() {
		return crateAt;
	}

	public void setCrateAt(LocalDateTime crateAt) {
		this.crateAt = crateAt;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getActor() {
		return Actor;
	}

	public void setActor(String actor) {
		Actor = actor;
	}

	public Profile getGenderId() {
		return genderId;
	}

	public void setGenderId(Profile genderId) {
		this.genderId = genderId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
	
}
