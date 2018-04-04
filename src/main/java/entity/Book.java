package entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @JoinColumn(name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @JoinColumn (name = "name")
    private String name;

    @JoinColumn (name = "author")
    private String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
