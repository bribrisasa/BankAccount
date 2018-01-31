import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<User> clients;

    public Bank() {
        this.clients = new ArrayList<User>();
    }

    public List<User> getAllClients(){
        return this.clients;
    }

    public void addClient(User c){
        this.clients.add(c);
    }

    public void deleteClient(User c){
        this.clients.remove(c);
    }

    public User getClient(User c){
        for (User u: this.getAllClients())
              {
            if(u.equals(c)) return u;
        }
        return null;
    }

    public void updateClient(User c){
        User u = this.getClient(c);
    }
}
