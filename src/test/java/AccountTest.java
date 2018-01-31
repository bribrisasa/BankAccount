import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;;

public class AccountTest {

    @Test
    public void testAddMoney(){
        Account account = new Account();
        account.depositMoney(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void testRemoveMoney(){
        Account account = new Account();
        account.depositMoney(10);
        account.withdrawMoney(10);
        assertThat(account.getBalance()).isEqualTo(0);
    }
}
