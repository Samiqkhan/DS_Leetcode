class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int sum = 0;

        while(l<r)
        {
            int area = Math.min(height[l] , height[r]) *( r-l);
            sum = Math.max(area, sum);

            if(height[l]>height[r])
            {
                r--;
            }
            else{
                l++;
            }

        }
        return sum;

    }
}