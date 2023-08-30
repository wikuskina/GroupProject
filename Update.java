import java.util.ArrayList;
import java.util.List;

public interface Update {
    default void update(ArrayList<Object> updateThis){
        System.out.println("Обновлена позиция " + this.toString());
    }

}
