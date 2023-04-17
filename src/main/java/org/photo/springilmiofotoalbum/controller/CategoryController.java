package org.photo.springilmiofotoalbum.controller;

import jakarta.validation.Valid;
import org.photo.springilmiofotoalbum.model.Category;
import org.photo.springilmiofotoalbum.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public String index(Model model) {
        List<Category> categories;
        categories = categoryService.getAllCategory();
        model.addAttribute("categories", categories);
        return "/categories/index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        Category newCategory = new Category();
        model.addAttribute("category", newCategory);
        return "/categories/create";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("category") Category formCategory, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors())
            return "/categories/create";
        categoryService.createCategory(formCategory);
        redirectAttributes.addFlashAttribute("message", "Categoria aggiunta!");
        return "redirect:/categories";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model) {
        try {
            Category category = categoryService.getById(id);
            model.addAttribute("category", category);
            List<Category> categories = categoryService.getAllCategory();
            model.addAttribute("categories", categories);
            return "/categories/edit";
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria non trovata");
        }
    }


    @PostMapping("/edit/{id}")
    public String update(@PathVariable("id") Integer id, @Valid @ModelAttribute("category") Category formCategory, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors())
            return "/categories/edit";
        try {
            Category updatedCategory = categoryService.updateCategory(formCategory, id);
            redirectAttributes.addFlashAttribute("message", "Categoria modificata!");
            return "redirect:/categories";
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria non trovata!");
        }
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Integer id, Model model) {
        try {
            Category category = categoryService.getById(id);
            model.addAttribute("category", category);
            return "/categories/show";
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria non trovata");
        }
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        try {
            boolean success = categoryService.deleteById(id);
            if (success)
                redirectAttributes.addFlashAttribute("message", "Categoria eliminata!");
            else {
                redirectAttributes.addFlashAttribute("message", "Non puoi eliminare!");
            }
        } catch (RuntimeException e) {
            redirectAttributes.addFlashAttribute("message", "Categoria non trovata!");
        }
        return "redirect:/categories";
    }

}
