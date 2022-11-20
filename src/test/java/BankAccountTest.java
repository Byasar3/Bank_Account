import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



class BankAccountTest {


    BankAccount account1;

    @BeforeEach
    public void setUp() {
        account1 = new BankAccount("Berna", "Yasar", 1997- 4 -11, 12345678,"savings", 500.00);
    }
    @Test
    public void testFName(){ // also can be named 'testGetFirstName' or 'testHasFirstName'
        String inputFirstName ="Berna";
        String expectedFirstName ="Berna";
        assertThat(inputFirstName).isEqualTo(expectedFirstName);

    }

    @Test
    public void testSetName(){ // testing if name can be set
        account1.setFirstName("Anreb");
        assertThat(account1.getFirstName()).isEqualTo("Anreb");
    }

    @Test
    public void testLName(){ // also can be named 'testGetLastName' or 'testHasLastName'
        String actualLName = "Yasar";
        String expectedLName = "Yasar";
        assertThat(actualLName).isEqualTo(expectedLName);
    }

    @Test
    // testing if last name can be changed
    public void testSetLastName(){
        account1.setLastName("Rasay");
        assertThat(account1.getLastName()).isEqualTo("Rasay");
    }

    @Test
    public void testDOB(){ // also can be named 'testGetDOB' or 'testHasDOB'
        Integer actualDOB = 1997-04-11;
        Integer expectedDOB = 1997-04-11;
        assertThat(actualDOB).isEqualTo(expectedDOB);
    }

    @Test
    // testing if DOB can be set/changed
    public void testSetDOB(){
        account1.setDateOfBirth(2000-11-11);
        assertThat(account1.getDateOfBirth()).isEqualTo(2000-11-11);
    }

    @Test
    public void testAccountNumber(){ // also can be named 'testGetAccountNumber' or 'testHasAccountNumber'
        Integer actualAN = 12345678;
        Integer expectedAN =12345678;
        assertThat(actualAN).isEqualTo(expectedAN);
    }

    @Test
    public void testSetAccountNumber(){
        account1.setAccountNumber(87654321);
        assertThat(account1.getAccountNumber()).isEqualTo(87654321);
    }

    @Test
    public void testBalance(){ // also can be named 'testGetBalance' or 'testHasBalance'
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

        account1.withdraw(100.00);
        assertThat(account1.getBalance()).isEqualTo(0);
    }

    // interest test
    @Test
    public void canPayInterest(){
        account1.deposit(100.00);
        account1.payInterest(0.10, 0.05);
        assertThat(account1.getBalance()).isEqualTo(110.00);
    }

}
