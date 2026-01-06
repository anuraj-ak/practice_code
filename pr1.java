package practice_code;

public import java.util.Scanner;

public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int result=(sub1+sub2+sub3+sub4)/4;
        int result2=result*100;
        System.out.println(result2);

    }

    
}
