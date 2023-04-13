package org.photo.springilmiofotoalbum.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "photos")
public class Photo {
    private String title;
    private String description;
    private String url;
    private boolean visibility;

    //definire la relazione di tipo many to many con category
    @ManyToMany
    @JoinTable(
            name = "category_photos",
            joinColumns = @JoinColumn(name = "photo_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

}
