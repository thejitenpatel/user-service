package com.thejitenpatel.user.service.enitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {

    @Id
    private String userId;

    @Column()
    private String name;

    @Column()
    private String email;

    @Transient
    private List<Ratings> ratings = new ArrayList<>();
}
