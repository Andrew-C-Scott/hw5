-- Create a table named student (with an auto-increment primary key and other required columns)
CREATE TABLE IF NOT EXISTS student
(
    id    SERIAL PRIMARY KEY,
    name  VARCHAR(100),
    major VARCHAR(100),
    year  INT
);

-- Create a table named course (with an auto-increment primary key and required columns)
CREATE TABLE IF NOT EXISTS course
(
    id            SERIAL PRIMARY KEY,
    course_number VARCHAR(50),
    course_name   VARCHAR(255),
    capacity      BIGINT,
    instructor    varchar(250)
);


CREATE TABLE IF NOT EXISTS instructor
(
    id              SERIAL PRIMARY KEY,
    INSTRUCTOR_NAME VARCHAR(250),
    OFFICE          VARCHAR(250),
    PHONE           VARCHAR(50),
    EMAIL           VARCHAR(250)
);