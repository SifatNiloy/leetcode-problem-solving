class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            // Calculating width and height
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            
            // Calculating area and update maxArea
            int area = width * currentHeight;
            maxArea = Math.max(maxArea, area);
            
            // Moving the pointers
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}