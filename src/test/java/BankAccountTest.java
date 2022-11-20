import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



class BankAccountTest {

    BankAccount account1;

    @BeforeEach
    public void setUp() {
        account1 = new BankAccount("Berna", "Yasar", 1997-04-11, 12345678);
    }
    @Test
    public void testFName(){
        String actualFName ="Berna";
        String expectedFName ="Berna";
        assertThat(actualFName).isEqualTo(expectedFName);

    }
    @Test
    public void testLName(){
        String actualLName = "Yasar";
        String expectedLName = "Yasar";
        assertThat(actualLName).isEqualTo(expectedLName);
    }

    @Test
    public void testDOB(){
        Integer actualDOB = 1997-04-11;
        Integer expectedDOB = 1997-04-11;
        assertThat(actualDOB).isEqualTo(expectedDOB);
    }

    @Test
    public void testAccountNumber(){
        Integer actualAN = 12345678;
        Integer expectedAN =12345678;
        assertThat(actualAN).isEqualTo(expectedAN);
    }

    @Test
    public void testBalance(){
        Double actualBalance = 500.00;
        Double expectedBalance = 500.00;
        assertThat(actualBalance).isEqualTo(expectedBalance);
    }

    // deposit test
    @Test
    public void canDeposit(){
        account1.deposit(100.00);
        assertThat(account1.getBalance()).isEqualTo(100.00);
    }
    // withdraw test
    @Test
    public void canWithdraw(){
        account1.deposit(100.00);
        account1.withdraw(100.00);
        assertThat(account1.getBalance()).isEqualTo(0);
    }

    // interest test
    @Test
    public void canPayInterest(){
        account1.deposit(100.00);
        account1.calculateInterest(0.10);
        assertThat(account1.getBalance()).isEqualTo(110.00);
    }

}
