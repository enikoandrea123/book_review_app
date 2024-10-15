package hu.unideb.inf.bookreview.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class BookReviewController {

    public static void main(String[] args) {
        SpringApplication.run(BookReviewController.class, args);
    }

}