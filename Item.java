public class Item {
    private long id;
    private String name;
    private Double price;
    private long amount;

    public Item() throws Exception{
        System.out.println("Нельзя создать пустой товар");
        throw new Exception();
    }

    public Item(long id, String name) throws Exception{
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
}
