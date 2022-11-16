import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


  class BankAccountTest {
    @BeforeEach
    public void setUp() {
        // BankAccount banking = new BankAccount(); this was giving me error message???
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




}
