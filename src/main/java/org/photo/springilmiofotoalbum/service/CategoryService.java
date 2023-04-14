package org.photo.springilmiofotoalbum.service;

import org.photo.springilmiofotoalbum.model.Category;
import org.photo.springilmiofotoalbum.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory() {
        return categoryRepository.findAll(Sort.by("name"));
    }

    public Category getById(Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent())
            return category.get();
        else
            throw new RuntimeException(Integer.toString(id));
    }

    public Category createCategory(Category formCategory) throws RuntimeException {
        Category newCategory = new Category();
        newCategory.setId(formCategory.getId());
        newCategory.setName(formCategory.getName());
        return categoryRepository.save(newCategory);
    }

    public Category updateCategory(Category formCategory, Integer id) throws RuntimeException {
        Category categoryToUpdate = getById(id);
        categoryToUpdate.setId(formCategory.getId());
        categoryToUpdate.setName(formCategory.getName());
        return categoryRepository.save(categoryToUpdate);
    }

    public boolean deleteById(Integer id) throws RuntimeException {
        try {
            categoryRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
