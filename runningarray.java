
public class runningarray {
    public static void main(String[] args) {
        int arr[] = {0,4,6,3,5,43,56,4};
        sum(arr);
    }
    public static void sum(int arr[]){
        int n=arr.length;
        int s=arr[0];
        System.out.print(s+ " ");
        for(int i=0;i<n-1; i++){
            s= s+arr[i+1];
            System.out.print(s + " " );
        }
        System.out.println();
    }

}