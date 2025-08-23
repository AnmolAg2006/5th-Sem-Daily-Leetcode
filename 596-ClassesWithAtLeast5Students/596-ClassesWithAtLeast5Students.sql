-- Last updated: 8/23/2025, 10:28:20 PM
select class from Courses
group by class
having count(*)>=5;