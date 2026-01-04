import java.util.*;
public class internship_1{
    public static void main(String[] args) {
        //int age;
        Scanner sc=new Scanner(System.in);
        // System.out.println("enter age");
        // age=sc.nextInt();
        // if(age>18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("not adult");
        // }
                System.out.println("enter your chice:  ");

        int button =sc.nextInt();
        switch(button){

            case 1:System.out.println("hello");
            break;

            case 2:System.out.println("namaste");
            break;

            case 3:System.out.println("hii");
            break;

            default:System.out.println("invalid choice");
        }
    }
}
