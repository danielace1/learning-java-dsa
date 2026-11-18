-- https://leetcode.com/problems/replace-employee-id-with-the-unique-identifier/description/

select eu.unique_id, e.name 
from employees e left join employeeUNI eu 
on e.id=eu.id;