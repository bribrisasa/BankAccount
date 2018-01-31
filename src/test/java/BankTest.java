import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;;

public class BankTest {

    @Test
    public void testAddClient(){
        Bank b = new Bank();
        User c = new User();
        b.addClient(c);
        assertThat(b.getAllClients().size()).isEqualTo(1);
    }

    @Test
    public void testAddNewClient(){
        Bank b = new Bank();
        User u = b.newClient("toto","titi",30,"paris","00");
        assertThat(b.getAllClients().size()).isEqualTo(1);
    }

    @Test
    public void testdeleteClient(){
        Bank b = new Bank();
        User c = new User();
        b.addClient(c);
        b.deleteClient(c);
        assertThat(b.getAllClients().size()).isEqualTo(0);
    }

    @Test
    public void testUpdateClient(){
        Bank b = new Bank();
        User c = new User("toto","",0,"","");
        b.addClient(c);
        c.setFirstName("titi");
        assertThat(b.getClient(c).getFirstName()).isEqualTo("titi");
    }
}
