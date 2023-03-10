public class majorityofelement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5,7,7,7};
        int count = 0;
        int m = 0;
        int n= arr.length;
        for(int i=0; i<n; i++){
            if(count == 0){
                m = arr[i];
            }
            if(m == arr[i]){
                count +=1;
            }
            else{
                count -=1;
            }
        }
        System.out.println(m);
    }
}