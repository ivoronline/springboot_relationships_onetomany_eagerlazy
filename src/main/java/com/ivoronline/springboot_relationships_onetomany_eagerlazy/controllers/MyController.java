package com.ivoronline.springboot_relationships_onetomany_eagerlazy.controllers;

import com.ivoronline.springboot_relationships_onetomany_eagerlazy.entities.Author;
import com.ivoronline.springboot_relationships_onetomany_eagerlazy.entities.Book;
import com.ivoronline.springboot_relationships_onetomany_eagerlazy.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  @Autowired AuthorRepository authorRepository;

  @ResponseBody
  @RequestMapping("/GetAuthor")
  public String getAuthor() {

    //GET AUTHOR
    Author author = authorRepository.findById(1).get();  //EAGER => Fetches Children

    //LOG
    System.out.println("DEBUG");

    //GET BOOKS
    Book book = author.books.iterator().next();          //LAZY  => Fetches Children

    //RETURN SOMETHING TO BROWSER
    return "Hello from Controller";

  }

}
