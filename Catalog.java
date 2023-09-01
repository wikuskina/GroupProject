import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Catalog implements Create, Read, Update, Delete {
    private int id;
    private String name;
    public ArrayList<String> catalogItems; // добавила создание списка, поменяла доступ public

    // пустой конструктор
    public Catalog(){
    }
    // конструктор создания каталога
    public Catalog(int id, String name, ArrayList<String> catalogItems) throws Exception{
        // check if
        if (id == 0) {
            System.out.println("ID не может равнятся 0");
            throw new Exception();
        }
        if (name.isEmpty()) {
            System.out.println("Имя каталога не может быть пустым");
            throw new Exception();
        }
        this.setId(id);
        this.setName(name);
        // Каталог может быть пустым - заполнится потом
        this.catalogItems = catalogItems;
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
    public static class NotValidInformationException extends Exception {
        public NotValidInformationException() {
            super();
        }
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
            if (0 == id) {
                System.out.println("ID не может быть отрицательным");
                throw new NotValidInformationException();
            }
            if (name.isEmpty()) {
                System.out.println("Имя не может быть пустым");
                throw new NotValidInformationException();
            }
            if (catalogItems.isEmpty()) {
                System.out.println("Каталог предметов не может быть пустым");
                throw new NotValidInformationException();
            }

            System.out.println("Создание нового каталога: " + name + " ID: " + id);
            System.out.println("В каталоге " + name + " имеются следующие товары: " + catalogItems);
            System.out.println();
        } catch (NotValidInformationException e) {
            System.out.println("Ошибка при создании каталога: " + e.getMessage());
        }
    }

    // reading info about catalog
    public void read() {
        try {
            if (id == 0) {
                System.out.println("Неверный ID");
                throw new NotValidInformationException();
            }
            if (name == null) {
                System.out.println("Неверное имя");
                throw new NotValidInformationException();
            }
            if (catalogItems == null) {
                System.out.println("Неверный список предметов");
                throw new NotValidInformationException();
            }

            System.out.println("Информация о каталоге:");
            System.out.println("Название: " + name);
            System.out.println("ID: " + id);
            System.out.println();
        } catch (NotValidInformationException e) {
            System.out.println("Ошибка при чтении информации о каталоге: " + e.getMessage());
        }

    }

    // clearing of catalog items
    public void delete() {
        try {
            if (getId() == 0) {
                System.out.println("Неверный ID");
                throw new NotValidInformationException();
            }
            if (getName() == null) {
                System.out.println("Неверное название");
                throw new NotValidInformationException();
            }
            if (catalogItems == null) {
                System.out.println("Неверный список предметов");
                throw new NotValidInformationException();
            }

            catalogItems.clear();
            System.out.println("Каталог " + getName() + " " + getId() + " успешно удален.");
            System.out.println();
        } catch (NotValidInformationException e) {
            System.out.println("Ошибка при удалении каталога: " + e.getMessage());
        }
    }
}

