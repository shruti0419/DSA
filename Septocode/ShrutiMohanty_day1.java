import java.util.Scanner;

public class ShrutiMohanty_day1 {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=0;i<n;i++)
     {
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         int result=a+(b*c/a)-b;
         System.out.println("Score = " + result);
     }
    
    }
}