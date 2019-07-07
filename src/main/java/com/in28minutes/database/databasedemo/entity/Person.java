package com.in28minutes.database.databasedemo.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;
@Entity
@Data
@ToString
public class Person {
@Id
private long id;
@Column(name="name")
private String name;
@Column(name="location")
private String location;
@Column(name="birthDate")
private Date birthDate;
}
