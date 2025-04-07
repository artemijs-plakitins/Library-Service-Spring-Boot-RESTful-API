package com.demo.library_service.model;


import jakarta.persistence.*;

@Entity
@Table
public class Book {

    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue (
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )

    // Fields
    private Long id;
    private String name;
    private String author;
    private float price;
    private Integer quantity;

    // Empty constructor
    public Book () {
    }

    // Full constructor
    public Book (Long id, String name, String author,float price,Integer quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Constructor without id field, DB will generate the ID
    public Book (String name, String author,float price,Integer quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public Long getId () {
        return id;
    }
    public String getName () {
        return name;
    }
    public String getAuthor () {
        return author;
    }
    public float getPrice () {
        return price;
    }
    public Integer getQuantity () {
        return quantity;
    }


    // Setters
    public void setId (Long id) {
        this.id = id;
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setAuthor (String author) {
        this.author = author;
    }
    public void setPrice (float price) {
        this.price = price;
    }
    public void setQuantity (Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", in_stock+" + quantity + '}';
    }
}