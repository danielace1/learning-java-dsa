-- https://leetcode.com/problems/list-the-products-ordered-in-a-period/description/
select p.product_name, 
sum(o.unit) as unit
from products p
join orders o
on p.product_id = o.product_id
where o.order_date >= '2020-02-01' and  o.order_date < '2020-03-01'
group by p.product_name, p.product_id
having sum(o.unit)>= 100;