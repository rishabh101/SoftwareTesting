package Maths;
//We are here calculating the reverse of a number
/*
 * like the reverse of 123=321
 */
public class Reverse


{
public int reverse(int x)
{
    int rev = 0;
//the loop will execute until x becomes zero
    while (x > 0)
    {
    	//calculating the remainder
        int r = x % 10;
        //reverse calculation by formula
        rev = rev * 10 + r;
        
        x = x / 10;
    }

    return rev;
}
}