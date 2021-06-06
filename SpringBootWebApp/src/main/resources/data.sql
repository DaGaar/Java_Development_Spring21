
insert into student(id, name, email, dob, age) values (101, 'Hank Pym', 'hank@antman.ant', '1991-12-12', 50);
insert into student(id, name, email, dob, age) values (102, 'Bruce Banner', 'bb@gamma.rays', '1980-10-13', 40);
insert into student(id, name, email, dob, age) values (103, 'Hawk Eye', 'arrowGuy77@nevermisses.net', '1980-10-13', 43);
insert into student(id, name, email, dob, age) values (104, 'Edwared Funk', 'hunkidor@gmail.com', '1988-04-22', 12);
insert into student(id, name, email, dob, age) values (105, 'Danny Dude', 'badlib@yahoo.com', '1998-10-21', 21);
insert into student(id, name, email, dob, age) values (106, 'Darwin Mink', 'dadink@gmail.com', '1979-09-16', 13);
insert into student(id, name, email, dob, age) values (107, 'Granny Gdovin', 'goodfellow@yahoo.com', '1980-03-13', 41);
insert into student(id, name, email, dob, age) values (108, 'Sally Twain', 'markm3@gmail.com', '1966-10-17', 31);
insert into student(id, name, email, dob, age) values (109, 'Drew Henson', 'havle@gmail.com', '1907-01-08', 22);
insert into student(id, name, email, dob, age) values (110, 'Baily Olson', 'bailyolson@yahoo.com', '1991-08-02', 64);
insert into student(id, name, email, dob, age) values (111, 'Ben Hur', 'bunfat@juno.com', '1911-10-13', 61);
insert into student(id, name, email, dob, age) values (112, 'Dunn Dat', 'thinmintdingo@gmail.com', '1945-04-27', 22);
insert into student(id, name, email, dob, age) values (113, 'Harvey Bent', 'getsome@gmail.com', '1977-10-12',313);
insert into student(id, name, email, dob, age) values (114, 'Jerry', 'lovefinderz@hotmail.com', '1998-12-14', 26);
insert into student(id, name, email, dob, age) values (115, 'Morty Summers', 'picklerick@gmail.com', '1912-11-05', 63);

insert into scholarship(id, name, amount) values (111, 'You need it more than I do', 5);
insert into scholarship(id, name, amount) values (112, 'Booze Bonds', 2000);
insert into scholarship(id, name, amount) values (113, 'What I found in my basement', 20000);

insert into student_scholarships(students_id, scholarships_id) values (105, 111);
insert into student_scholarships(students_id, scholarships_id) values (106, 112);
insert into student_scholarships(students_id, scholarships_id) values (105, 113);

insert into instructor(id, name, dob) values (101, 'Mr. Barnes', '1955-12-15');
insert into instructor(id, name, dob) values (102, 'Dr. Malone', '1946-01-11');
insert into instructor(id, name, dob) values (103, 'Mrs. Reeves', '1977-09-15');
insert into instructor(id, name, dob) values (104, 'Dr. Head', '1986-10-21');
insert into instructor(id, name, dob) values (105, 'Dr. Doom', '1991-11-26');
insert into instructor(id, name, dob) values (106, 'Prof. Sallow', '1979-11-13');

insert into course(id, name, department, instructor_id) values (143, 'JavaDev', 'CompScience', 101);
insert into course(id, name, department, instructor_id) values (144, 'HomeEc', 'Gen Ed', 105);
insert into course(id, name, department, instructor_id, student_id) values (145, 'Spanish', 'Language', 106,  101);
insert into course(id, name, department, instructor_id) values (146, 'College Alg', 'Math', 103);
insert into course(id, name, department, instructor_id) values (147, 'Comp 2', 'English', 102);
insert into course(id, name, department, instructor_id) values (148, 'Comp 1', 'English', 102);
insert into course(id, name, department, instructor_id) values (149, 'Bible History', 'History', 104);

