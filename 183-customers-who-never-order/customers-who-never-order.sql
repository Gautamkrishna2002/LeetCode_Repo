# Write your MySQL query statement below
select name as Customers
from Customers
where id not in (select e1.id
from Customers e1, Orders e2
where e1.id = e2.customerId);