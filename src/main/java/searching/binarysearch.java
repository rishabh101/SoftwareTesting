package searching;




public class binarysearch
{
	
	public int search(int find[], int element)
    {
        
    
 
int left = 0;
int right = find.length - 1;
int res=-1;
while (left <= right) {
	int mid = left + (right - left) / 2;
	if (find[mid] == element){
        res =  mid;
        break;
    }
	if (find[mid] < element)
		left = mid + 1;
	else
		right = mid - 1;
}
System.out.println("Result: "+res);
if(res==-1)
{
	System.out.println("Element not found");
}
else
{
	System.out.println("element found");
}
return res;
}
}