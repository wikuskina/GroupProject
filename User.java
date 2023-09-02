import java.util.HashMap;
import java.util.Objects;

public class User implements Create, Read, Update, Delete {

    // Declaring variables: user ID, name, surname, email, gender, date of birth.
    long user_id;

    String user_name;

    String user_surname;

    String user_email;

    String user_gender;

    String user_DOB;

    int passportNumber;


    // Constructor empty
    public User() {
    }

    // Constructor non-empty
    public User(int passportNumber, long user_id, String user_name, String user_surname, String user_email, String user_gender, String user_DOB) {
        this.passportNumber = passportNumber;
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.user_email = user_email;
        this.user_gender = user_gender;
        this.user_DOB = user_DOB;
    }

    public User(int passportNumber, String userDatum, String userDatum1, String userDatum2, String userDatum3, String userDatum4, String userDatum5) {
    }

    public User(long user_id, String user_name, String user_surname, String user_email, String user_gender, String user_DOB, int passportNumber) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.user_email = user_email;
        this.user_gender = user_gender;
        this.user_DOB = user_DOB;
        this.passportNumber = passportNumber;
    }

    public static void addUser(User newUser) {
    }

    // Output user to string
    public void printToString() {
        String str = "Пользаватель: ";
        str += "id " + this.getUser_id() + ", Имя, Фамилия - " + this.getUser_name() + " " + this.getUser_surname();
        // check if some fields are not empty
        if (!this.getUser_email().isEmpty()) {
            str += ", email - " + this.getUser_email();
        }
        if (!this.getUser_gender().isEmpty()) {
            str += ", пол - " + this.getUser_gender();
        }
        if (!this.getUser_DOB().isEmpty()) {
            str += ", дата рождения - " + this.getUser_DOB();
        }
        System.out.println(str);
    }
    // Setter methods: to set / update value

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public void setUser_DOB(String user_DOB) {
        this.user_DOB = user_DOB;
    }

    // Getter methods: to return the value
    public int getUser_PassportNumber() {
        return passportNumber;
    }

    public long getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public String getUser_DOB() {
        return user_DOB;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_surname='" + user_surname + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_DOB='" + user_DOB + '\'' +
                '}';
    }

    public static class NotValidInformationException extends Exception {
        public NotValidInformationException() {
            super();
        }
    }

    public void create() {
        try {
            if (user_id == 0) {
                System.out.println("ID должен быть больше 0");
                throw new NotValidInformationException();
            }
            if (user_name.isEmpty()) {
                System.out.println("Имя не может быть пустым");
                throw new NotValidInformationException();
            }
            if (user_surname.isEmpty()) {
                System.out.println("Фамилия не может быть пустой");
                throw new NotValidInformationException();
            }
            if (user_email.isEmpty()) {
                System.out.println("Email не может быть пустым");
                throw new NotValidInformationException();
            }
            if (user_gender.isEmpty()) {
                System.out.println("Пол не может быть пустым");
                throw new NotValidInformationException();
            }
            if (user_DOB.isEmpty()) {
                System.out.println("Дата не может быть пустой");
                throw new NotValidInformationException();
            }
            System.out.println("Создание пользователя: ID: " + user_id + ", Имя, Фамилия - " + user_name + " " + user_surname
                    + ", email - " + user_email + ", пол - " + user_gender + ", дата рождения - " + user_DOB);
            System.out.println();
        } catch (NotValidInformationException e) {
            System.out.println("Ошибка при создании товара: " + e.getMessage());
        }
    }

    public void delete() {
        try {
            if (user_id == 0) {
                System.out.println("Неверный ID");
                throw new NotValidInformationException();
            }
            if (user_name == null) {
                System.out.println("Неверное имя");
                throw new NotValidInformationException();
            }
            if (user_surname == null) {
                System.out.println("Невернвя фамилия");
                throw new NotValidInformationException();
            }
            if (user_email == null) {
                System.out.println("Неверный email");
                throw new NotValidInformationException();
            }
            if (user_gender == null) {
                System.out.println("Неверный пол");
                throw new NotValidInformationException();
            }
            if (user_DOB == null) {
                System.out.println("Неверная дата рождения");
                throw new NotValidInformationException();
            }

            System.out.println("Пользователь " + user_name + " " + user_surname + " по ID: " + user_id + " успешно удален.");
            System.out.println();
        } catch (NotValidInformationException e) {
            System.out.println("Ошибка при удалении пользователя: " + e.getMessage());
        }
    }

        public void read() {
        try {
            if (user_id == 0) {
                System.out.println("Неверный ID");
                throw new NotValidInformationException();
            }
            if (user_name == null) {
                System.out.println("Неверное имя");
                throw new NotValidInformationException();
            }
            if (user_surname == null) {
                System.out.println("Невернвя фамилия");
                throw new NotValidInformationException();
            }
            if (user_email == null) {
                System.out.println("Неверный email");
                throw new NotValidInformationException();
            }
            if (user_gender == null) {
                System.out.println("Неверный пол");
                throw new NotValidInformationException();
            }
            if (user_DOB == null) {
                System.out.println("Неверная дата рождения");
                throw new NotValidInformationException();
            }

            printToString();
        } catch (NotValidInformationException e) {
            System.out.println("Ошибка при чтении информации о пользователе: " + e.getMessage());
        }
    }

    @Override
    public void update(HashMap<String, Object> updateItem) {
        try {
            if ((updateItem.containsKey("user_id")) && ((long)updateItem.get("user_id") > 0)) {
                this.setUser_id((long)updateItem.get("user_id"));
            } else if ((updateItem.containsKey("user_id"))) {
                System.out.println("ID не может быть отрицательным");
                throw new Exception();
            }
            if ((updateItem.containsKey("user_name")) && (!Objects.equals(updateItem.get("user_name"), ""))) {
                this.setUser_name((String)updateItem.get("user_name"));
            } else if ((updateItem.containsKey("user_name"))) {
                System.out.println("Имя не может быть пустым");
                throw new Exception();
            }
            if ((updateItem.containsKey("user_surname")) && (!Objects.equals(updateItem.get("user_surname"), ""))) {
                this.setUser_surname((String)updateItem.get("user_surname"));
            } else if ((updateItem.containsKey("user_surname"))) {
                System.out.println("Фамилия не может быть пустой");
                throw new Exception();
            }
            if ((updateItem.containsKey("user_email")) && (!Objects.equals(updateItem.get("user_email"), ""))) {
                this.setUser_email((String)updateItem.get("user_email"));
            } else if ((updateItem.containsKey("user_email"))) {
                System.out.println("E-Mail не может быть пустым");
                throw new Exception();
            }
            if ((updateItem.containsKey("user_gender")) && (!Objects.equals(updateItem.get("user_gender"), ""))) {
                this.setUser_gender((String)updateItem.get("user_gender"));
            } else if ((updateItem.containsKey("user_gender"))) {
                System.out.println("Пол не может быть пустым");
                throw new Exception();
            }
            if ((updateItem.containsKey("user_DOB")) && (!Objects.equals(updateItem.get("user_DOB"), ""))) {
                this.setUser_DOB((String)updateItem.get("user_DOB"));
            } else if ((updateItem.containsKey("user_DOB"))) {
                System.out.println("Дата Рождения не может быть пустой");
                throw new Exception();
            }
            System.out.println("Запись про пользователя обновлена на " + this);
            System.out.println();
        } catch (Exception e) {
                System.out.println("Исключение:" + e);
        }
    }
}
