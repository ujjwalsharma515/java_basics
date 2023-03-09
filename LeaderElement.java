

public class LeaderElement {
    public static void main(String[] args) {
        int arr[]={5,3,8,9,7,4};
        for(int i=0;i<arr.length;i++){
            boolean temp=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=false;
                }
            }
            if(temp==true){
                System.out.println(arr[i]);
            }
        }

    }
}
