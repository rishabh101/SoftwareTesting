package Maths;

//We are here performing the rotate function on the below class
/*Rotate is a function in which we are doing some task like 
 * f[0]=sum of i*arr[i] for entire array
 * f[1]=rotate array  clockwise by 1 and then calculate sum as above
 * we do it for all other values 
 * and then finally find the maximum value from all the above calculated value
 * and return it
 * 
 */
public class rotate {
    
    
  public int getFunctionValueFromPrevValue(int prevSum, int sum, int resetIndex,int nums[]) {
    	int calculate=nums.length*nums[resetIndex];
    			int answer=prevSum+sum-calculate;
        return (answer);
    }
    
    public int maxRotateFunction(int[] nums) {
       
       
        int prevSum = 0,  n = nums.length;
        for (int i = 0; i < n; i++) {
        	int temp=nums[(0+i)%n]*i;
            prevSum +=temp;
        }
        
       
       
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
        }
        int sum=ans;
        int max = prevSum;
        int round;
        for (int i =n - 1; i > 0; i--, prevSum = round) {
            round = getFunctionValueFromPrevValue(prevSum, sum, i,nums);
            max = Math.max(max, round);
        }
        return max;
    }
}