package hu.unideb.inf.bookreview.data.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Review")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "comment", nullable = false)
    private String comment;
    @Column(name = "rating", nullable = false)
    private int rating;
    @Column(name = "userId")
    private long userId;
    @Column(name = "bookId")
    private long bookId;
    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;

    public ReviewEntity() {
    }

    public ReviewEntity(long id, String comment, int rating, long userId, long bookId, LocalDateTime createdAt) {
        this.id = id;
        this.comment = comment;
        this.rating = rating;
        this.userId = userId;
        this.bookId = bookId;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public int getRating() {
        return rating;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public long getBookId() {
        return bookId;
    }

    public long getUserId() {
        return userId;
    }

    public String getComment() {
        return comment;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }
}
