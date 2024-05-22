CREATE TABLE IF NOT EXISTS contacts
(id INTEGER NOT NULL AUTO_INCREMENT,
image VARCHAR (255) NOT NULL,
first_name VARCHAR(55) NOT NULL,
surname VARCHAR(55) NOT NULL,
phone VARCHAR(55) NOT NULL,
--position VARCHAR(255) NOT NULL,
PRIMARY KEY (id));

INSERT INTO
contacts (image, first_name, surname, phone)
VALUES
    ('developer.jpg', 'Alice', 'Chan', '555 123-4567'),
    ('manager.jpg', 'Jackie', 'Chan', '555 234-5678'),
    ('trader.png', 'Mik', 'Douglas', '555 587-3241');