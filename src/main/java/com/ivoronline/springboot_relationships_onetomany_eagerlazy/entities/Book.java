package com.ivoronline.springboot_relationships_onetomany_eagerlazy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  title;

  //CONSTRUCTORS
  public Book() {}
  public Book(String title) {
    this.title = title;
  }

}
