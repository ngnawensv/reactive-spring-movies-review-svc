package moviesreviewsvc.repository;

import moviesreviewsvc.domain.Review;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface ReviewRepository extends ReactiveMongoRepository<Review,String> {
Flux<Review> findReviewsByMovieInfoId(Long movieInfoId);
}
