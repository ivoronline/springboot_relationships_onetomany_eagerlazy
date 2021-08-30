package com.ivoronline.springboot_relationships_onetomany_eagerlazy.repositories;

import com.ivoronline.springboot_relationships_onetomany_eagerlazy.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> { }
