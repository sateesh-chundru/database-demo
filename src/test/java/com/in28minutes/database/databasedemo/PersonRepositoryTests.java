package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.repository.PersonJpaRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTests {
	@Autowired
	PersonJpaRepository personRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void insertPerson() {
		Person person=new Person();
		person.setBirthDate(new Date());
		person.setLocation("Hyderabad"); 
		person.setName("Sateesh");  
	    personRepository.insert(person);
	    personRepository.insert(person);
	    
	    System.out.println(person.toString());
	    
	}
}
