package sorting;

/**
 * Hello world!
 *
 */


/*
 * the program does sorting by using the bubblesort algorithm
 */

public class bubblesort 
{
	int temp;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
   
    public int[] sort(int a1[])
    {
    
    	int n=a1.length;
    	for(int i=0;i<a1.length-1;i++)
    	{
    		
    		for(int j=i+1;j<a1.length;j++)
    		{
    			if(a1[i]>a1[j])
    			{
    				temp=a1[i];
    				a1[i]=a1[j];
    				a1[j]=temp;
    			
    			}
    		}
    		
    	}
    	 System.out.println("After Sorting");
	        for(int i=0;i<n;i++)
	        {
	        	System.out.println(a1[i]);
	        }
	        
    	return a1;
    }
}