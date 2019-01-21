package com.stackroute.muzix.muzix.repository;

import com.stackroute.muzix.muzix.domain.Track;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TrackRepository extends MongoRepository<Track,Integer> {
}
