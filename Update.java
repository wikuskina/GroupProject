import java.util.HashMap;

public interface Update {
    default void update(HashMap<String, Object> updateThis){
        System.out.println("Обновлена позиция " + this.toString());
    }

}
