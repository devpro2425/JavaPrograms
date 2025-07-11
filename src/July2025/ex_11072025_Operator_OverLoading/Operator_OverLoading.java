package July2025.ex_11072025_Operator_OverLoading;

public class Operator_OverLoading {
    public static void main(String[] args) {
        String first_name="Mehul";
        String last_name="Pagi";
        int a=10;
        int b=20;
        System.out.println(first_name+last_name);
        System.out.println(a+b);
        System.out.println(first_name+last_name+a+b);
        System.out.println(a+b+first_name+last_name);
        System.out.println(first_name+last_name+(a+b));
        System.out.println((a+b)+first_name+last_name);
        //BODMAS Rule used : Breaket order {(/*+-)}
    }
}
