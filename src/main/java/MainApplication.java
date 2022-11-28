
import Maths.*;

import searching.*;
import sorting.*;
import conversion.*;

import Misc.*;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int ch=0;
        boolean exit = false;
        start_main: while(!exit){
            System.out.println("Select option:\n1. Math\n2. Search\n3. Sort\n4. Area\n5. Conversion \n6.Miscellaneous \n7.Exit");
            choice = sc.nextInt();
            ch = 0;
            switch (choice){
                case 1: System.out.println("Enter choice:\n1. GCD\n2. Prime Factorization\n3. Reverse\n4. Square\n5.Logarithm \n6. Factorial ");
                    ch = sc.nextInt();
                    switch (ch){
                        case 1: //gcd
                            System.out.println("Number 1: ");
                            int num1 = sc.nextInt();
                            System.out.println("Number 2: ");
                            int num2 = sc.nextInt();
                            new gcd().calculate(num1,num2);
                            break;

                        case 2: //prime factorization
                        	System.out.println("Enter number: ");
                            int prime_factor = sc.nextInt();
                            PrimeFactorization p1=new PrimeFactorization();
                            System.out.println(p1.calculate(prime_factor));
                            break;
                            

                        case 3: //reverse
                            System.out.println("Enter number ");
                           int p2=sc.nextInt();
                           System.out.println(new Reverse().reverse(p2));
                            break;

                       

                        case 4: //square
                        	System.out.println("Enter number ");
                            int n1=sc.nextInt();
                            System.out.println( new Square().calculate(n1));
                            break;
                        case 5://logarithm
                        	Scanner input=new Scanner(System.in);
                   		 System.out.println("Enter base ");
                   		int b=input.nextInt();
                   		
                   		 System.out.println("Enter number of which you want to calculate logarithm");
                   		
                   		double a=input.nextInt();
                   		System.out.println("Logarithm is "+new Logarithm().log(b, a));
                        	break;
                        case 6://factorial
                        	Scanner input1=new Scanner(System.in);
                        	System.out.println("enter number ");
                       		int num=input1.nextInt();
                       		System.out.println("the factorial is "+new Factorial().calculate(num));
                       		break;
                        default:
                            continue start_main;
                    }
                    break;

               

                case 2: System.out.println("Enter choice:\n1. Binary Search\n2. Linear Search\n3. Menu ");
                    ch = sc.nextInt();
                    if(ch==3) continue start_main;
                    System.out.println("Enter array length: ");
                    int search_len = sc.nextInt();
                    int search_arr[] = new int[search_len];
                    System.out.println("Enter numbers: ");
                    for(int u=0;u<search_len;u++){
                        search_arr[u] = sc.nextInt();
                    }

                    System.out.println("Enter target: ");
                    int target = sc.nextInt();

                    switch (ch){
                        case 1: // Binary
                            new binarysearch().search(search_arr,target);
                            break;

                        case 2: // Linear
                            new linearsearch().search(search_arr,target);
                            break;
                        case 3:
                            continue start_main;
                    }
                    break;

                case 3:
                    System.out.println("Enter choice:\n1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort\n4. Menu ");
                    ch = sc.nextInt();
                    System.out.println("Enter array length: ");
                    int len = sc.nextInt();
                    int sort_arr[] = new int[len];
                    System.out.println("Enter numbers: ");
                    for(int u=0;u<len;u++){
                        sort_arr[u] = sc.nextInt();
                    }
                    switch (ch){
                        case 1: // Bubble Sort
                            new bubblesort().sort(sort_arr);
                            break;
                        case 2: // Selection Sort
                            new select().sort2(sort_arr);
                            break;
                        case 3: // Insertion Sort
                            new insert().sort(sort_arr);
                            break;
                        case 4:
                            continue start_main;
                    }
                    break;

                
                case 4://Area
                	start: while(!exit){
                		
                		System.out.println("Enter the choice\n1.Area for Square \n2.Area of Rectangle\n3.Area of Circle\n4Area of Triangle\5Menu\6exit ");
                		Scanner sc3=new Scanner(System.in);
                		int  ch2 = sc3.nextInt();//Square
                		if(ch2==1)
                		{
                	       		System.out.println("The Area of Square will be calculated now");
                	       		System.out.println("Enter length");
                	       		Scanner sc1=new Scanner(System.in);
                	       		double ch1=sc1.nextDouble();
                	       	   double area=ch1*ch1;
                	       	System.out.println("The Area is"+area);
                	       	
                        
                         }
                		else if(ch2==2)//Rectangle
                		{
                			System.out.println("The Area of Rectangle will be calculated now");
                       		System.out.println("Enter length");
                       		Scanner sc1=new Scanner(System.in);
                       		System.out.println("Enter breadth");
                       		Scanner sc2=new Scanner(System.in);
                       		double l=sc1.nextDouble();
                       		double b=sc2.nextDouble();
                       	   double area=l*b;
                       	System.out.println("The Area is"+area);
                       	
                		}
                		else if(ch2==3)//Circle
                		{
                			System.out.println("The Area of Circle will be calculated now");
                			double pi=3.14;
                       		System.out.println("Enter radius");
                       		Scanner sc1=new Scanner(System.in);
                       		
                       		double r=sc1.nextInt();
                       	   double area=pi*r;
                       	System.out.println("The Area is"+area);
                       
                		}
                		else if(ch2==4)//triangle
                		{
                			System.out.println("The Area of Triangle will be calculated now");
                       		System.out.println("Enter base");
                       		Scanner sc1=new Scanner(System.in);
                       		double b1=sc1.nextInt();
                       		System.out.println("Enter height");
                       		Scanner sc2=new Scanner(System.in);
                       		double h1=sc2.nextInt();
                       	   double area= b1*h1*0.5;
                       	   
                       	System.out.println("The Area is"+area);
                       	
                		}
                		else if(ch2==5)
                		{
                			continue start;
                		}
                		else
                		{
                			 exit = true;
                		}
                	}
                		break;
                case 5://Converter
               		System.out.println("Enter the choice \n1.any2any\n2.BinarytoDecimal\n3.DecimaltoOctal");
               		Scanner daal=new Scanner(System.in);
               		int cg=daal.nextInt();
               		if(cg==1)//anytoany
               		{
               			System.out.println("Enter soucenumber");
               			int sn=daal.nextInt();
               			System.out.println("Enter soucebase");
               			int sb=daal.nextInt();
               			System.out.println("Enter destinationbase");
               			int db=daal.nextInt();
               			new anytoany().anyToAny(sn, sb, db);
               			
               		}
               		else if(cg==2)//binarytodecimal
               		{
               			System.out.println("Enter binarynumber");
               			int bn=daal.nextInt();
               			new BinarytoDecimal().binarytodecimal(bn);
               		}
               		else if(cg ==3)//decimaltobinary
               		{
               			System.out.println("Enter decimalnumber");
               			int dn=daal.nextInt();
               			new Decimaltooctal().DecimalToOctal(dn);
               		}
               		
               		break;
                 case 6://Miscellaneous
                	 System.out.println("Enter the choice \n1.Leap year\n2.NthUglyNumber");
                	 Scanner daal1=new Scanner(System.in);
                	 int cg1=daal1.nextInt();
                	 if(cg1==1)//Leap Year
                	 {
                		 System.out.println("enter the year");
                		 int y=daal1.nextInt();
                		new leapyear().check(y); 
                	 }
                	 else if(cg1==2)//Nth Ugly Number
                	 {
                		 System.out.println("enter the n value");
                		 int n=daal1.nextInt();
                		new NthUglyNumber().calculate(n);
                	 }
               		break;
                case 7: exit = true;
                    break;
                default: continue start_main;
            }
        }

    }
}