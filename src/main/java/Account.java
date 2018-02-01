import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private String name;
    private String dateCreation;
    private double balance;


    public Account(String name) {
        Date actuelle = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        this.dateCreation = dateFormat.format(actuelle);
        this.balance = 0;
        this.name = name;
    }
    public double getBalance(){
        return balance;
    }

    public void depositMoney(double amount){
        this.balance+=amount;
    }

    public void withdrawMoney(double amount){
        this.balance-=amount;
    }

    public String infosAccount(){
        return "Account type : "+name+"/nBalance : "+balance+"/n";
    }
}
