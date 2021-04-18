package co.edu.iudigital.app.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.app.model.entity.Movie;
import co.edu.iudigital.app.model.repository.GenderRopository;
import co.edu.iudigital.app.model.repository.MovieRepository;
import co.edu.iudigital.app.service.iface.MovieService;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private GenderRopository genderRepository;
	
	@Override
	public List<Movie> getAll() {
		List<Movie> movies = new ArrayList<>();
		movies = (List<Movie>) movieRepository.findAll();
		return movies;
	}

	@Override
	public void create(Movie movie) {
		boolean existsGender = genderRepository
				.existsById(movie.getGenderId().getId());
		if(existsGender) {
			movie.setCrateAt(LocalDateTime.now());
			movieRepository.save(movie);
		}
	}

	@Override
	public void edit(Movie movie, int movieId) {
		Optional<Movie> existsMovie = movieRepository.findById(movieId);
		if(existsMovie.isPresent()) {
			existsMovie.get().setMovieName(movie.getMovieName());
			existsMovie.get().setDescriptions(movie.getDescriptions());
			existsMovie.get().setActor(movie.getActor());
			existsMovie.get().setImage(movie.getImage());
			existsMovie.get().setRating(movie.getRating());
			existsMovie.get().setReleaseDate(movie.getReleaseDate());
			boolean existsGender = genderRepository
					.existsById(movie.getGenderId().getId());
			if(existsGender) {
				existsMovie.get().setGenderId(movie.getGenderId());
			}
			movieRepository.save(existsMovie.get());
		}
	}

	@Override
	public void delete(int movieId) {
		Optional<Movie> existsMovie = movieRepository.findById(movieId);
		if(existsMovie.isPresent()) {
			movieRepository.delete(existsMovie.get());
		}
	}

	@Override
	public void rate(Movie movie, int movieId) {
		Optional<Movie> existsMovie = movieRepository.findById(movieId);
		if(existsMovie.isPresent()) {
			existsMovie.get()
			.setRating(existsMovie.get().getRating() + movie.getRating());
			movieRepository.save(existsMovie.get());
		}
	}

}