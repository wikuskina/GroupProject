
import  java.util.ArrayList;
public class Catalog {
    private int id;
    private String name;
    private ArrayList<Item> items;

    public Catalog(int id, String name, ArrayList <Item> items) {
        this.id = id;
        this.name = name;
        this.items = items;
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
        public ArrayList<Item> getItems() {
        return items;
        }
        public void setToys(ArrayList<Item> items) {
        this.items = items;
        }
    }
