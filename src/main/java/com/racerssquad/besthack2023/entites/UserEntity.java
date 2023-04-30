package com.racerssquad.besthack2023.entites;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "user_ent", schema = "public", uniqueConstraints = {@UniqueConstraint(columnNames = "email")})
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    @SequenceGenerator(name="user_id_seq", sequenceName = "user_id_sequence", initialValue = 1, allocationSize = 1)
    @Column(name = "id", columnDefinition = "serial primary key")
    private Long id;

    @Column(name = "password", columnDefinition = "varchar(255) NOT NULL")
    private String password;
    @Column(name = "email", columnDefinition = "varchar(255) NOT NULL")
    private String email;

    public UserEntity(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserEntity() {

    }
}