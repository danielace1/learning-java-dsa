-- https://leetcode.com/problems/not-boring-movies/description/

select * from cinema where id % 2 = 1
and description != 'boring'
order by rating desc;