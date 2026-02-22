class Solution {
    public int maxSubArray(int[] arr) {
        int curr=arr[0];
        int max=arr[0];
        int n =arr.length;
        for(int i =1;i<n;i++)
        {
        curr=Math.max(arr[i],curr+arr[i]);
        max=Math.max(max,curr);

        }
        return max;
        
    }
}