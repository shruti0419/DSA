package GeeksForGeeks.Array;
public class cyclicallyrotateelementbyone {
    
    public void rotate(int arr[], int n)
    {
        int l=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
            arr[0]=l;
        
    }
}