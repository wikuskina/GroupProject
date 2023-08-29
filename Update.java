import java.util.ArrayList;
import java.util.List;

public interface Update extends Create, Delete{
    default void update(ArrayList updateThis){
        System.out.println("Обновлена позиция " + this.toString());
    }

}
