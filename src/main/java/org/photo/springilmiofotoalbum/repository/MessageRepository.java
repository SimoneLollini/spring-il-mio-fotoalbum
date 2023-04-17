package org.photo.springilmiofotoalbum.repository;

import org.photo.springilmiofotoalbum.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
