public class rotate_array_one {
public static void main(String[] args) {
    int arr[]={3,5,1,7,59};
    int r=arr[0];
    int n = arr.length;
    System.out.println(r);
    for(int i=1;i<n;i++){
        arr[i-1]=arr[i];
       
        
    }
   arr[n-1]=r;
   for(int i=0;i<arr.length;i++){
   System.out.print(arr[i]+"  ");}
}
    
}
