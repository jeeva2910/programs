public class beststock {
    
    public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else {
             profit=prices[i]-min;
             if(profit>max){
                max=profit;
             }
            }       
        }
    return max;
    }

        public static void main(String args[]){
            int prices[]={7,1,5,3,6,4};
            beststock obj=new beststock();
            int profit=obj.maxProfit(prices);
            System.out.println(profit);
        }      
    
}

