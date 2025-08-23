-- Last updated: 8/23/2025, 10:27:32 PM
# Write your MySQL query statement below
select distinct author_id as id 
from Views
where author_id=viewer_id
order by id asc
;