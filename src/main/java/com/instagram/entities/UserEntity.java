package com.instagram.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "logincred")
@Data
public class UserEntity {

    @Id
    @Column(name="U_ID")
    private String username;
    @Column(name = "U_PWD")
    private String password;
}
