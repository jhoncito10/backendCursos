--estudiantes
insert into Estudiantes values (1,'Afrodita');
insert into Estudiantes values (2,'Apolo');
insert into Estudiantes values (3,'Ares');
insert into Estudiantes values (4,'Artemisa');
insert into Estudiantes values (5,'Atenea');
insert into Estudiantes values (6,'Dionisio');
insert into Estudiantes values (7,'Hefesto');
insert into Estudiantes values (8,'Hera');
insert into Estudiantes values (9,'Hermes');
insert into Estudiantes values (10,'Hades');
insert into Estudiantes values (11,'Poseidon');
insert into Estudiantes values (12,'Zeus');

--docentes
insert into Profesores values (1, 'Némesis');
insert into Profesores values (2, 'Príapo');
insert into Profesores values (3, 'Iris');


--colegio
insert into Colegios values (1, 'El colegio del Olimpo');


--cursos
insert into Cursos values (1,10,'A',1);
insert into Cursos values (2,10,'B',1);
insert into Cursos values (3,11,'A',1);
insert into Cursos values (4,11,'B',1);

--asignaturas
insert into Asignaturas values (1,'Matemáticas',1,1);
insert into Asignaturas values (2,'Matemáticas',2,1);
insert into Asignaturas values (3,'Matemáticas',3,1);
insert into Asignaturas values (4,'Matemáticas',4,1);
insert into Asignaturas values (5,'Español',1,2);
insert into Asignaturas values (6,'Español',2,2);
insert into Asignaturas values (7,'Ingles Básico',1,3);
insert into Asignaturas values (8,'Ingles Avanzado',2,3);
insert into Asignaturas values (9,'Pre Icfes',3,1);
insert into Asignaturas values (10,'Pre Icfes',4,1);



--estudiantes_asignaturas
insert into Estudiante_asignaturas values(1,1);
insert into Estudiante_asignaturas values(1,2);
insert into Estudiante_asignaturas values(1,3);
insert into Estudiante_asignaturas values(5,1);
insert into Estudiante_asignaturas values(5,2);
insert into Estudiante_asignaturas values(5,3);
insert into Estudiante_asignaturas values(7,1);
insert into Estudiante_asignaturas values(7,2);
insert into Estudiante_asignaturas values(7,3);

insert into Estudiante_asignaturas values(2,4);
insert into Estudiante_asignaturas values(2,5);
insert into Estudiante_asignaturas values(2,6);
insert into Estudiante_asignaturas values(6,4);
insert into Estudiante_asignaturas values(6,5);
insert into Estudiante_asignaturas values(6,6);
insert into Estudiante_asignaturas values(8,4);
insert into Estudiante_asignaturas values(8,5);
insert into Estudiante_asignaturas values(8,6);

insert into Estudiante_asignaturas values(3,7);
insert into Estudiante_asignaturas values(3,8);
insert into Estudiante_asignaturas values(9,7);
insert into Estudiante_asignaturas values(9,8);

insert into Estudiante_asignaturas values(4,9);
insert into Estudiante_asignaturas values(4,10);
insert into Estudiante_asignaturas values(4,11);
insert into Estudiante_asignaturas values(4,12);
insert into Estudiante_asignaturas values(10,9);
insert into Estudiante_asignaturas values(10,10);
insert into Estudiante_asignaturas values(10,11);
insert into Estudiante_asignaturas values(10,12);

