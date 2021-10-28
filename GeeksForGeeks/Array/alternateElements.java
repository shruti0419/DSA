package GeeksForGeeks.Array;

public class alternateElements
{
    public static void print(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        
        }
        
    }
}