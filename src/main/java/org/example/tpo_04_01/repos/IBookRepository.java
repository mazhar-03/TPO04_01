package org.example.tpo_04_01.repos;

import jakarta.persistence.Entity;
import org.example.tpo_04_01.Book;
import org.example.tpo_04_01.Publisher;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBookRepository extends CrudRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE b.publisher.id = :id")
    List<Book> listBooksByPublisherId(Long id);

    @Query("SELECT b FROM Book b JOIN b.authors a WHERE a.id = :id")
    List<Book> listBooksByAuthorId(Long id);
}
