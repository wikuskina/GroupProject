
public class Main {
    public static void main(String[] args) throws Exception {
        Item item1 = new Item(105, "Машинка", 50.5, 50);
        System.out.println(item1.getId() + " " + item1.getName() + " " + item1.getPrice() + " " + item1.getAmount());
    }
}

