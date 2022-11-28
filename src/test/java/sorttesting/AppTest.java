package sorttesting;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
//import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import sorting.*;
import searching.*;
import Maths.*;
import conversion.*;
import Misc.*;

/**
 * Unit test for simple App.
 */



public class AppTest 
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	bubblesort a1=new bubblesort();
    insert i1=new insert();
    select s1=new select();
    binarysearch l2=new binarysearch();
    linearsearch l1=new linearsearch();
    gcd g1=new gcd();
    PrimeFactorization p1=new PrimeFactorization();
    Reverse r1=new Reverse();
   
    Square s2=new Square();
    anytoany a2=new anytoany();
    BinarytoDecimal bd=new BinarytoDecimal();
    leapyear lp=new leapyear();
    NthUglyNumber n1=new NthUglyNumber();
    MagicSquare m1=new MagicSquare();
    /**
     * @return the suite of tests being tested
     */
    
   
    @BeforeEach
    public void setUp(){
    	
    }

    @AfterEach
    public void tearDown(){
    }
    /**
     * Rigourous Test :-)
     */
  
   @DisplayName(value = "Insertion sort")
   @Test
   public void testApp1()
   {
   	int test1[] = new int[] {5,9,3,1,2};
       int test2[] = new int[] {1,2,3,5,9};
       assertArrayEquals(test2,i1.sort(test1));
       
      
       
       test1 = new int[]{1,2,3,5,9};
       assertArrayEquals(test2,i1.sort(test1));
      
   }
   @Test
   @DisplayName(value = "Selection sort")
   public void testApp2()
   {
   	int test1[] = new int[] {5,9,3,1,2};
       int test2[] = new int[] {1,2,3,5,9};
       assertArrayEquals(test2,s1.sort2(test1));
       
      
       test1 = new int[]{9,5,3,2,1};
       assertArrayEquals(test2,s1.sort2(test1));
       test1 = new int[]{1,2,3,5,9};
       assertArrayEquals(test2,s1.sort2(test1));
       
   }
   //binary search
   @Test
   @DisplayName("search()=>follows path[1,2,8]")
   public void testApp3()
   {
   /*	int test1[] = new int[] {};
   	assertEquals(-1,l2.search(test1,9));
   	test1=new int[] {3,7,11};
       assertEquals(1,l2.search(test1,7));
       test1=new int[] {3,4,5,6,7};
       assertEquals(0,l2.search(test1,3));
       
       assertEquals(4,l2.search(test1,7));
   */
	   int test1[]=new int[] {};
	   assertEquals(-1,l2.search(test1, 9));
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,4,8]")
   public void testApp4()
   {
	  
   
	   int test1[]=new int[] {3,7,11};
	   assertEquals(1,l2.search(test1, 7));
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,5,7,2,8]")
   public void testApp5())
   {
   	int test1[] = new int[] {3,4};
   	assertEquals(-1,l2.search(test1,2));
   	
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,5,6,2,8]")
   public void testApp6())
   {
   	int test1[] = new int[] {9,10};
   	assertEquals(-1,l2.search(test1,11));
   	
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,5,7,2,3,5,6,2,8]")
   public void testApp7()
   {
	   int test1[] = new int[] {1,2,3,4,5,6,7};
	   	assertEquals(2,l2.search(test1,3));
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,5,6,2,3,5,7,2,8]")
   public void testApp8()
   {
	   int test1[] = new int[] {1,2,3,4,5,6,7};
	   	assertEquals(4,l2.search(test1,5));
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,5,7,2,3,5,7,2,8]")
   public void testApp9()
   {
	   int test1[] = new int[] {1,2,3,4,5,6,7};
	   	assertEquals(0,l2.search(test1,1));
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,5,6,2,3,5,6,2,8]")
   public void testApp10()
   {
	   int test1[] = new int[] {1,2,3,4,5,6,7};
	   	assertEquals(6,l2.search(test1,7));
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,5,6,2,3,4,8]")
   public void testApp11()
   {
	   int test1[] = new int[] {1,2,3,4,5,6,7};
	   	assertEquals(5,l2.search(test1,6));
   }
   @Test
   @DisplayName("search()=>follows path[1,2,3,5,7,2,3,4,8]")
   public void testApp12()
   {
   
   int test1[] = new int[] {1,2,3,4,5,6,7};
  	assertEquals(1,l2.search(test1,2));
   }
   @Test
   @DisplayName(value = "Linear Search")
   public void testApp13()
   {
   	int test1[] = new int[] {5,9,3,1,2};
   	assertEquals(4,l1.search(test1,2));
       assertEquals(1,l1.search(test1,9));
       assertEquals(-1,l1.search(test1,4));
       assertEquals(-1,l1.search(test1,8));
   }
   @Test
   @DisplayName(value = "g1 follows path[1,2]")
   public void testApp14(){
       assertEquals(-1,g1.calculate(-4,7));
       
       
   }
   @Test
   @DisplayName(value = "g1 follows path[1,3,4,5,10]")
   public void testApp15(){
       assertEquals(8,g1.calculate(0,8));
     
       
   }
   @Test
   @DisplayName(value = "g1 follows path[1,3,4,6,10]")
   public void testApp16(){
       assertEquals(6,g1.calculate(6,0));
       
       
   }
   @Test
   @DisplayName(value = "g1 foloows path[1,3,7,9,7,8,10]")
   public void testApp17(){
       assertEquals(1,g1.calculate(3,4));
       
       
   }
   @Test
   @DisplayName(value = "g1 =>follows path[1,3,7,8,10")
   public void testApp18(){
       assertEquals(4,g1.calculate(4,4));
       
       
   }
   @Test
   @DisplayName(value = "g1=> follows path[1,3,7,9,7,9,7,8,10]")
   public void testApp19(){
       assertEquals(3,g1.calculate(21,15));
      
       
   }
   
   
   @Test
   @DisplayName(value="reverse=> follows path[1,2,1,3]")
   public void testApp20(){
   	
   	assertEquals(5,r1.reverse(5));
      ;
   }
   
   @Test
   @DisplayName(value = "reverse =>follows path[1,2,1,2,1,3]")
   public void testApp21(){
   	
   	assertEquals(32,r1.reverse(23));
       
   }

@Test
@DisplayName(value = "Square")
public void testApp22(){
    assertEquals(4,s2.calculate(2));
    assertEquals(9,s2.calculate(3));
    
    assertEquals(0,s2.calculate(0));
    
}
@DisplayName(value = "Insertion sort")
@Test
public void testApp23()
{
	
    int test2[] = new int[] {1,2,3,5,9};
   
    
   
   int  test1[] = new int[]{9,5,3,2,1};
    assertArrayEquals(test2,i1.sort(test1));
    
   
}
@Test
@DisplayName(value = "anytoany follows path[1,3,1,2,5,2,4]")
public void testApp24()
{
	assertEquals(2,a2.anyToAny(10,2,4));
    
}
@DisplayName(value = "binarytodecimal")
@Test
public void testApp25(){
    assertEquals(4,bd.binarytodecimal(100));
    assertNotEquals(4,bd.binarytodecimal(10));
    assertEquals(0,bd.binarytodecimal(0));
}
// leap year
@Test
@DisplayName(value = "lp follows path [1,2,3,6,8,9,11]")
public void testApp26(){
	 assertEquals(true,lp.check(1600));
    
}
@Test
@DisplayName(value = "lp follows path[1,2,3,7,8,9,11]")
public void testApp27(){
	 assertEquals(false,lp.check(1700));
    
}
@Test
@DisplayName(value = "lp follows path[1,2,4,8,10,11]")
public void testApp28(){
	 assertEquals(true,lp.check(2004));
    
}
@Test
@DisplayName(value = "lp follows path[1,5,8,10,11")
public void testApp29(){
	 assertEquals(false,lp.check(2001));
    
}
//NUglynumber
@Test
@DisplayName(value = "N1 follows path[1,3]")
public void testApp30(){
    assertEquals(1,n1.calculate(1));
    
}
@Test
@DisplayName(value = "N1 follows path[1,2,4,5,7,1,3]")
public void testApp31(){
    assertEquals(2,n1.calculate(2));
  
}
@Test
@DisplayName(value = "N1 follows path[1,2,4,5,7,1,2,5,6,7,1,3]")
public void testApp32(){
    assertEquals(3,n1.calculate(3));
}

    
@Test
@DisplayName(value = "Magic Square")
public void testApp33(){
    int [][] arr1 = {{2,7,6},{9,5,1},{4,3,8}};
    assertTrue(Arrays.deepEquals(arr1, m1.magicsquare(3)));
    assertFalse(Arrays.deepEquals(arr1,m1.magicsquare(2)));
    assertNull(m1.magicsquare(0));
    assertNotNull(m1.magicsquare(5));
}
@Test
//Bubblesort
@DisplayName(value = "sort()=>follows path[1,2,9]")
 public void testApp34()
 {
 	int test1[] = new int[] {};
     int test2[] = new int[] {};
     assertArrayEquals(test2,a1.sort(test1));
     
 }
@Test
@DisplayName(value = "sort()=>follows path[1,2,3,4,5,4,7,8,9]")
 public void testApp35()
 {
 	int test1[] = new int[] {1,2};
     int test2[] = new int[] {1,2};
     assertArrayEquals(test2,a1.sort(test1));
     
 }
@Test
@DisplayName(value = "sort()=>follows path[1,2,3,4,5,6,4,5,4,5,4,7,2,3,4,5,4,7,8,9]")
 public void testApp36()
 {
 	int test1[] = new int[] {2,1,3};
     int test2[] = new int[] {1,2,3};
     assertArrayEquals(test2,a1.sort(test1));
     
 }
//prime factorization
@Test
@DisplayName(value = "p1 follows path[1,2,3,4,1,5,7,12,13,12,14]")
public void testApp37(){
	
	    List<Integer>l1=new ArrayList();
	    	l1.add(2);
	    	assertEquals(l1,p1.calculate(2));
	    	
	        l1.clear();
	    	
	    }

@Test
@DisplayName(value = "p1 follows[1,2,3,4,1,5,6,5,7,9,12,13,12,14]")
public void testApp38(){
	
	    List<Integer>l1=new ArrayList();
	    	l1.add(2);
	    	l1.add(11);
	    	assertEquals(l1,p1.calculate(22));
	    	
	        l1.clear();
	    	
	    }
@Test
@DisplayName(value = "p1 follows path [1,5,6,8,10,11,6,5,7,12,13,12,14]")
public void testApp39(){
	
	    List<Integer>l1=new ArrayList();
	    	l1.add(3);
	    	assertEquals(l1,p1.calculate(9));
	    	l1.clear();
	        
	    	
	    }
@Test
@DisplayName(value = "p1 follows path[1,5,6,8,10,11,6,5,7,12,14")
public void testApp40(){
	
	    List<Integer>l1=new ArrayList();
	    	l1.add(3);
	    
	    	assertEquals(l1,p1.calculate(75));
	    
	    	
	    }

}