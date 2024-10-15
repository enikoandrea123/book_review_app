package hu.unideb.inf.bookreview.data.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "User")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "createdAt", nullable = false)
    private LocalDateTime createdAt;

    public UserEntity() {}

    public UserEntity(long id, String username, String password, String email, LocalDateTime createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
