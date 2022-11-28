package searching;

public class linearsearch
{
	public int search(int find[], int element)
    {
        for (int i = 0; i < find.length; i++) {
            // Return the index of the element if the element
            // is found
            if (find[i] == element)
            {
            	System.out.println("Element found");
                return i;
            }
        }
 
        System.out.println("Element not found");
        // return -1 if the element is not found
        return -1;
    }
}