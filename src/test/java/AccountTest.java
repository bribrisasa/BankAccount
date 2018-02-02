
import com.bank.Account;
import com.bank.User;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AccountTest {

    User client;
    Account accountZero;
    Account accountPositif;
    Account accountNegatif;
    
    @Before
    public void init(){
        client = new User();
        accountZero = new Account("zero");
        accountPositif = new Account("positif");
        accountNegatif = new Account("negatif");

    }

    @Test
    public void testOpenAccount(){
        double b = accountZero.getBalance();
        assertThat(b).isEqualTo(0);
    }

    @Test
    public void testAddMoney(){
        accountPositif.depositMoney(10);
        assertThat(accountPositif.getBalance()).isEqualTo(10);
    }

    @Test
    public void testRemoveMoney(){
        accountNegatif.withdrawMoney(10);
        assertThat(accountNegatif.getBalance()).isEqualTo(-10);
    }

    @Test
    public void testSumMoney(){
        Account account = new Account("courant");
        Account account1 = new Account("livret");
        account.depositMoney(10);
        account1.depositMoney(20);

        client.linkAccount(account);
        client.linkAccount(account1);
        assertThat(client.sum()).isEqualTo(30);
    }

    @Test
    public void testInfoAccount(){
        String s = "com.bank.Account type : zero/nBalance : 0.0/n";
        assertThat(accountZero.infosAccount()).isEqualTo(s);
    }
}
