-- https://leetcode.com/problems/top-travellers/description/
select u.name
coalesce(sum(u.distance),0) as travelled_distance
from users u
left join rides r
on u.id = r.user_id
group by u.id, u.name
order by travelled_distance desc, u.name asc