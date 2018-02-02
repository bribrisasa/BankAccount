

import com.bank.Account;
import com.bank.User.User;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class UserTest {

    @Test
    public void add_new_account_to_client(){
        User client = new User();
        client.openAccount("livretA");
        assertThat(client.getAccounts().size()).isEqualTo(1);
    }

    @Test
    public void link_account_to_client(){
        User client = new User();
        Account account = new Account("livretA");
        client.linkAccount(account);
        assertThat(client.getAccounts().size()).isEqualTo(1);
    }

    @Test
    public void delete_account_from_client(){
        User client = new User();
        Account account = new Account("livretA");
        client.linkAccount(account);
        client.closeAccount(account);
        assertThat(client.getAccounts().size()).isEqualTo(0);
    }

    @Test
    public void read_infos_client(){

    User client = new User("toto","titi",40,"paris","11");
    String s = "First Name : toto/nLast Name : titi/nAge : 40/nAdress : paris/nPhone : 11/n";
    assertThat(client.infosUser()).isEqualTo(s);

    }

    @Test
    public void edit_identity_client(){

        User client = new User("toto","titi",40,"paris","11");
        client.updateIdentity("tititi");
        assertThat(client.getIdentity().getLastName()).isEqualTo("tititi");

    }

    @Test
    public void edit_adress_client(){

        User client = new User("toto","titi",40,"paris","11");
        client.updateAdress("Lyon");
        assertThat(client.getInfos().getAdress()).isEqualTo("Lyon");

    }

    @Test
    public void edit_phone_client(){

        User client = new User("toto","titi",40,"paris","11");
        client.updatePhone("12");
        assertThat(client.getInfos().getPhone()).isEqualTo("12");

    }
}
