import java.time.LocalDate;

public class BankAccount {

// PROPERTIES:

    private String firstName;
    private String lastName;
    private Integer dateOfBirth; // = LocalDate.of(2022,04,11)
    private Integer accountNumber;
    private Double balance;

    // making properties

    public BankAccount(String inputFirstName, String inputLastName, Integer inputDOB, Integer inputAccountNumber, Double inputBalance) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDOB;
        this.accountNumber = inputAccountNumber;
        this.balance = inputBalance;

    }
}
