/**
 * Created by sentpim on 24.03.2016.
 */
public class Email {
        private String name;

    public Email() {
    }

    public Email(String address) {
        this.name = address;
    }

    public String getEmail() {
        return name;
    }

    public void setEmail(String address) {
        this.name = address;
    }
}
