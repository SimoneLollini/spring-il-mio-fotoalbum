package org.photo.springilmiofotoalbum.service;

import org.photo.springilmiofotoalbum.model.Message;
import org.photo.springilmiofotoalbum.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    MessageRepository messageRepository;

    public Message createMessage(Message formMessage) throws RuntimeException {
        Message newMessage = new Message();
        newMessage.setId(formMessage.getId());
        newMessage.setText(formMessage.getText());
        newMessage.setEmail(formMessage.getEmail());
        return messageRepository.save(newMessage);
    }

    public Message getById(Integer id) {

        Optional<Message> message = messageRepository.findById(id);
        if (message.isPresent())
            return message.get();
        else
            throw new RuntimeException(Integer.toString(id));

    }

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

}
