import bank.Bank;
import bank.Client;

public class Main {
    public static void main(String[] args) {

        Bank santander = new Bank("santander", 1);


        Client alex = new Client("Alex", "123", santander);

        santander.openAccount(alex, "AS");

        System.out.println(santander);

    }
}