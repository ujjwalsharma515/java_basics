public class odd_no {
    static int oddelement(int arr[],int arr_size){
       for(int i=0;i<arr_size;i++){
           int count =0;

           for(int j=0;j<arr_size;j ++){

               if(arr[i]==arr[j])
               count++;
           }
           if(count%2 !=0)
           return arr[i];
       }
       return -1;

   }
   public static void main(String[] args) {
       int arr[]= new int[] {1,4,7,7,4};
       int n= arr.length;
       System.out.println(oddelement(arr, n));

   }
   
   
}