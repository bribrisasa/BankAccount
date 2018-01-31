import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class AccountTest {

    @Test
    public void testOpenAccount(){
        Account account = new Account("courant");
        double b = account.getBalance();
        assertThat(b).isEqualTo(0);
    }

    @Test
    public void testAddMoney(){
        Account account = new Account("courant");
        account.depositMoney(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void testRemoveMoney(){
        Account account = new Account("courant");
        account.withdrawMoney(10);
        assertThat(account.getBalance()).isEqualTo(-10);
    }

    @Test
    public void testSumMoney(){
        Account account = new Account("courant");
        Account account1 = new Account("livret");
        account.depositMoney(10);
        account1.depositMoney(20);
        User u = new User();
        u.linkAccount(account);
        u.linkAccount(account1);
        assertThat(u.sum()).isEqualTo(30);
    }
}
