package admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import admin.model.CustomerRating;
@Repository

public interface Ratingrepo extends MongoRepository<CustomerRating, String> {

}
