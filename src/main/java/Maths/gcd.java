package Maths;



// This class calculates the GCD of 2 numbers
public class gcd {


	
    public int calculate(int n1,int n2)  {

        int answer=0;
        if (n1 < 0 || n2 < 0) {
            return -1;
        }

        if (n1 == 0 || n2 == 0) {
            if(n1<n2) 
                answer = n2-n1;
            else 
                answer = n1-n2;
        }

        else{
            while (n1 % n2 != 0) {
                int remainder = n1 % n2;
                n1 = n2;
                n2 = remainder;
            }
            answer = n2;
        }
        
        System.out.println("Result  : "+answer);
        return answer;
    }
}