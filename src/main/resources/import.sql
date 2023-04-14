INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione ', 'Natura', 'https://picsum.photos/seed/natura/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione picsum', 'Picsum', 'https://picsum.photos/seed/picsum/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione barca', 'Barca', 'https://picsum.photos/seed/lake/300/300', 0);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione qualcosa', 'Tigre', 'https://picsum.photos/seed/deh/300/300', 0);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione animali', 'Tigre', 'https://picsum.photos/seed/animales/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione ', 'Natura', 'https://picsum.photos/seed/qualcosa/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione random', 'Picsum', 'https://picsum.photos/seed/random/300/300', 0);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione randomica', 'Barca', 'https://picsum.photos/seed/randomica/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione animali', 'Tigre', 'https://picsum.photos/seed/animales/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione ', 'Natura', 'https://picsum.photos/seed/asdfa/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione random', 'Picsum', 'https://picsum.photos/seed/random/300/300', 0);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione randomica', 'Barca', 'https://picsum.photos/seed/randomica/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione qualcosa', 'Tigre', 'https://picsum.photos/seed/animales/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione ', 'Natura', 'https://picsum.photos/seed/gfas/300/300', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione random', 'Picsum', 'https://picsum.photos/seed/random/300/300', 0);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('descrizione randomica', 'Barca', 'https://picsum.photos/seed/randomica/300/300', 1);

INSERT INTO db_photo_album.`user`(id, password, username)VALUES(1, '{noop}password', 'admin');
INSERT INTO db_photo_album.`user`(id, password, username)VALUES(2, '{noop}password', 'user');

INSERT INTO role (id, name) VALUES(1, 'ADMIN');
INSERT INTO role (id, name) VALUES(2, 'USER');

INSERT into user_roles(user_id, roles_id) VALUES(1, 1);
INSERT into user_roles(user_id, roles_id) VALUES(2, 2);

INSERT INTO db_photo_album.categories(name)VALUES('verde');
INSERT INTO db_photo_album.categories(name)VALUES('rosso');
INSERT INTO db_photo_album.categories(name)VALUES('giallo');

INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(1, 1);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(1, 2);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(1, 3);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(2, 3);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(2, 2);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(2, 1);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(3, 1);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(3, 2);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(3, 3);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(4, 1);
INSERT INTO db_photo_album.category_photos(photo_id, category_id)VALUES(4, 2);