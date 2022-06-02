package com.udacity.DogMicroservices.repository;

import com.udacity.DogMicroservices.entity.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, Long> {
}
