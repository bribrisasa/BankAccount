public class Programm {
    public static void main(){

        Bank bank = new Bank();

        User christiano = new User("christiano","ronaldo",32,"espagne","1212");
        User lionel = new User("lionel","messi",27,"catalogne","2121");

        bank.addClient(christiano);
        bank.addClient(lionel);

        Account accC1 = christiano.openAccount();
        Account accC2 = christiano.openAccount();
        Account accC3 = christiano.openAccount();
        Account accL = lionel.openAccount();



    }
}
