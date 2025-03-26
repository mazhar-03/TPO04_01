package org.example.tpo_04_01.repos;

import org.example.tpo_04_01.Book;
import org.springframework.data.repository.CrudRepository;

public interface IBookRepository extends CrudRepository<Book, Long> {
}
