
public class Main {
    public static void main(String[] args) throws Exception {
        Item ball = new Item(1, "Мячи", 10.0, 50);
        Item doll = new Item(2, "Куклы", 20.0, 30);
        Item puzzle = new Item(3, "Пазлы", 15.0, 40);
        Item car = new Item(4, "Машинки", 25.0, 20);
        Item constructor = new Item(5, "Конструкторы", 30.0, 35);
// функция для вывода информации по товарам
        printItemInfo(ball);
        printItemInfo(doll);
        printItemInfo(puzzle);
        printItemInfo(car);
        printItemInfo(constructor);
    }
// вывод товаров в консоль с параметрами товаров
    public static void printItemInfo(Item item) {
        System.out.println("Раздел: " + item.getName());
        System.out.println("ID: " + item.getId());
        System.out.println("Цена: " + item.getPrice());
        System.out.println("Количество: " + item.getAmount());
        System.out.println();
    }
}