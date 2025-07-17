import bank.*;

public class Main {
    public static void main(String[] args) {

        // register dwo banks
        Bank santander = new Bank("santander", 1);
        Bank sofisa = new Bank("sofisa", 2);

        // register two customers, each in a different bank
        Client alex = new Client("Alex", "123", santander);
        Client gabriel = new Client("Gabriel", "123", sofisa);


        // add a savings account for alex
        AccountSaving accountSaveling = new AccountSaving(alex, 1, 1);

        // accountSaveling.deposit(-2);  // The deposit amount cannot be negative
        accountSaveling.deposit(2000);

        accountSaveling.checkBalance(); // Show balance

        accountSaveling.interestIncome(); // Show interest income

        System.out.println("+++++++++++++++++++++++++++++++++===============================");

        // add a checking accout for gabriel
        Count accountChecking = new AccountChecking(gabriel, 2, 2);
        // accountChecking.deposit(-2);  // The deposit amount cannot be negative
        accountChecking.deposit(200);
        // every open checking account has an overdraft limit of 100 reais.
        accountChecking.sake(230);   // Withdrawal of R$230.0 successfully completed (using overdraft). New balance: R$-30.0

        accountChecking.checkBalance();  // Show balance
    }
}