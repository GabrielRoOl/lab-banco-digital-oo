package bank;

public class Client {

    private String name;
    private String cpf;

    private Bank bank;

    public Client(String name, String cpf, Bank bank) {
        this.name = name;
        this.cpf = cpf;
        this.bank = bank;
    }

}
