package bank;

public class AccountSaving extends Count {

    // É importante guardar a taxa como um decimal. Ex: 0.5% = 0.005
    private double interestRate;

    public AccountSaving(Client client, int agency, int number, double interestRate) {
        super(client, agency, number);
        this.interestRate = interestRate;
    }

    public AccountSaving() {}

    public void interestIncome(){
        if(this.sale > 0){
            double performance = this.sale * this.interestRate;
            this.sale += performance;
            System.out.printf("Yield amount: R$ %.2f\n", performance);
            System.out.printf("New balance: R$ %.2f\n", this.sale);
        }
        else {
            System.out.println("There is no balance to earn interest.");
        }

    }
}
