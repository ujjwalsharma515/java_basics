public class reverse_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int s = arr[0];
        int e = arr[arr.length-1];
  
    // for(int i = 0;i<=arr.length-1;i++){
    //     for(int j = arr.length-1 ; j<=0;j--){
    //         if(i<j){
    //             arr[i]=arr[j];

    //         }
            
    //     }
      
        
       
    // }
    // for(int j=0;j<arr.length;j++){
    //     System.out.print(arr[j]+"  ");
    // }

    for(int i = 0;i<=arr.length-1;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
for(int i =arr.length-1;i>=0;i--){
    System.out.print(arr[i]+" ");
}
}
}


