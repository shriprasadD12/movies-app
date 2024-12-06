package dev.api.movies.Repository;

import dev.api.movies.Entities.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // Optional<Movie> findById(Long id);
    Optional<Movie> findMovieByImdbId(String imdbId);
}
