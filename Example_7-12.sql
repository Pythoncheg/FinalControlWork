CREATE SCHEMA human_frends;

## Создаем таблицы

CREATE TABLE `human_frends`.`pets` (
  `idPets` INT NOT NULL AUTO_INCREMENT,
  `Type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPets`));

CREATE TABLE `human_frends`.`PackAnimals` (
  `idAnimal` INT NOT NULL AUTO_INCREMENT,
  `Type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idAnimal`));

CREATE TABLE `Dogs` (
`id` INT NOT NULL AUTO_INCREMENT,
`Name` VARCHAR(45) NOT NULL,
`Command` VARCHAR(45),
`BirtsDay` DATE,
PRIMARY KEY (`id`));

CREATE TABLE Cats (
id INT NOT NULL AUTO_INCREMENT,
`Name` VARCHAR(45) NOT NULL,
Command VARCHAR(45),
BirtsDay DATE,
PRIMARY KEY (id));

CREATE TABLE Hamster (
id INT NOT NULL AUTO_INCREMENT,
`Name` VARCHAR(45) NOT NULL,
Command VARCHAR(45),
BirtsDay DATE,
PRIMARY KEY (id));

CREATE TABLE Horses (
id INT NOT NULL AUTO_INCREMENT,
`Name` VARCHAR(45) NOT NULL,
Command VARCHAR(45),
BirtsDay DATE,
PRIMARY KEY (id));

CREATE TABLE Camels (
id INT NOT NULL AUTO_INCREMENT,
`Name` VARCHAR(45) NOT NULL,
Command VARCHAR(45),
BirtsDay DATE,
PRIMARY KEY (id));

CREATE TABLE Donkeys (
id INT NOT NULL AUTO_INCREMENT,
`Name` VARCHAR(45) NOT NULL,
Command VARCHAR(45),
BirtsDay DATE,
PRIMARY KEY (id));

## Заполняем низкоуровневые таблицы именами(животных), командами которые они выполняют и датами рождения.

INSERT INTO cats (`Name`, Command, BirtsDay) VALUES
('Яша', 'Мурлыкать', '2010-03-15'),
('Фаер', 'Спать', '2023-05-12'),
('Фэр', 'Спать', '2023-06-13'),
('Кузя', 'Играть', '2020-07-23');

INSERT INTO dogs (`Name`, Command, BirtsDay) VALUES
('Герда', 'Голос', '2015-06-17'),
('Эрнест', 'Сидеть', '2023-05-16'),
('Томаш', 'Лежать', '2023-10-19'),
('Дарик', 'Рядом', '2020-09-13');

INSERT INTO hamster (`Name`, Command, BirtsDay) VALUES
('Хома', 'Бежать', '2022-01-01'),
('Кузя', 'Бежать', '2017-06-06'),
('Стивен', 'Бежать', '2023-01-06'),
('Сигал', 'Бежать', '2021-03-17');

INSERT INTO camels (`Name`, Command, BirtsDay) VALUES
('Агата', 'Поднять', '2022-01-01'),
('Ида', 'Поднять', '2017-06-06'),
('Ланцелот', 'Поднять', '2023-01-06'),
('Джаред', 'Поднять', '2021-03-17');
	
INSERT INTO horses (`Name`, Command, BirtsDay) VALUES
('Мерин', 'Галоп', '2022-01-01'),
('Буран', 'Галоп', '2017-06-06'),
('Белориза', 'Галоп', '2023-01-06'),
('Ветерок', 'Галоп', '2021-03-17');
     
INSERT INTO donkeys (`Name`, Command, BirtsDay) VALUES
('Иа', 'Иди', '2022-01-01'),
('Боря', 'Иди', '2017-06-06'),
('Соня', 'Иди', '2023-01-06'),
('Мойша', 'Иди', '2021-03-17');

## Удаление (переезд) верблюдов

DELETE FROM camels WHERE id > 0;

## Создаем объединенную таблицу вьючных животных

CREATE TABLE pack_animal_union (
id INT NOT NULL auto_increment PRIMARY KEY)
SELECT `Name`,
		Command,
        Birtsday
FROM horses UNION
SELECT `Name`,
		Command,
        Birtsday
FROM donkeys;

## Создаем новую таблицу "Молодые животные" куда попадают все животные от 0 до 4 лет

CREATE TABLE young_animals (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)

SELECT `Name`,
		Command,
        Birtsday,
        Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) AS Month_age
FROM cats
WHERE Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) > 0 
AND Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) < 4;

SELECT `Name`,
		Command,
        Birtsday,
        Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) AS Month_age
FROM dogs
WHERE Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) > 0 
AND Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) < 4;

SELECT `Name`,
		Command,
        Birtsday,
        Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) AS Month_age
FROM hamster
WHERE Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) > 0 
AND Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) < 4;

SELECT `Name`,
		Command,
        Birtsday,
        Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) AS Month_age
FROM pack_animal_union
WHERE Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) > 0 
AND Round((year(current_date()) - year(Birtsday)) + (month(current_date() - month(Birtsday)))/10, 2) < 4;

CREATE TABLE human_friends_final (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
SELECT `Name`,
		Command,
        Birtsday,
        'Dog' AS Type
FROM dogs UNION
SELECT `Name`,
		Command,
        Birtsday,
        'Cat' AS Type
FROM cats UNION
SELECT `Name`,
		Command,
        Birtsday,
        'Hamster' AS Type
FROM hamster UNION
SELECT `Name`,
		Command,
        Birtsday,
        'Donkey' AS Type
FROM donkeys UNION
SELECT `Name`,
		Command,
        Birtsday,
        'Horse' AS Type
FROM horses;


