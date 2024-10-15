package hu.unideb.inf.bookreview.data.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Author")
public class AuthorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "biography")
    private String biography;
    @Column(name = "createdAt", nullable = false)
    private LocalDate createdAt;

    public AuthorEntity() {
    }

    public AuthorEntity(long id, String name, String biography, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.biography = biography;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public String getBiography() {
        return biography;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
