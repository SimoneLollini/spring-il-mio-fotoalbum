package org.photo.springilmiofotoalbum.api;

import jakarta.validation.Valid;
import org.photo.springilmiofotoalbum.model.Message;
import org.photo.springilmiofotoalbum.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/messages")
public class MessageRestController {
    @Autowired
    private MessageService messageService;

    @PostMapping
    public boolean create(@Valid @RequestBody Message message, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            bindingResult.getAllErrors();
        return true;
    }
}
