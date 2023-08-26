
public class Main {
    public static void main(String[] args) throws Exception {
        Item ball = new Item(1, "Мячи", 10.0, 5);
        Item doll = new Item(2, "Куклы", 20.0, 5);
        Item puzzle = new Item(3, "Пазлы", 15.0, 5);
        Item car = new Item(4, "Машинки", 25.0, 5);
        Item constructor = new Item(5, "Конструкторы", 30.0, 5);

        System.out.println("Раздел: " + ball.getName());
        System.out.println("ID: " + ball.getId());
        System.out.println("Цена: " + ball.getPrice());
        System.out.println("Количество: " + ball.getAmount());
        System.out.println();

        System.out.println("Раздел: " + doll.getName());
        System.out.println("ID: " + doll.getId());
        System.out.println("Цена: " + doll.getPrice());
        System.out.println("Количество: " + doll.getAmount());
        System.out.println();

        System.out.println("Раздел: " + puzzle.getName());
        System.out.println("ID: " + puzzle.getId());
        System.out.println("Цена: " + puzzle.getPrice());
        System.out.println("Количество: " + puzzle.getAmount());
        System.out.println();

        System.out.println("Раздел: " + car.getName());
        System.out.println("ID: " + car.getId());
        System.out.println("Цена: " + car.getPrice());
        System.out.println("Количество: " + car.getAmount());
        System.out.println();

        System.out.println("Раздел: " + constructor.getName());
        System.out.println("ID: " + constructor.getId());
        System.out.println("Цена: " + constructor.getPrice());
        System.out.println("Количество: " + constructor.getAmount());
    }
}

