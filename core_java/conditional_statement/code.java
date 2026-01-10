import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        if( a==b){
            System.out.println("equal");
        }else if(a<=b){
            System.out.println("number A is less than B");
        }else if(a>=b){
            System.out.println("number A is greater than B" );
        }else{}


    }
}