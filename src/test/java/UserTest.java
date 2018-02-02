

import com.bank.Account;
import com.bank.User;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class UserTest {

    @Test
    public void testAddAccount(){
        User client = new User();
        client.openAccount("livretA");
        assertThat(client.getAccounts().size()).isEqualTo(1);
    }

    @Test
    public void testLinkAccount(){
        User client = new User();
        Account account = new Account("livretA");
        client.linkAccount(account);
        assertThat(client.getAccounts().size()).isEqualTo(1);
    }

    @Test
    public void testDeleteAccount(){
        User client = new User();
        Account account = new Account("livretA");
        client.linkAccount(account);
        client.closeAccount(account);
        assertThat(client.getAccounts().size()).isEqualTo(0);
    }

    @Test
    public void testReadUser(){

    User client = new User("toto","titi",40,"paris","11");
    String s = "First Name : toto/nLast Name : titi/nAge : 40/nAdress : paris/nPhone : 11/n";
    assertThat(client.infosUser()).isEqualTo(s);

    }



}
