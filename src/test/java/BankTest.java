import com.bank.Bank;
import com.bank.User;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BankTest {

    User client;


    @Before
    public void init(){
        client = new User();

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

}
