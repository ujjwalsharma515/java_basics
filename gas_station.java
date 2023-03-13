public class gas_station {
    public static void main(String[] args) {
        
        int gas[]={1,2,3,4,5};
        int cost[]={3,4,5,1,2};
        // for(int i = 0;i<gas.length;i++){
        //     if(gas[i]>cost[i]){
        //         System.out.println(gas[i]);
        //         break;}
        int rem = 0;
        int start = 0;
        int loss = 0;
        for(int i = 0;i<gas.length;i++){
        rem = rem + gas[i]-cost[i];
        if(rem<0){
         start = i+1;
          loss=loss+ rem;
          rem=0;
        
        }
        if(loss + rem>=0){
            System.out.println(gas[start]);
        }
    
    }
    
}
}