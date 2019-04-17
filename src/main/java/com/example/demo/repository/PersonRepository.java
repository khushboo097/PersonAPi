package com.example.demo.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {
	
	public Person findByFirstName(String firstName);
	//public Person findByMobile(int mobile);
	
}
