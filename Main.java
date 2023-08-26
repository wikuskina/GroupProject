
public class Main {
    public static void main(String[] args) throws Exception {
        Item ball = new Item(1, "Мячи", 10.0, 5);
        Item doll = new Item(2, "Куклы", 20.0, 5);
        Item puzzle = new Item(3, "Пазлы", 15.0, 5);
        Item car = new Item(4, "Машинки", 25.0, 5);
        Item constructor = new Item(5, "Конструкторы", 30.0, 5);

// вывод товаров в консоль с параметрами товаров
        ball.printItemInfo();
        doll.printItemInfo();
        puzzle.printItemInfo();
        car.printItemInfo();
        constructor.printItemInfo();

        // 5 user
        User user1 = new User(400, "Мария", "Савельева", "maria.savelieva@gmail.com", "женский", "15.06.2000");
        user1.printToString();
        User user2 = new User(401, "Елена", "Иванова", "elena.ivanove@gmail.com", "женский", "14.01.1998");
        user2.printToString();
        User user3 = new User(402, "Игорь", "Молев", "igor.molev@gmail.com", "мужской", "11.12.1991");
        user3.printToString();
        User user4 = new User(403, "Мелисса", "Белова", "melissa.white@gmail.com", "женский", "25.08.1983");
        user4.printToString();
        User user5 = new User(404, "Иван", "Черных", "ivan.black@gmail.com", "мужской", "08.07.2005");
        user5.printToString();
        // 25 items (toys)

    }
}

