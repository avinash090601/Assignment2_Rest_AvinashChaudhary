package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pubId;

    private String name;
    private String address;

    @OneToMany(mappedBy = "publisher")
    @JsonManagedReference
    private List<Book> books;

    public Publisher() {}

    public Publisher(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getters and Setters
    public Long getPubId() { return pubId; }
    public void setPubId(Long pubId) { this.pubId = pubId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}
