package Misc;

public class leapyear {

    public boolean check(int year){

        boolean flag = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    flag = true;
                else
                    flag = false;
            }
            else
                flag = true;
        }

        else
            flag = false;

        System.out.println("Result: ");
        if (!flag)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");

        return flag;
    }
}