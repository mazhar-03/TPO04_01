package org.example.tpo_04_01.repos;

import org.example.tpo_04_01.Author;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IAuthorRepository extends CrudRepository<Author, Long> {
    @Query("SELECT a.firstName FROM Author a JOIN a.books b WHERE b.id = :bookId")
    List<String> listAuthorsOfGivenBooksById(Long bookId);

}
