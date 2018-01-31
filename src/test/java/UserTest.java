import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;;

public class UserTest {

    @Test
    public void testAddAccount(){
        User c = new User();
        Account acc = new Account();
        c.openAccount(acc);
        assertThat(c.getAccounts().size()).isEqualTo(1);
    }

    @Test
    public void testDeleteAccount(){
        User c = new User();
        Account acc = new Account();
        c.openAccount(acc);
        c.closeAccount(acc);
        assertThat(c.getAccounts().size()).isEqualTo(0);
    }

    @Test
    public void testUpdateAccount(){

    }

    @Test
    public void testReadUser(){

    }

}
