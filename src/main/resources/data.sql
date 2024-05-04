CREATE TABLE LOCATIONS (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255)
);
INSERT INTO LOCATIONS VALUES ('l1', 'Paris'), ('l2', 'London'), ('l3', 'Berlin');
CREATE TABLE USERS (
    id VARCHAR(255) PRIMARY KEY,
    email VARCHAR(255),
    first_name VARCHAR(255),
    last_name VARCHAR(255),
    location_id VARCHAR(255),
    FOREIGN KEY (location_id) REFERENCES LOCATIONS(id)
);
INSERT INTO USERS VALUES ('u1', 'u1@gmail.com', 'User1', 'First', 'l1'), ('u2', 'u2@gmail.com', 'User2', 'Second', 'l1'), ('u3', 'u3@gmail.com', 'User3', 'Third', 'l3'), ('u4', 'u4@gmail.com', 'User4', 'Fourth', 'l2');
CREATE TABLE POSTS (
    id VARCHAR(255) PRIMARY KEY,
    details VARCHAR(255),
    post_date VARCHAR(255),
    user_id VARCHAR(255),
    FOREIGN KEY (user_id) REFERENCES USERS(id)
);
INSERT INTO POSTS VALUES ('p1','Post one','03-05-2024','u1'), ('p2','Post two','05-05-2024','u1'), ('p3','Post three','06-05-2024','u3'), ('p4','Post four','04-05-2024','u2');