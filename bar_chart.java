public class bar_chart {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 8, 1 };
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];

            }
        }
        System.out.println(temp);
        int n = temp;

        for (int i = 1; i <= temp; i++) {
            
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]>= n) {
                    System.out.print("*");
                }
                 else {
                    System.out.print(" ");
                }

               
                
                
            }
           System.out.println();
           
           n--;

        
        }
    }
}