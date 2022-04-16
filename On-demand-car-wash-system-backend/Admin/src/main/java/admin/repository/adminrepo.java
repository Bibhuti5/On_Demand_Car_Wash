package admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import admin.model.Admin;
@Repository

public interface adminrepo extends MongoRepository<Admin, Integer> {
	

}
