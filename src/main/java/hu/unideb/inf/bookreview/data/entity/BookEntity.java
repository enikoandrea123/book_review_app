package hu.unideb.inf.bookreview.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Book")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "authorId")
    private long authorId;
    @Column(name = "categoryId")
    private long categoryId;
    @Column(name = "publishedYear")
    private int publishedYear;
    @Column(name = "isbn", unique = true)
    private String isbn;
    @Column(name = "createdAt", nullable = false)
    private String createdAt;

    public BookEntity() {
    }

    public BookEntity(long id, String title, long authorId, long categoryId, int publishedYear, String isbn, String createdAt) {
        this.id = id;
        this.title = title;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.publishedYear = publishedYear;
        this.isbn = isbn;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public long getAuthorId() {
        return authorId;
    }

    public long getCategoryId() {
        return categoryId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthorId(long authorId) {
        this.authorId = authorId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
