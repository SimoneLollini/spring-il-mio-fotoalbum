package org.photo.springilmiofotoalbum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/photos")
public class PhotoController {
    public String index(){
        return "/photos/index";
    }
}