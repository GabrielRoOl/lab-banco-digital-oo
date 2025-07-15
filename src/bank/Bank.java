package bank;

import java.util.List;

public class Bank {

    private String name;
    private int code;

    private List<Count> counts;

    public Bank(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void openAccount(Client client, String typeAccount){

        /* AS to Account Saving and AC to Account Checking */

        if(typeAccount.equalsIgnoreCase("AS")){
            Count accountSaving = new AccountSaving();

        }else if (typeAccount.equalsIgnoreCase("AC")){
            AccountChecking accountChecking = new AccountChecking();

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Count> getCounts() {
        return counts;
    }

    public void setCounts(List<Count> counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", counts=" + counts +
                '}';
    }
}
