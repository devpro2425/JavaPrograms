package July2025.ex_17072025;

public class GradeSystem {
    public static void main(String[] args) {
/*If Total is Greator or equal to 90=A;//If Total is greator than 80 to 90 =B;
  If total is greator than 70 to 80 grade is c
  if total is greator than 60 to 70 grade is d
  if total is greator than 50 to 60 Grade is E
  if total is greator than 0 to 49 grade is FF

        */
        int total=45;
        String grade =(total>90)?"A":(total>80)?"B":(total>70)?"C":(total>60)?"D":(total>50?"E":"FF");
        System.out.println(grade);

    }
}
