INSERT INTO `users` (username, password, enabled, name, lastname, email) VALUES ('diana', '$2a$10$DWa.cMFugypXUjIkdualvODJx2PdGtMZ5aTADOurcOfTNZVqHgIjO', 1, 'Diana', 'Estrada', 'diana.estrada@gmail.com');
INSERT INTO `users` (username, password, enabled, name, lastname, email) VALUES ('admin', '$2a$10$50OPXHvapViTst3ZhH6kTeArYno6rpTJx5cFsDodHQTAYb2gsEwvy', 1, 'Admin', 'Admin', 'admin@gmail.com');

INSERT INTO `roles` (name) VALUES ('ROLE_USER');
INSERT INTO `roles` (name) VALUES ('ROLE_ADMIN');

INSERT INTO `users_roles` (user_id, role_id) VALUES (1,1);
INSERT INTO `users_roles` (user_id, role_id) VALUES (2,2);
INSERT INTO `users_roles` (user_id, role_id) VALUES (2,1);