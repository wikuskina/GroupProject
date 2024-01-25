# Проект интернет-магазин игрушек
Для каждого интернет-магазина нам нужен аналог базы данных (еще пока не настоящая база данных), которая будет состоять из следующих сущностей: <br>
- Пользователь <br>
- Товар <br>
- Каталог <br>

У <b>Пользователя</b> имеются следующие поля: (класс User) <br>
- Уникальный id; (user_id) <br>
- Имя и фамилия; (user_name, user_surname) <br>
- E-mail; (user_email) <br>
- Пол; (user_gender) <br>
- Дата рождения; (user_DOB) <br>

<b>Товар</b> содержит поля: (класс Item)<br>
- Уникальный id; (id) <br>
- Название товара; (name) <br>
- Цена товара; (price) <br>
- Количество на складе; (amount) <br>

<b>Каталог</b> состоит из: (класс Catalog) <br>
- Уникальный id; (id) <br>
- Название каталога; (name) <br>
- Товары (подсказка: товары хранятся в виде ArrayList<Товар> товары); (toys) <br>

Соответственно, группа товаров может принадлежать одному каталогу. Например, несколько товаров “Платье женское вечернее”, “Платье женское коктейльное”, “Платье женское офисное” принадлежит одному каталогу “Платья женские”. <br>
Реализуйте в коде в виде классов данные сущности. Добавьте им соответствующие поля. Укажите конструктор (пустой и непустой), геттеры и сеттеры в этих классах. Не забывайте, что по умолчанию в любом классе УЖЕ есть пустой конструктор, НО если вы создаете НЕ пустой конструктор, вам нужно также дописать и пустой (если он нужен дальше в коде). <br>
<br>
<b> Задание 2 </b> <br>
В классе Main создайте экземпляры этих классов и заполните информацией юзеров, разделы каталога и товары (5 пользователей, 5 каталогов, 5 товаров в каждом разделе). <br>
<br>
<b> Задание 3 </b> <br>
Выведете в консоль информацию обо всех пользователях. <br>
Выведете в консоль информацию обо всех разделах каталога и товарах которые лежат в каждом разделе. <br>
Теперь выведите в консоль информацию о том, что каждый из 10ти юзеров положил в корзину такой-то товар (id, название товара) из такого-то каталога (id раздела каталога и название). Постарайтесь реализовать этот вывод рандомно (если не получится, просто захардкодьте). Например: “User 1 Александр Иванов положил в корзину товар с id=3, ‘Пальто мужское’ из раздела каталога id=1 “Мужская верхняя одежда””. <br>
<br>
<b> Задание 4 </b> <br>
Теперь реализуйте в классе Main в коде CRUD операции для юзера, товара и раздела каталога. Для каждой сущности должны быть свои CRUD методы. То есть у юзера есть 4 метода, у товара есть 4 метода и у раздела каталога свои 4 метода. <br>
CRUD операции - это методы: <br>
CREATE - метод позволяет создавать в нашей базе данных нового юзера, или товар или раздел каталога. <br>
READ - метод позволяет найти по id уже существующую сущность (юзера, товар или раздел каталога) и просто выводит на экран информацию об этой сущности. <br>
UPDATE - метод позволяет изменять информацию о товаре, юзере или разделе каталога, предварительно получив их id. <br>
DELETE - метод позволяет удалить юзера или раздел каталога или товар из бд. <br>
В каждом методе выведите в консоль информацию о том, какую сущность метод создал, нашел, изменил или удалил. <br>
Например, <br>
“Пользователь Иван Петров id=2 создался в базе данных”; <br>
“Пользователь Иван Петров id=2 изменена дата рождения“; <br>
“Пользователь Иван Петров id=2 был найден”; <br>
“Пользователь Иван Петров был удален по id=2” <br>
<br>
<b>Дополнительные необязательные задания (сложные):</b> <br>
<b>Задача 5 - Работа с файлами</b><br>
Создайте в IDEA папку с названием resources и положите туда 2 txt-файла. В одном файле пусть хранится новая информация о товарах (5-10 полей). Разделите информацию в этом txt-файле символом нижнее подчеркивание (Название товара_Цена товара_Количество на складе).
Например, для интернет-магазина одежды это может быть: <br>
“Платье для девочки_2000 рублей_количество на складе: 5 штук <br>
Штанишки для мальчика_1534 рубля_количество на складе: 10 штук <br>
Пальто десткое демисезон для девочки_4000 рублей_количество на складе: 2 штуки” <br>
Прочитайте из ресурсов этот txt-файл, получите из файла каждую строку и разбейте каждую строку по _ символу. <br>
Положите полученный массив данных в поля товара. <br>
<b>Задача 6 - HashMap </b><br>
Создайте HashMap с типом данных Integer и Пользователь. Пусть Integer здесь будет обозначать номер паспорта пользователя. Наполните этот hashMap информацией - паспорт и пользователь (помним, что каждого пользователя можно сразу создавать и наполнять, если ранее был создан НЕ пустой конструктор со всеми его полями). Запишите построчно каждый элемент этого hashMap в txt-файл, который ранее был пустым.

<b>Проверка реализации:</b><br>
Требования к реализации: <br>
1. В коде нужно использовать ArrayList, HashMap, классы, экземпляры классов. <br>
2. Методы CRUD напишите в классе Main и они должны быть статическими. <br>
3. У каждого класса, кроме Main-класса, должны быть конструктор, геттеры и сеттеры, а также переопределен метод toString(). <br>
4. Обрабатывайте собственной ошибкой потенциальное место исключения. Например, когда мы реализуем метод READ к нам может попасть id которого нет, значит нужно обработать его каким-то exception.
5. Не забывайте обрабатывать исключения блоками try-catch.<br>
6. Дополнительные задания* – Чтение и запись из файла мы решали на 10й неделе, есть запись урока. Выполните 7й и 8й пункт по этому примеру. Помните, что при работе с потоками данных их лучше обрабатывать в try-with-resources<br>
7. Реализацию построчного чтения и разбиения полученных строк на substring, а так же наполнение сущностей этими подстроками должна быть написана с использованием Stream API (то есть пункт 7 и 8 задания делаем на Stream API, а не простыми методами коллекций). Если не получится выполнить эти пункты на Stream API, решите с использованием коллекций. <br>