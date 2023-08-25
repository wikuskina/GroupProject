public class User {

    // Declaring variables: user ID, name, surname, email, gender, date of birth
    long user_id;

    String user_name;

    String user_surname;

    String user_email;

    String user_gender;

    String user_DOB;

    // Constructor empty
    public User() {
    }

    // Constructor non-empty
    public User(long user_id, String user_name, String user_surname, String user_email, String user_gender, String user_DOB) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_surname = user_surname;
        this.user_email = user_email;
        this.user_gender = user_gender;
        this.user_DOB = user_DOB;
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
}
