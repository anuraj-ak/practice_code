import java.util.*;
public class code2 {
    
    public static void main(String[]args){
        
        Random rm=new Random();
        Scanner sc=new Scanner(System.in);
                                            //rock=1,scissor=2,paper=3
        System.out.println("enter your choice");
        int user=sc.nextInt(3);
        int comp=rm.nextInt(1,3);

        if(user==comp){
            System.out.println("draw");
        }else if(user==1&&comp==2||user==2&&comp==3||user==3&&comp==1){
            System.out.println("user wins");
        }else{
            System.out.println("computer wins");
        }
        
    }
}
