DROP TABLE IF EXISTS switch;

CREATE TABLE switch(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), image VARCHAR(255), brand VARCHAR(255),
type VARCHAR(255), operating_force VARCHAR(15), activation_point VARCHAR(15), travel_distance VARCHAR(15), lifespan VARCHAR(15));

INSERT INTO switch (name, image, brand, type, operating_force, activation_point, travel_distance,lifespan) VALUES ('Blue', NULL, 'Cherry MX', 'Clicky', '60cN', '2.2mm', '4mm', '50mm');
INSERT INTO switch (name, image, brand, type, operating_force, activation_point, travel_distance,lifespan) VALUES ('Clear', NULL, 'Gateron', 'Linear', '35cN', '2mm', '4mm', '50mm');