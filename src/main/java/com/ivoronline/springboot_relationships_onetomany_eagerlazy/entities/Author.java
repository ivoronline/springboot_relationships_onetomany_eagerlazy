package com.ivoronline.springboot_relationships_onetomany_eagerlazy.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Author {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  //RELATIONSHIPS
  @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
  public Set<Book> books;

  //CONSTRUCTORS
  public Author() {}
  public Author(String name, Integer age, Set<Book> books) {
    this.name  = name;
    this.age   = age;
    this.books = books;
  }

}





