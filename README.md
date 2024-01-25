# Online toy store group project, learning Java.
A sample database (not yet a real database) for the store, which consists of the following entities: <br>
- User <br>
- Product <br>
- Catalog <br>

<b>User</b> has the following fields: (User class) <br>
- Unique id; (user_id) <br>
- First and last name; (user_name, user_surname) <br>
- E-mail; (user_email) <br>
- Gender; (user_gender) <br>
- Date of Birth; (user_DOB) <br>

<b>Item</b> contains fields: (Item class)<br>
- Unique id; (id) <br>
- Product Name; (name) <br>
- The price of the product; (price) <br>
- Quantity in stock; (amount) <br>

<b>Catalog</b> consists of: (class Catalog) <br>
- Unique id; (id) <br>
- Catalog name; (name) <br>
- Products (stored as ArrayList<Product> products); (toys) <br>
<br>
In the Main class, instances of these classes are created and filled with information 5 each. <br>
<br>
Information about users is displayed to the console. <br>
<br>
Each entity has its own CRUD methods: <br>
<br>
CREATE - method allows to create a new user, product or catalog section in the database. <br>
READ - method allows to find an already existing entity (user, product or catalog section) by id and displays information about it. <br>
UPDATE - method allows to change information about a product, user or catalog section, by id. <br>
DELETE - method allows to delete a user or a catalog section or a product from the database. <br>
<br>
