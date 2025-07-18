package July2025.ex_16072025_encapculation;

public class ATMMachine {
    public static void main(String[] args) {
        ATMMachine am = new ATMMachine();
        encapsulation_1 s = new encapsulation_1();

        s.getBalance(1234);// Abstraction
        s.setBalance(5000, 1234);
        s.getBalance(1234);
    }
}


