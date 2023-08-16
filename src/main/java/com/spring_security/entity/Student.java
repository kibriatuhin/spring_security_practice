package com.spring_security.entity;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;


@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;

}
