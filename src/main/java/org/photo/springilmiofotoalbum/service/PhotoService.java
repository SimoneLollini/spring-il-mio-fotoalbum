package org.photo.springilmiofotoalbum.service;

import org.photo.springilmiofotoalbum.model.Photo;
import org.photo.springilmiofotoalbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhotoService {
    @Autowired
    PhotoRepository photoRepository;

    public List<Photo> getAllPhotos() {
        return photoRepository.findAll(Sort.by("id"));
    }

    ;

    public List<Photo> getPhotoFilteredByTitle(String keyword) {
        return photoRepository.findByTitleContainingIgnoreCase(keyword);
    }

    public Photo createPhoto(Photo formPhoto) {
        Photo newPhoto = new Photo();
        newPhoto.setId(formPhoto.getId());
        newPhoto.setTitle(formPhoto.getTitle());
        newPhoto.setDescription(formPhoto.getDescription());
        newPhoto.setUrl(formPhoto.getUrl());
        newPhoto.setVisibility(formPhoto.getVisibility());
        newPhoto.setCategories(formPhoto.getCategories());
        return photoRepository.save(newPhoto);
    }

    public Photo updatePhoto(Photo formPhoto, Integer id) throws RuntimeException {
        Photo photoToUpdate = getById(id);
        photoToUpdate.setId(formPhoto.getId());
        photoToUpdate.setTitle(formPhoto.getTitle());
        photoToUpdate.setDescription(formPhoto.getDescription());
        photoToUpdate.setUrl(formPhoto.getUrl());
        photoToUpdate.setVisibility(formPhoto.getVisibility());
        photoToUpdate.setCategories(formPhoto.getCategories());
        return photoRepository.save(photoToUpdate);
    }

    public Photo getById(Integer id) {
        Optional<Photo> photo = photoRepository.findById(id);
        if (photo.isPresent())
            return photo.get();
        else
            throw new RuntimeException(Integer.toString(id));
    }


}
