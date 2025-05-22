# Write your MySQL query statement below
SELECT e1.firstName, e1.lastName, e2.city, e2.state
FROM Person e1 LEFT JOIN Address e2 ON e1.personId = e2.personId;