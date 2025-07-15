package bank;

public class AccountChecking extends Count {

    private double specialCheckLimit;

    public AccountChecking(Client client, int agency, int number, double specialCheckLimit) {
        super(client, agency, number);
        this.specialCheckLimit= specialCheckLimit;
    }

    @Override
    public void sake(double sake){

    }


}
