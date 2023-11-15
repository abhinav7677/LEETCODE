class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int b=0;
        for(int x:arr) if(b<x)b++;
        return b;
    }
}