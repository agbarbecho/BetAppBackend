    CREATE TABLE IF NOT EXISTS client(
        id SERIAL,
        name VARCHAR(100) NOT NULL,
        lastname VARCHAR(100) NOT NULL,
        address VARCHAR(50)NOT NULL,
        phone INT NOT NULL,
        PRIMARY KEY (id)

    );

    CREATE TABLE IF NOT EXISTS pet(
        id SERIAL,
        name VARCHAR(100) NOT NULL,
        breed VARCHAR(45) NOT NULL,
        species VARCHAR (45) NOT NULL,
        client_id INT,
        PRIMARY KEY  (id),
        FOREIGN KEY (client_id) REFERENCES client (id)
    );

    CREATE TABLE IF NOT EXISTS vet(
        id SERIAL,
        name VARCHAR(100) NOT NULL,
        lastname VARCHAR(100)NOT NULL,
        PRIMARY KEY (id)
    );

    CREATE TABLE IF NOT EXISTS file(
        id SERIAL,
        admission_date DATE,
        weight DECIMAL,
        diagnostic VARCHAR(50) NOT NULL,
        exams VARCHAR (100) NOT NULL,
        discharge_date DATE,
        pet_id INT,
        vet_id INT,
        PRIMARY KEY (id),
        FOREIGN KEY (vet_id) REFERENCES vet(id),
        FOREIGN KEY (pet_id) REFERENCES pet(id)

    );

    CREATE TABLE IF NOT EXISTS medicine(
        id SERIAL,
        name VARCHAR(100) NOT NULL,
        description VARCHAR(100) NOT NULL,
        expiration_date DATE,
        PRIMARY KEY (id)

    );


    CREATE TABLE IF NOT EXISTS detail(
        id SERIAL,
        amount INT,
        date_medicament VARCHAR(10) NOT NULL,
        administration_time VARCHAR(5) NOT NULL,
        is_tomorrow BOOLEAN,
        is_afternoon BOOLEAN,
        is_evening BOOLEAN,
        medicine_id INT,
        file_id INT,
        PRIMARY KEY (id),
        FOREIGN KEY (medicine_id) REFERENCES medicine(id),
        FOREIGN KEY (file_id) REFERENCES file(id)

    );