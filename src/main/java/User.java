import java.util.ArrayList;
import java.util.List;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String adress;
    private String phone;

    private List<Account> accounts;

    public User(){
        this.accounts = new ArrayList<Account>();
    }

    public User(String firstName, String lastName, int age, String adress, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adress = adress;
        this.phone = phone;
        this.accounts = new ArrayList<Account>();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void openAccount(Account a){
        this.accounts.add(a);
    }

    public void closeAccount(Account a){
        this.accounts.remove(a);
    }
}
