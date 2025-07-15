package bank;

public abstract class Count {

    protected Client client;

    protected int agency;
    protected int number;
    protected double sale;

    public Count(Client client, int agency, int number) {
        this.client = client;
        this.agency = agency;
        this.number = number;
        this.sale = 0;
    }

    public void deposit(double deposit){
        if(deposit <= 0){
            throw new RuntimeException("The deposit amount cannot be negative");
        }
        this.sale += deposit;
    }

    public void sake(double sake){
        if(sake > 0 && this.sale >= sake) {
            this.sale -= sake;
            System.out.println("Withdrawal of R$" + sake + " successfully completed. New balance: " + this.sale);
        }else{
            throw new RuntimeException("unavailable balance");
        }
    }

    public void checkBalance(){
        System.out.println("Current balance: " + getSale());
    }

    public Client getClient() {
        return client;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getSale() {
        return sale;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}
