-- https://leetcode.com/problems/delete-duplicate-emails/

delete p1
from Person p1
join Person p2
on p1.email=p2.email
and p1.id>p2.id;