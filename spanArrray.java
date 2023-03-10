import java.util.*;
public class spanArrray{
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,5,6};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        //         min=arr[i];
        for(int i = 0; i<arr.length ; i++){
            if(max<arr[i]){
                max=arr[i];
            }

            if(min>arr[i]){
                min=arr[i];
            }

        }
        
        System.out.println(max-min);
       
   
    }
}
