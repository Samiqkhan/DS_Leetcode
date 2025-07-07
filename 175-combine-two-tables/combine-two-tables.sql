# Write your MySQL query statement below
select person.firstname , person.lastname , address.city, address.state 
from address
right join person
on address.personId = person.personId;