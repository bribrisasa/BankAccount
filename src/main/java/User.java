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


    public String infosUser(){
        return "First Name : "+firstName+"/nLast Name : "+lastName+"/nAge : "+age+"/nAdress : "+adress+"/nPhone : "+phone+"/n";
    }

    public List<Account> getAccounts() {
        return accounts;
    }


    public Account openAccount(String name){
        Account a = new Account(name);
        this.accounts.add(a);
        return a;
    }

    public void closeAccount(Account a){
        this.accounts.remove(a);
    }

    public void linkAccount(Account a) { this.accounts.add(a);}

    public double sum(){
        return accounts.stream().mapToDouble(i->i.getBalance()).sum();
    }

}
