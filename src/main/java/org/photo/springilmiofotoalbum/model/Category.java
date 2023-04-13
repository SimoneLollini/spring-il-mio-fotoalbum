package org.photo.springilmiofotoalbum.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    private String name;
    @ManyToMany(mappedBy = "categories")
    private List<Photo> photos;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
