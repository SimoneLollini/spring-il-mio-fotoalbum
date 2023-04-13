INSERT INTO db_photo_album.`user`(id, password, username)VALUES(1, '{noop}password', 'admin');
INSERT INTO db_photo_album.`user`(id, password, username)VALUES(2, '{noop}password', 'user');

INSERT INTO role (id, name) VALUES(1, 'ADMIN');
INSERT INTO role (id, name) VALUES(2, 'USER');

INSERT into user_roles(user_id, roles_id) VALUES(1, 1);
INSERT into user_roles(user_id, roles_id) VALUES(2, 2);