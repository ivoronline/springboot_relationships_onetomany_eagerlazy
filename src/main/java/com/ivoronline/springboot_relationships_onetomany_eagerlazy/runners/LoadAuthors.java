package com.ivoronline.springboot_relationships_onetomany_eagerlazy.runners;

import com.ivoronline.springboot_relationships_onetomany_eagerlazy.entities.Author;
import com.ivoronline.springboot_relationships_onetomany_eagerlazy.entities.Book;
import com.ivoronline.springboot_relationships_onetomany_eagerlazy.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.Set;

@Component
public class LoadAuthors implements CommandLineRunner {

  @Autowired AuthorRepository authorRepository;

  @Override
  @Transactional
  public void run(String... args) {
    authorRepository.save(new Author("John" , 20, Set.of(new Book("Dogs"  ), new Book("Cats"   ))));
    authorRepository.save(new Author("Bill" , 30, Set.of(new Book("Cars"  ), new Book("Planes" ))));
    authorRepository.save(new Author("Nancy", 40, Set.of(new Book("Apples"), new Book("Oranges"))));
  }

}

