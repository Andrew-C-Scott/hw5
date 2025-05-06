INSERT INTO instructor (instructor_name, office, phone, email)
VALUES ('Dr. Alan Turing', 'Building A, Room 101', '314‑123‑4567', 'aturing@umsl.edu'),
       ('Dr. Grace Hopper', 'Building B, Room 203', '314‑234‑5678', 'ghopper@umsl.edu'),
       ('Dr. Emmy Noether', 'Building C, Room 110', '314‑345‑6789', 'enoether@umsl.edu'),
       ('Dr. Leo Tolstoy', 'Building D, Room 305', '314‑456‑7890', 'ltolstoy@umsl.edu'),
       ('Dr. Marie Curie', 'Building E, Room 150', '314‑567‑8901', 'mcurie@umsl.edu');

INSERT INTO course (course_number, course_name, capacity, instructor)
VALUES ('CS101', 'Introduction to Computer Science', 40, 'Dr. Alan Turing'),
       ('CS4730', 'Software Development', 100, 'Dr. Grace Hopper'),
       ('MATH201', 'Discrete Mathematics', 30, 'Dr. Emmy Noether'),
       ('ENG101', 'English Composition', 25, 'Dr. Leo Tolstoy'),
       ('HIST310', 'Modern World History', 60, 'Dr. Marie Curie');

INSERT INTO student (name, major, year)
VALUES ('Alice', 'Computer Science', 2024),
       ('Bob', 'Mathematics', 2023),
       ('Carol', 'English Literature', 2022),
       ('David', 'Computer Science', 2024),
       ('Eve', 'Physics', 2025);