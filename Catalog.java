import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Catalog implements Create, Read, Update, Delete {
    private int id;
    private String name;
    public ArrayList<String> catalogItems; // добавила создание списка, поменяла доступ public

    public Catalog(int id, String name, ArrayList<String> catalogItems) {
        this.id = id;
        this.name = name;
        this.catalogItems = catalogItems;
    }

    // пустой конструктор
    public Catalog() {
    }

    // геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getItems() {
        return catalogItems;
    }

    public void setItems(ArrayList<String> catalogItems) {
        this.catalogItems = catalogItems;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", catalogItems=" + catalogItems +
                '}';
    }

    @Override
    public void update(HashMap<String, Object> updateItem) {
        try {
            if ((updateItem.containsKey("id")) && ((int) updateItem.get("id") > 0)) {
                this.setId((int) updateItem.get("id"));
            }
            if ((updateItem.containsKey("name")) && (!Objects.equals(updateItem.get("name"), ""))) {
                this.setName((String) updateItem.get("name"));
            }
            if ((updateItem.containsKey("catalogItems")) && (updateItem.get("catalogItems") != null)) {
                this.setItems((ArrayList<String>) updateItem.get("catalogItems"));
            }
            System.out.println("Запись про товар обновлена на " + this);
        } catch (Exception e) {
            System.out.println("Исключение:" + e);
        }
    }

    public void create() {
        try {
            if (0 <= id) {
                System.out.println("ID не может быть отрицательным");
                throw new IllegalArgumentException();
            }
            if (name.isEmpty()) {
                System.out.println("Имя не может быть пустым");
                throw new IllegalArgumentException();
            }
            if (catalogItems.isEmpty()) {
                System.out.println("Каталог предметов не может быть пустым");
                throw new IllegalArgumentException();
            }

            System.out.println("Создание нового каталога: " + name + " ID: " + id);
            System.out.println("В каталоге " + name + " имеются следующие товары: " + catalogItems);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Ошибка при создании каталога: " + e.getMessage());
        }
    }

    // reading info about catalog
    public void read() {
        try {
            if (0 <= id) {
                throw new NullPointerException("ID не существует");
            }
            if (name == null) {
                throw new NullPointerException("Название не существует");
            }
            if (catalogItems == null) {
                throw new NullPointerException("Список предметов не существует");
            }

            System.out.println("Информация о каталоге:");
            System.out.println("Название: " + name);
            System.out.println("ID: " + id);
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("Ошибка при чтении информации о каталоге: " + e.getMessage());
        }

    }

    // clearing of catalog items
    public void delete() {
        try {
            if (getId() == 0) {
                throw new NullPointerException("ID не существует");
            }
            if (getName() == null) {
                throw new NullPointerException("Название не существует");
            }
            if (catalogItems == null) {
                throw new NullPointerException("Список предметов не существует");
            }

            catalogItems.clear();
            System.out.println("Каталог " + getName() + " " + getId() + " успешно удален.");
            System.out.println();
        } catch (NullPointerException e) {
            System.out.println("Ошибка при удалении каталога: " + e.getMessage());
        }
    }
}

