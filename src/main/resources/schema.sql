-- Drop existing tables (in reverse order of dependencies)
DROP TABLE IF EXISTS book_authors;
DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS publisher;

-- Publisher table
CREATE TABLE publisher (
                           id INT AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(255) NOT NULL,
                           address VARCHAR(255),
                           phone VARCHAR(50)
);

-- Author table
CREATE TABLE author (
                        id INT AUTO_INCREMENT PRIMARY KEY,
                        first_name VARCHAR(255) NOT NULL,
                        last_name VARCHAR(255) NOT NULL
);

-- Book table
CREATE TABLE book (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      title VARCHAR(255) NOT NULL,
                      price DOUBLE NOT NULL,
                      publisher_id INT,
                      CONSTRAINT fk_book_publisher FOREIGN KEY (publisher_id) REFERENCES publisher(id)
);

-- Join table for Book <-> Author (Many-to-Many)
CREATE TABLE book_authors (
                              book_id INT NOT NULL,
                              authors_id INT NOT NULL,
                              PRIMARY KEY (book_id, authors_id),
                              CONSTRAINT fk_book_authors_book FOREIGN KEY (book_id) REFERENCES book(id),
                              CONSTRAINT fk_book_authors_author FOREIGN KEY (authors_id) REFERENCES author(id)
);
