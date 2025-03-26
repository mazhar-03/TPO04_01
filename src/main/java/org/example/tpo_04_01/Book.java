package org.example.tpo_04_01;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private double price;

    @ManyToOne
    private Publisher publisherId;

    @ManyToMany
    private List<Author> authors = new ArrayList<>();

    public Book() {}
    public Long getId() {
        return id;
    }
    public Book(String title, String author, double price, Publisher publisherId, List<Author> authors) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisherId = publisherId;
        this.authors = authors;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisherId;
    }

    public void setPublisher(Publisher publisher) {
        this.publisherId = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publisherId=" + publisherId +
                ", authors=" + authors +
                '}';
    }
}

