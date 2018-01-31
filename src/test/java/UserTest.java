import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;;

public class UserTest {

    @Test
    public void testAddAccount(){
        User c = new User();
        c.openAccount("livretA");
        assertThat(c.getAccounts().size()).isEqualTo(1);
    }

    @Test
    public void testLinkAccount(){
        User c = new User();
        Account acc = new Account("livretA");
        c.linkAccount(acc);
        assertThat(c.getAccounts().size()).isEqualTo(1);
    }

    @Test
    public void testDeleteAccount(){
        User c = new User();
        Account acc = new Account("livretA");
        c.linkAccount(acc);
        c.closeAccount(acc);
        assertThat(c.getAccounts().size()).isEqualTo(0);
    }

    @Test
    public void testReadUser(){

    User u = new User("toto","titi",40,"paris","11");
    String s = "First Name : toto/nLast Name : titi/nAge : 40/nAdress : paris/nPhone : 11/n";
    assertThat(u.infosUser()).isEqualTo(s);

    }




}
