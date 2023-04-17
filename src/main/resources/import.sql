INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.', 'Natura', 'https://picsum.photos/seed/natura/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.picsum', 'Picsum', 'https://picsum.photos/seed/picsum/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.barca', 'Barca', 'https://picsum.photos/seed/lake/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.qualcosa', 'Tigre', 'https://picsum.photos/seed/deh/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.animali', 'Tigre', 'https://picsum.photos/seed/animales/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.', 'Natura', 'https://picsum.photos/seed/qualcosa/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.random', 'Picsum', 'https://picsum.photos/seed/random/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.randomica', 'Barca', 'https://picsum.photos/seed/randomica/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.animali', 'Tigre', 'https://picsum.photos/seed/animales/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.', 'Natura', 'https://picsum.photos/seed/asdfa/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.random', 'Picsum', 'https://picsum.photos/seed/random/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.randomica', 'Barca', 'https://picsum.photos/seed/randomica/800/800', 0);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.qualcosa', 'Tigre', 'https://picsum.photos/seed/animales/800/800', 0);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.', 'Natura', 'https://picsum.photos/seed/gfas/800/800', 1);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.random', 'Picsum', 'https://picsum.photos/seed/random/800/800', 0);
INSERT INTO db_photo_album.photos(description, title, url, visibility)VALUES('Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.randomica', 'Barca', 'https://picsum.photos/seed/randomica/800/800', 0);

INSERT INTO db_photo_album.`user`(id, password, username)VALUES(1, '{noop}password', 'admin');
INSERT INTO db_photo_album.`user`(id, password, username)VALUES(2, '{noop}password', 'user');

INSERT INTO role (id, name) VALUES(1, 'ADMIN');
INSERT INTO role (id, name) VALUES(2, 'USER');

INSERT into user_roles(user_id, roles_id) VALUES(1, 1);
INSERT into user_roles(user_id, roles_id) VALUES(2, 2);

INSERT INTO db_photo_album.categories(name)VALUES('Natura');
INSERT INTO db_photo_album.categories(name)VALUES('Animali');
INSERT INTO db_photo_album.categories(name)VALUES('Mare');

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



INSERT INTO db_photo_album.messages(email, `text`)VALUES('simo@example.com', 'Belle foto!');
INSERT INTO db_photo_album.messages(email, `text`)VALUES('francesca@example.com', 'Belle fotografie!');
INSERT INTO db_photo_album.messages(email, `text`)VALUES('fabio@example.com', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.!');
INSERT INTO db_photo_album.messages(email, `text`)VALUES('teresa@example.com', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.');
INSERT INTO db_photo_album.messages(email, `text`)VALUES('lorenzo@example.com', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ipsum consequat nisl vel pretium lectus quam. Tellus at urna condimentum mattis pellentesque id.!');
INSERT INTO db_photo_album.messages(email, `text`)VALUES('alice@example.com', 'Che Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. fotografie!');
