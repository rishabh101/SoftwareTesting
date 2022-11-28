package Maths;
public class Reverse

{
public int reverse(int x)
{
    int rev = 0;

    while (x > 0)
    {
        int r = x % 10;
        rev = rev * 10 + r;
        
        x = x / 10;
    }

    return rev;
}
}