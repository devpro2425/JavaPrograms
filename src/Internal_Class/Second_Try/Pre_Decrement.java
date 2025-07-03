package Internal_Class.Second_Try;

public class Pre_Decrement {
    public static void main(String[] args) {
        /*int c=10;
        int g=c++;
        System.out.println(g);
        System.out.println(c);*/



        int x=10;
        int y=++x;
        int z=x++;
        System.out.println(y);
        System.out.println(x);
        System.out.println(z);

        int c=10;
        int d=c--;
        int e=d--;
        int f=d++;
        System.out.println(c);//vlues of C-1=9;
        System.out.println(d);//values of d=10; 10-1=9+1=10;
        System.out.println(e);//Values of e=10;
        System.out.println(f);//values of f=9;

}}
