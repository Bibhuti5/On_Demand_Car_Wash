package admin.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import admin.model.washpack;
@Repository
public interface Washrepo extends MongoRepository<washpack,Integer> {

}
