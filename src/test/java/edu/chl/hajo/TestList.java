package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {
    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
    }
    @Test
    public void testRemove() {
        List l = new List();
        l.add(2);
        l.add(3);
        assertTrue(l.getLength() == 2);
        l.remove();
        assertTrue(l.getLength() == 2);
        //assertTrue(l.getLength() == 3);
    }

    @Test
    public void testGet() {
        List l = new List(); //new list
        l.add(1);         //add int to said list.
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        assertTrue(l.get(2) == 4);

    }
    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        List l = new List();
        l.get(-1); // Exception!!!
    }

    @Test
    public void testCopy() {
    List l = new List();
    l.add(2);
    l.add(3);
    List k = l.copy();
    assertTrue(k.getLength() == 2);
    l.add(5);
    k = l.copy();
    assertTrue(k.getLength() == 3);
    assertTrue(k.get(2) == l.get(2));
    }

    @BeforeClass
    public static void beforeClass(){  //First of all
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){  // Last of all
        System.out.println("After class");
    }

    @Before
    public void before(){  //Before each test method
        System.out.println("Before");
    }

    @After
    public void after(){  //After each test method
        System.out.println("After");
    }
}
