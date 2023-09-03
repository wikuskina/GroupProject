import java.util.ArrayList;

public class Storage {
    public ArrayList<Object> StorageList;

    public Storage(ArrayList<Object> storageList) {
        StorageList = storageList;
    }

    public ArrayList<Object> getStorageList() {
        return StorageList;
    }
    public void setStorageList(ArrayList<Object> storageList) {
        this.StorageList = storageList;
    }

    public void addElement(Object element) {
        StorageList.add(element);

   }

    public void read(){
        System.out.println("Список всех товаров добавленных в Storage class: " + "\n"+ StorageList);
        System.out.println();
    }

    public void delete(){
        System.out.println("Список всех товаров добавленных в Storage class удален. ");
        StorageList.clear();
        System.out.println();
    }
}

