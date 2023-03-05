public class swap_array {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j =n-1;j>0;j--){
                if(i<j){
                    arr[i]=arr[j];
                }
               
            }
        }
        System.out.println(arr);
    }

    
}
