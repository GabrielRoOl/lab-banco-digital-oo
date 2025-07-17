package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    private int code;

    private List<Count> counts = new ArrayList<>();

    public Bank(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public List<Count> getCounts() {
        return counts;
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
