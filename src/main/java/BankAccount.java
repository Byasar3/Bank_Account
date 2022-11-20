import java.time.LocalDate;

public class BankAccount {

// PROPERTIES:

    private String firstName;
    private String lastName;
    private Integer dateOfBirth; // = LocalDate.of(2022,04,11)
    private Integer accountNumber;
    private Double balance;
    private String accountType;
    private Double overdraft;

    // constructor:

    public BankAccount(String inputFirstName, String inputLastName, Integer inputDOB, Integer inputAccountNumber) {
        this.firstName = inputFirstName;
        this.lastName = inputLastName;
        this.dateOfBirth = inputDOB;
        this.accountNumber = inputAccountNumber;
        this.balance = 00.00;

    }

    // Getters and setters for properties:
    public String getFirstName(){
        return this.firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public Integer getDateOfBirth(){
        return this.dateOfBirth;
    }

    public void setDateOfBirth(Integer DOB){
        this.dateOfBirth = DOB;
    }

    public Integer getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(Integer accountNumber){
        this.accountNumber = accountNumber;
    }

    public Double getBalance(){
        return this.balance;
    }

    public void setBalance(Double balance){
        this.balance = balance;
    }

    // Methods:

    // deposit method that updates the balance of bank account
    public void deposit(Double amount){
        this.balance += amount;
    }

    // withdraw method that updates the balance of bank account
    public void withdraw(double amount){
        this.balance -=amount;
    }

    // method to pay interest
    public Double calculateInterest(Double percentage){
        Double interestToPay = this.balance * percentage;
        return interestToPay;
    }
}
