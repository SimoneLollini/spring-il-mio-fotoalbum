package org.photo.springilmiofotoalbum.api;

import org.photo.springilmiofotoalbum.model.Photo;
import org.photo.springilmiofotoalbum.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/photos")
public class PhotoRestController {
    @Autowired
    private PhotoService photoService;

    @GetMapping
    public List<Photo> index(@RequestParam(name = "q") Optional<String> search) {
        if (search.isPresent())
            return photoService.findByVisibilityTrueTitleContaining(search.get());

        return photoService.photosVisibilityTrue();
    }

    @GetMapping("/{photoId}")
    public Photo show(@PathVariable("photoId") Integer id) {
        try {
            return photoService.getById(id);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foto non trovata!");
        }
    }
}
