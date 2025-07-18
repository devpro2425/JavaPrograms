package July2025.ex_16072025_encapculation;

public class encapsulation_1 {
    private int customerbal=50000;
    public void getBalance(int pin)
    {
        if(pin == 1234)
        {
            System.out.println("Your balance is :Rs."+customerbal);
        }
        else
        {
            System.out.println("Incorrect pin please check and retry");
        }
    }
    public void setBalance(int amount, int pin)
    {
        if(pin==1234)
        {
            if(amount <= customerbal)
            {
                customerbal = customerbal -amount;
                System.out.println("Please collect the cash, Transaction successfull");
            }
        }
        else
        {
            System.out.println("Incorrect pin please check and retry");
        }
    }
    public static void main(String[] args) {
        encapsulation_1 b=new encapsulation_1();
        b.getBalance(1234);
        b.setBalance(5000,1234);
}



}



