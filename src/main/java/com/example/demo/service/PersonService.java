package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	//create
	public Person create(String firstName,String lastName,int mobile)
	{
		return personRepository.save(new Person(firstName,lastName,mobile));
	}
	//retrieve
	public List<Person> getAll(){
		return  personRepository.findAll();
	}
	
	public Person getByFirstName(String firstName) {
		return personRepository.findByFirstName(firstName);
	}
	//update
	public Person update(String firstName,String lastName,int mobile) {
		Person p = personRepository.findByFirstName(firstName);
		p.setLastName(lastName);
		p.setAge(mobile);
		return personRepository.save(p);
	}
	//delete
	public void deleteAll() {
		personRepository.deleteAll();
	}
	
	public void delete(String firstName) {
		Person p = personRepository.findByFirstName(firstName);
		personRepository.delete(p);
	}
}
