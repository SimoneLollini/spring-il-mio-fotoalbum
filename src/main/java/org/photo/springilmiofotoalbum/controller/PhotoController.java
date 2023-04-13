package org.photo.springilmiofotoalbum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/photos")
public class PhotoController {
    @GetMapping
    public String index(){
        return "/photos/index";
    }
    @GetMapping("/create")
    public String create(){
        return "/photos/create";
    }
    @PostMapping("/create")
    public String store(){
        return "/photos/create";
    }

    @PostMapping("/edit")
    public String update(){
        return "/photos/edit";
    }
    @GetMapping("/show")
    public String show(){
        return "/photos/show";
    }
}
