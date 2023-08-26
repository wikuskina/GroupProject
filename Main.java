
public class Main {
    public static void main(String[] args) throws Exception {
        Item ball = new Item(1, "Мячи", 10.0, 5);
        Item doll = new Item(2, "Куклы", 20.0, 5);
        Item puzzle = new Item(3, "Пазлы", 15.0, 5);
        Item car = new Item(4, "Машинки", 25.0, 5);
        Item constructor = new Item(5, "Конструкторы", 30.0, 5);
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