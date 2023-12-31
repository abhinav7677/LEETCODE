class Solution {
    public int climbStairs(int n) {
        // Base case: If there's only 1 step, there's only one way to reach the top.
        if (n == 1) {
            return n;
        }
        
        // Initialize variables a and b to represent the number of ways to reach the
        // current step and the previous step respectively.
        int a = 1, b = 1, c = 0;
        
        // Loop to calculate the number of ways to reach each step from 2 to n.
        for (int i = 2; i <= n; i++) {
            // The number of ways to reach the current step (c) is the sum of ways to
            // reach the previous two steps (a and b).
            c = a + b;
            
            // Update a and b for the next iteration.
            a = b;
            b = c;
        }
        
        // After the loop, c contains the number of ways to reach the top with n steps.
        return c;
    }
}
