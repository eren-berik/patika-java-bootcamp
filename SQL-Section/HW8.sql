-- UPDATE PRACTICES
UPDATE employee
SET id = 100
WHERE (id%2=0)
RETURNING *;

UPDATE employee
SET name = 'Starting with A'
WHERE name LIKE 'A%'
RETURNING *;

UPDATE employee
SET birthday = '1900-01-01'
WHERE birthday BETWEEN '1980-01-01' AND '1990-01-01'
RETURNING *;

UPDATE employee
SET email = null
WHERE email LIKE '_a%'
RETURNING *;

-- DELETE PRACTICES
DELETE FROM employee
WHERE id%7=0;

DELETE FROM employee
WHERE name LIKE '_t%';

DELETE FROM employee
WHERE birthday BETWEEN '2020-01-01' AND '2021-01-01';

DELETE FROM employee
WHERE email LIKE '%e';

