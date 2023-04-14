package org.photo.springilmiofotoalbum.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "photos")
public class Photo {

    private String title;
    @Column(nullable = true)
    private String description;
    @Column(nullable = true)

    private String url;
    @Column(nullable = true)

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


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean getVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
