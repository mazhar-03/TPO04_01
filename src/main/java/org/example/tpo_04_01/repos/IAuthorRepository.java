package org.example.tpo_04_01.repos;

import org.example.tpo_04_01.Author;
import org.springframework.data.repository.CrudRepository;

public interface IAuthorRepository extends CrudRepository<Author, Long> {
}
