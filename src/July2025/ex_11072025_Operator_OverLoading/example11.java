package July2025.ex_11072025_Operator_OverLoading;

public class example11 {
    public static void main(String[] args) {
        int a=12;
        boolean b=!(a>10 || a<5);
        /*
        !(12>10 || 12<5)
        !(true || false0
        !(true or false)
        !(true)
        invert of true =false
        * */
        System.out.println(b);
    }
}
