Создал базу данных
Create Database human_friends;
Use human_friends;


Создал таблицы

Create table Pets
(
id int auto_increment primary key,
AnimalKind varchar(50),
AnimalName varchar(50),
DateOfBirth Date, 
Commands TEXT);

Create table PackAnimals
(
id int auto_increment primary key,
AnimalKind varchar(50),
AnimalName varchar(50),
DateOfBirth Date, 
Commands TEXT);

Заполнил таблицы данными

INSERT INTO pets (AnimalKind, AnimalName, DateOfBirth, Commands) VALUES
('Dog', 'Rex', '2020-01-01', 'Sit, Stay, Fetch'),
('Dog', 'Jessy', '2019-04-03', 'Sit, Fetch'),
('Cat', 'Lina', '2021-06-14', 'Sit, Purr'),
('Cat', 'Katty', '2005-09-11', 'Purr'),
('Hamster', 'Bob', '2024-02-06', 'Roll, Spin'),
('Hamster', 'Ron', '2024-06-19', 'Roll, Hide');

INSERT INTO packanimals (AnimalKind, AnimalName, DateOfBirth, Commands) VALUES
('Horse', 'White', '2016-02-04', 'Trot, Canter, Gallop'),
('Horse', 'Black', '2014-05-05', 'Trot, Canter'),
('Camel', 'Villy', '2016-11-03', 'Walk, Carry Load'),
('Camel', 'Dilly', '2018-12-12', 'Walk, Sit'),
('Donkey', 'Don', '2017-09-18', 'Walk, Carry Load, Bray'),
('Donkey', 'Polly', '2019-01-23', 'Walk, Bray, Kick');

Удаляем верблюдов

delete from packanimals where AnimalKind = 'Camel';

Объединяем лошадей и ослов в одну таблицу

CREATE TABLE HorsesAndDonkeys AS
SELECT id, AnimalName, AnimalKind, DateOfBirth, Commands FROM PackAnimals WHERE AnimalKind IN ('Horse', 'Donkey');

Создаем таблицу Молодые животные

create table Young_Animals AS
Select id, AnimalName, AnimalKind, DateOfBirth, Commands,
TIMESTAMPDIFF(MONTH, DateOfBirth, CURDATE()) AS AgeMonths
from pets where TIMESTAMPDIFF(Year, DateOfBirth, CURDATE()) between 1 and 3;

Объединяем все таблицы в одну

Create table all_animals as
select id, AnimalName,AnimalKind,DateOfBirth,Commands, 'pets' as Sorce from pets
union all
select id, AnimalName,AnimalKind,DateOfBirth,Commands, 'packanimals' as Sorce from packanimals;

