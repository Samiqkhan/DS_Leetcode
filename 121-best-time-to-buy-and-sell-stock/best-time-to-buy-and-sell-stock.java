class Solution {
    public int maxProfit(int[] prices){
        int min =Integer.MAX_VALUE; 
        int max =0;
        for(int num : prices)
        {
            if(min > num)
            {
                min = num;
            }
            else 
            {
                max = Math.max(max, num - min);
            }
        }
        return max;
    }
}