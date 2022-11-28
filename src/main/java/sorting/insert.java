package sorting;
public class insert
{
	  public int[] sort(int a1[])
	    {
		  int n = a1.length;
			if(n==0)
				return null;
			for (int i = 1; i < n; ++i) {
				int key = a1[i];
				int j = i - 1;

				while (j >= 0 && a1[j] > key) {
					a1[j + 1] = a1[j];
					j = j - 1;
				}
				a1[j + 1] = key;
			}

			System.out.println("After Sorting");
			
	        for (int i = 0; i < n; ++i)
				System.out.println(a1[i]);

	        return a1;
	    }
}