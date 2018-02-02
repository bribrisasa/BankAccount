import com.bank.Bank;
import com.bank.User.User;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankTest {

    User client;
    User client2;


    @Before
    public void init(){
        client = new User();
        client2 = new User("titi","toto",30,"paris","2233");

    }
    @Test
    public void add_existing_client_in_bank(){
        Bank bank = new Bank();

        bank.addClient(client);
        assertThat(bank.getAllClients().size()).isEqualTo(1);
    }

    @Test
    public void add_new_client_in_bank(){
        Bank bank = new Bank();
        bank.newClient("toto","titi",30,"paris","00");
        assertThat(bank.getAllClients().size()).isEqualTo(1);
    }

    @Test
    public void remove_client(){
        Bank bank = new Bank();
        bank.addClient(client);
        bank.deleteClient(client);
        assertThat(bank.getAllClients().size()).isEqualTo(0);
    }

    @Test
    public void find_client_by_name(){
        Bank bank = new Bank();
        bank.addClient(client2);
        assertThat(bank.getClientByName("toto")).isEqualTo(client2);
    }

    @Test
    public void dont_find_client_by_name(){
        Bank bank = new Bank();
        bank.addClient(client2);
        assertThat(bank.getClientByName("titi")).isEqualTo(null);
    }

    @Test
    public void edit_client_identity(){
        Bank bank = new Bank();
        bank.addClient(client2);
        bank.updateIdentity(client2,"titi");
        assertThat(bank.getClientByName("titi")).isEqualTo(client2);
    }
}
