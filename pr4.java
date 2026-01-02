import java.util.Scanner;
public class pr4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float km = sc.nextFloat(); // when float data type is thare then nextFloat ()
        float mile= km*0.621371f;// floating point value end with 'f' when we predefines any value
        System.out.println(mile);
    }
}
