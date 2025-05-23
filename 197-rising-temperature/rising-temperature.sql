# Write your MySQL query statement below
SELECT DISTINCT a.id as id
FROM Weather a,Weather b
WHERE a.temperature > b.temperature
AND DATEDIFF(a.recorddate, b.recorddate) = 1