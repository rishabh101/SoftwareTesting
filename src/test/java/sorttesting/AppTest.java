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
   @Test
   @DisplayName(value = "Bubble sort")
    public void testApp1()
    {
    	int test1[] = new int[] {7,2,1,5,9};
        int test2[] = new int[] {1,2,5,7,9};
        assertArrayEquals(test2,a1.sort(test1));
        
    }
   @DisplayName(value = "Insertion sort")
   @Test
   public void testApp2()
   {
   	int test1[] = new int[] {5,9,3,1,2};
       int test2[] = new int[] {1,2,3,5,9};
       assertArrayEquals(test2,i1.sort(test1));
       
      
       test1 = new int[]{9,5,3,2,1};
       assertArrayEquals(test2,i1.sort(test1));
       test1 = new int[]{1,2,3,5,9};
       assertArrayEquals(test2,i1.sort(test1));
      
   }
   @Test
   @DisplayName(value = "Selection sort")
   public void testApp3()
   {
   	int test1[] = new int[] {5,9,3,1,2};
       int test2[] = new int[] {1,2,3,5,9};
       assertArrayEquals(test2,s1.sort2(test1));
       
      
       test1 = new int[]{9,5,3,2,1};
       assertArrayEquals(test2,s1.sort2(test1));
       test1 = new int[]{1,2,3,5,9};
       assertArrayEquals(test2,s1.sort2(test1));
       
   }
   @Test
   @DisplayName(value = "Binary Search")
   public void testApp4()
   {
   	int test1[] = new int[] {-2,0,5,7,9,11};
   	assertEquals(4,l2.search(test1,9));
       assertEquals(2,l2.search(test1,5));
       assertEquals(0,l2.search(test1,-2));
       assertEquals(-1,l2.search(test1,8));
   }
   @Test
   @DisplayName(value = "Linear Search")
   public void testApp5()
   {
   	int test1[] = new int[] {5,9,3,1,2};
   	assertEquals(4,l1.search(test1,2));
       assertEquals(1,l1.search(test1,9));
       assertEquals(-1,l1.search(test1,4));
       assertEquals(-1,l1.search(test1,8));
   }
   @Test
   @DisplayName(value = "gcd conversion")
   public void testApp6(){
       assertEquals(2,g1.calculate(2,4));
       assertEquals(3,g1.calculate(9,3));
       
   }
   @Test
   @DisplayName(value = "Prime Factorization")
   public void testApp7(){
   	
	    List<Integer>l1=new ArrayList();
	    	l1.add(23);
	    	assertEquals(l1,p1.calculate(529));
	    	l1.clear();
	    	l1.add(7);
	        assertEquals(l1,p1.calculate(343));
	        l1.clear();
	        l1.add(2);
	        l1.add(3);
	        l1.add(5);
	        assertEquals(l1,p1.calculate(120));
	        
	    	
	    }
   
   @Test
   @DisplayName(value = "Reverse")
   public void testApp8(){
   	
   	assertEquals(321,r1.reverse(123));
       assertEquals(521,r1.reverse(125));
       assertEquals(127,r1.reverse(721));
   }
   
   

@Test
@DisplayName(value = "Square")
public void testApp9(){
    assertEquals(4,s2.calculate(2));
    assertEquals(9,s2.calculate(3));
    
    assertEquals(0,s2.calculate(0));
    
}

@Test
@DisplayName(value = "anytoany")
public void testApp10()
{
	assertEquals(5,a2.anyToAny(101,2,10));
    assertNotEquals(6,a2.anyToAny(101,2,10));
}
@DisplayName(value = "binarytodecimal")
@Test
public void testApp11(){
    assertEquals(4,bd.binarytodecimal(100));
    assertNotEquals(4,bd.binarytodecimal(10));
    assertEquals(0,bd.binarytodecimal(0));
}
@Test
@DisplayName(value = "Leap year")
public void testApp12(){
	 assertEquals(true,lp.check(2000));
     assertEquals(false, lp.check(1998));
     assertTrue(lp.check(2008));
     assertFalse(lp.check(1700));
}
@Test
@DisplayName(value = "Nth Ugly Number")
public void testApp13(){
    assertEquals(8,n1.calculate(7));
    assertNotEquals(7,n1.calculate(7));
    assertEquals(9,n1.calculate(8));
    assertNotEquals(10,n1.calculate(8));
    assertEquals(20,n1.calculate(14));
    assertNotEquals(15,n1.calculate(14));
}
@Test
@DisplayName(value = "Magic Square")
public void testApp14(){
    int [][] arr1 = {{2,7,6},{9,5,1},{4,3,8}};
    assertTrue(Arrays.deepEquals(arr1, m1.magicsquare(3)));
    assertFalse(Arrays.deepEquals(arr1,m1.magicsquare(2)));
    assertNull(m1.magicsquare(0));
    assertNotNull(m1.magicsquare(5));
}

}