package sorting;
public class select

{
	
	int temp=0;
	  public int[] sort2(int a1[])
	    {
		  int n = a1.length;
		  
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int minindex = i;
	            for (int j = i+1; j < n; j++)
	                if (a1[j] < a1[minindex])
	                    minindex = j;
	 
	            // Swap the found minimum element with the first
	            // element
	            temp = a1[minindex];
	            a1[minindex] = a1[i];
	            a1[i] = temp;
	        }
	        System.out.println("After Sorting");
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println(a1[i]);
	        }
	        
	        return a1;
	    }
}