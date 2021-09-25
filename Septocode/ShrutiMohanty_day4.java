import java.util.Scanner;

public class ShrutiMohanty_day4 {
    public static void main(String[] args) {
        int op;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n;i++){
            a[i]= sc.nextInt();
        }

        for(int i=0;i<n;i++){
            int x;
            if(a[i] < 34 || a[i]%5==0 ){
                op=a[i];
            }
            else if(a[i]%5<3){
            op=a[i];
            }
            else{
                x =a[i]/5;
                op=5*(x+1);
            }
            System.out.println(op);
        }

    }
}
