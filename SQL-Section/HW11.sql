-- actor ve customer tablolarında bulunan first_name sütunları için tüm verileri sıralayalım.
SELECT first_name FROM actor
UNION
SELECT first_name FROM customer;

-- actor ve customer tablolarında bulunan first_name sütunları için kesişen verileri sıralayalım.
SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer
ORDER BY first_name ASC;

SELECT DISTINCT actor.first_name FROM actor
INNER JOIN customer ON actor.first_name = customer.first_name
ORDER BY first_name ASC;

-- actor ve customer tablolarında bulunan first_name sütunları için ilk tabloda bulunan
-- ancak ikinci tabloda bulunmayan verileri sıralayalım.
SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer;