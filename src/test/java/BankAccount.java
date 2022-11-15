import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


  class BankAccountTest {
    @BeforeEach
    public void setUp() {
        BankAccount banking = new BankAccount(  );
    }
    @Test
    public void testName(){
        String actualValue = "Berna";
        String expectedValue = "Berna";
        assertThat(actualValue).isEqualTo(expectedValue);

    }

}
