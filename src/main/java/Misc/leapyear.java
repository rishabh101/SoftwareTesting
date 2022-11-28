package Misc;
//Checking whether the year is leap or not
public class leapyear {

    public boolean check(int y){

        boolean flag = false;

        if (y % 4 == 0) {
        	
            if (y % 100 == 0) {
                if (y % 400 == 0)
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
            System.out.println(y + " : Non Leap-year");
        else
            System.out.println(y + " : Leap-year");

        return flag;
    }
}