package io.github.com.springmongodemo.repository;

import io.github.com.springmongodemo.model.REGIONS;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegionRepository extends MongoRepository<REGIONS, String> {
    REGIONS findBy_id(ObjectId _id);
}
