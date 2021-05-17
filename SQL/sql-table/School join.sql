select * from students;
select * from classes;
select * from enrollment;
-- insert into enrollment (StudentID,classID)
-- value
-- (1,1),
-- (1,2),
-- (2,1),
-- (2,5),
-- (3,2),
-- (3,3);
select * from classes c join enrollment e on c.ClassID=e.ClassID join students s on e.StudentID=s.StudentID;
-- describe enrollment;
-- describe classes;
