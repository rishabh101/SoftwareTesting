package Maths;


import java.util.*;

public class PrimeFactorization {

    public List<Integer> calculate(int number){

        
        List<Integer> result = new ArrayList();
        int flag=0;

        while (number % 2 == 0) {
            if(flag==0){
                result.add(2);
                flag=1;
            }
            number /= 2;
        }

        flag=0;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                if(flag==0){
                    result.add(i);
                    flag=1;
                }
                number /= i;
            }
        }

        if (number > 2) {
            result.add(number);
        }

        System.out.println("Result: ");
        for (int v : result) {
            System.out.print(v+" ");
        }

        return result;

    }

}