package bank;

public class AccountChecking extends Count {

    private double specialCheckLimit;

    public AccountChecking(Client client, int agency, int number) {
        super(client, agency, number);
        this.specialCheckLimit= 100;
    }

    public AccountChecking(){}

    @Override
    public void sake(double sake){
        double availableBalance = this.sale + this.specialCheckLimit;

        if(sake > 0 && sake <= availableBalance){
            this.sale -= sake;
            System.out.println("Withdrawal of R$" + sake + " successfully completed (using overdraft).");
            System.out.println("New balance: R$" + this.sale);
        } else{
            System.out.println("Operation not allowed. Withdrawal limit exceeded.");
            System.out.println("Withdrawal amount: R$" + sake + ". Available balance (balance + limit): R$" + availableBalance);
        }

    }


}
