
import  java.util.ArrayList;
public class Catalog {
    private int id;
    private String name;
    private ArrayList<Toy> toys;

    public Catalog(int id, String name, ArrayList <Toy> toys) {
        this.id = id;
        this.name = name;
        this.toys = toys;
    }
    public Catalog() {
    }
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
        public ArrayList<Toy> getToys() {
        return toys;
        }
        public void setToys(ArrayList<Toy> toys) {
            this.toys = toys;
        }
    }
