class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left [] = new int[nums.length];
        int right [] = new int [nums.length];
        int temp =1;
        for(int i=0;i<nums.length;i++){
            left[i]=temp;
            temp = temp* nums[i];
        } 
        temp=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            right[i] = temp;
            temp = temp * nums[i];
        }
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            result[i]=left[i] * right[i];
        }
        return result;
    }
}