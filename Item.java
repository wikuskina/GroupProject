import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Item implements Create, Delete, Update, Read {
    private long id;
    private String name; // наименование
    private Double price; // цена
    private long amount; // количество товаров на складе

    // Пустой конструктор - нельзя создать, чтобы не было пустых товаров
    public Item() throws Exception{
        System.out.println("Нельзя создать пустой товар");
        throw new Exception();
    }
    // Конструкторы (минимальный - с непустым id и непустым наименованием)
    public Item(long id, String name) throws Exception{
        // check if
        if (id == 0) {
            System.out.println("id не может равнятся 0");
            throw new Exception();
        }
        if (name.isEmpty()) {
            System.out.println("Наименование товара не может быть пустым");
            throw new Exception();
        }
        this.setId(id);
        this.setName(name);
    }

    // Конструктор (+ цена с проверкой на отрицательную)
    public Item(long id, String name, Double price) throws Exception{
        if (id == 0) {
            System.out.println("id не может равнятся 0");
            throw new Exception();
        }
        if (name.isEmpty()) {
            System.out.println("Наименование товара не может быть пустым");
            throw new Exception();
        }
        if (price < 0) {
            System.out.println("Цена не может быть отрицательной");
            throw new Exception();
        }
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
    }

    //Конструктор (+ количество с проверкой на не 0)
    public Item(long id, String name, long amount) throws Exception{
        if (id == 0) {
            System.out.println("id не может равнятся 0");
            throw new Exception();
        }
        if (name.isEmpty()) {
            System.out.println("Наименование товара не может быть пустым");
            throw new Exception();
        }
        if (amount < 0) {
            System.out.println("Количество товара не может быть отрицательным");
            throw new Exception();
        }

        this.setId(id);
        this.setName(name);
        this.setAmount(amount);
    }

    // Полный конструктор с проверками
    public Item(long id, String name, Double price, long amount) throws Exception{
        if (id == 0) {
            System.out.println("id не может равнятся 0");
            throw new Exception();
        }
        if (name.isEmpty()) {
            System.out.println("Наименование товара не может быть пустым");
            throw new Exception();
        }
        if (price < 0) {
            System.out.println("Цена не может быть отрицательной");
            throw new Exception();
        }
        if (amount < 0) {
            System.out.println("Количество товара не может быть отрицательным");
            throw new Exception();
        }

        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setAmount(amount);
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public long getAmount() {
        return amount;
    }

    public void printItemInfo() {
        System.out.println("Название товара: " + this.getName());
        System.out.println("ID: " + this.getId());
        System.out.println("Цена: " + this.getPrice());
        System.out.println("Количество на складе: " + this.getAmount());
        System.out.println();
    }
    @Override
    public void create() {
        // создание товара
        System.out.println("Создание товара: " + name + " ID: " + id);
        System.out.println();
    }
    @Override
    public void delete() {
        // удаление товара
        System.out.println("Товар " + getName() + " " + getId() + " успешно удален из каталога");
        System.out.println();
    }

    public void read() {
        // Вывод информации о товаре
        System.out.println("Информация о товаре:");
        System.out.println("Название: " + name);
        System.out.println("ID: " + id);
        System.out.println("Цена: " + price);
        System.out.println("Количество: " + amount);
        System.out.println();
    }

    @Override
    public String toString(){
        return "Название товара: " + this.getName() + "\nID: " + this.getId() +
                "\nЦена: " + this.getPrice() + "\nКоличество на складе: " +
                this.getAmount();
    }

    @Override
    public void update(HashMap<String, Object> updateItem){
        if ((updateItem.containsKey("id")) && ((long)updateItem.get("id") > 0)) {
            this.setId((long)updateItem.get("id"));
        }
        if ((updateItem.containsKey("name")) && ((String)updateItem.get("name") != null)) {
            this.setName((String)updateItem.get("name"));
        }
        if ((updateItem.containsKey("price")) && ((Double)updateItem.get("price") > 0)) {
            this.setPrice((Double)updateItem.get("price"));
        }
        if ((updateItem.containsKey("amount")) && ((long)updateItem.get("amount") > 0)) {
            this.setAmount((long)updateItem.get("amount"));
        }
        System.out.println("Запись про товар обновлена на " + this.toString());
    }
}