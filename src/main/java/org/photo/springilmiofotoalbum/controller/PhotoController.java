package org.photo.springilmiofotoalbum.controller;

import jakarta.validation.Valid;
import org.photo.springilmiofotoalbum.model.Category;
import org.photo.springilmiofotoalbum.model.Photo;
import org.photo.springilmiofotoalbum.service.CategoryService;
import org.photo.springilmiofotoalbum.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/photos")
public class PhotoController {
    @Autowired
    PhotoService photoService;

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public String index(Model model, @RequestParam(name = "q") Optional<String> keyword) {
        List<Photo> result;
        if (keyword.isPresent()) {
            result = photoService.getPhotoFilteredByTitle(keyword.get());
            model.addAttribute("keyword", keyword.get());
        } else {
            result = photoService.getAllPhotos();
        }
        model.addAttribute("photos", result);
        return "/photos/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Photo newPhoto = new Photo();
        model.addAttribute("photo", newPhoto);
        model.addAttribute("categories", categoryService.getAllCategory());
        return "/photos/create";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("photo") Photo formPhoto, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors())
            return "/photos/create";
        photoService.createPhoto(formPhoto);
        redirectAttributes.addFlashAttribute("message", "Foto aggiunta con successo!");
        return "redirect:/photos";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        try {
            Photo photo = photoService.getById(id);
            model.addAttribute("photo", photo);
            List<Category> categories = categoryService.getAllCategory();
            model.addAttribute("categories", categories);
            return "/photos/edit";
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foto non trovata");
        }
    }


    @PostMapping("/edit/{id}")
    public String update(@PathVariable("id") Integer id, @Valid @ModelAttribute("photo") Photo formPhoto, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors())
            return "/photos/edit";
        try {
            Photo updatedPhoto = photoService.updatePhoto(formPhoto, id);
            redirectAttributes.addFlashAttribute("message", "Foto modificata!");
            return "redirect:/photos";
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foto non trovata!");
        }
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Integer id, Model model) {
        try {
            Photo photo = photoService.getById(id);
            model.addAttribute("photo", photo);
            return "/photos/show";
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Foto non trovata");
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        try {
            boolean success = photoService.deleteById(id);
            if (success)
                redirectAttributes.addFlashAttribute("message", "Foto eliminata!");
            else {
                redirectAttributes.addFlashAttribute("message", "Non puoi eliminare!");
            }
        } catch (RuntimeException e) {
            redirectAttributes.addFlashAttribute("message", "Pizza non trovata!");
        }
        return "redirect:/photos";
    }

}
