package org.example.tpo_04_01;

import org.example.tpo_04_01.repos.IAuthorRepository;
import org.example.tpo_04_01.repos.IBookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Tpo0401Application {

    public static void main(String[] args) {
//        SpringApplication.run(Tpo0401Application.class, args);

        ApplicationContext context = SpringApplication.run(Tpo0401Application.class, args);
        IBookRepository bookRepository = context.getBean(IBookRepository.class);

        // Showing that each book is published by one publisher
        // but publisher can publish many books
//    for(long i = 0; i <= 20; i++) { //since we have 20 publisher on db
//        for (Book book : bookRepository.listBooksByPublisherId(i))
//            System.out.println(book);
//        System.out.println();
//    }

        IAuthorRepository authorRepository = context.getBean(IAuthorRepository.class);

        // Showing that each book can have multiple authors
//        for (long i = 0; i <= 40; i++) { //since we have 40 books on db
//            for (String authors_name : authorRepository.listAuthorsOfGivenBooksById(i))
//                System.out.println(authors_name);
//            System.out.println();
//        }

        // Showing that each person can be the author of multiple books
        for (long i = 0; i < 20; i++) { //since we have 20 authors on db
            for (Book b : bookRepository.listBooksByAuthorId(i))
                System.out.println(b);
            System.out.println();
        }


    }
}
