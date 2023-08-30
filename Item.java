import java.util.HashMap;
import java.util.Objects;

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
        try {
            if (id == 0) {
                System.out.println("ID должен быть больше 0");
                throw new IllegalArgumentException();
            }
            if (name.isEmpty()) {
                System.out.println("Имя не может быть пустым");
                throw new IllegalArgumentException();
            }
            if (price == 0) {
                System.out.println("Цена должна быть больше 0");
                throw new IllegalArgumentException();
            }
            if (amount == 0) {
                System.out.println("Количество должно быть больше 0");
                throw new IllegalArgumentException();
            }
            System.out.println("Создание товара: " + name + " ID: " + id + " цена:" + price + " количество:" + amount);
            System.out.println();
            } catch (Exception e) {
                System.out.println("Ошибка при создании товара: " + e.getMessage());
            }
        }

    @Override
    public void delete() {
        try {
            if (getId() == 0) {
                throw new NullPointerException("ID не существует");
            }
            if (getName() == null) {
                throw new NullPointerException("Название не существует");
            }
            if (getPrice() == null) {
                throw new NullPointerException("Цена не существует");
            }
            if (getAmount() == 0) {
                throw new NullPointerException("Количество не существует");
            }

            System.out.println("Товар " + getName() + " " + getId() + " " + getPrice() + " " + getAmount() + " успешно удален из каталога");
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("Ошибка при удалении товара: " + e.getMessage());
        }
    }

    public void read() {
        try {
            if (id == 0) {
                throw new NullPointerException("ID не существует");
            }
            if (name == null) {
                throw new NullPointerException("Название не существует");
            }
            if (price == null) {
                throw new NullPointerException("Цена не существует");
            }
            if (amount == 0) {
                throw new NullPointerException("Данного количества не существует");
            }
            System.out.println("Информация о товаре:");
            System.out.println("Название: " + name);
            System.out.println("ID: " + id);
            System.out.println("Цена: " + price);
            System.out.println("Количество: " + amount);
            System.out.println();

        } catch (NullPointerException e) {
            System.out.println("Ошибка при чтении информации о товаре: " + e.getMessage());
        }
    }


    @Override
    public String toString(){
        return "Название товара: " + this.getName() + "\nID: " + this.getId() +
                "\nЦена: " + this.getPrice() + "\nКоличество на складе: " +
                this.getAmount();
    }

    @Override
    public void update(HashMap<String, Object> updateItem){
        try {
            if ((updateItem.containsKey("id")) && ((long)updateItem.get("id") > 0)) {
                this.setId((long)updateItem.get("id"));
            } else if ((updateItem.containsKey("id"))) {
                System.out.println("ID не может быть отрицательным");
                throw new Exception();
            }
            if ((updateItem.containsKey("name")) && (!Objects.equals(updateItem.get("name"), ""))) {
                this.setName((String)updateItem.get("name"));
            } else if (updateItem.containsKey("name")) {
                System.out.println("NAME не может быть пустым");
                throw new Exception();
            }
            if ((updateItem.containsKey("price")) && ((Double)updateItem.get("price") > 0)) {
                this.setPrice((Double)updateItem.get("price"));
            } else if (updateItem.containsKey("price")) {
                System.out.println("PRICE не может быть меньше нуля");
                throw new Exception();
            }
            if ((updateItem.containsKey("amount")) && ((long)updateItem.get("amount") > 0)) {
                this.setAmount((long)updateItem.get("amount"));
            } else if (updateItem.containsKey("amount")) {
                System.out.println("AMOUNT не может быть меньше нуля");
                throw new Exception();
            }
            System.out.println("Запись про товар обновлена на " + this);
        } catch (Exception e) {
            System.out.println("Исключение:" + e);
        }
    }
}