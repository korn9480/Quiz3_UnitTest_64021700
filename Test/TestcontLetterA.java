package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.QuizOneJunit;

public class TestcontLetterA {
    QuizOneJunit obj = new QuizOneJunit();
    @Before
    public void before() {
        System.out.println("-----befor countLetterA -----");
    }
    @After
    public void after(){
        System.out.println("-----after countLetterA -----");
    }
    //  FF 
    @Test
    public void test1(){
        assertNotEquals(obj.countLetterA("join"), 2);
    }
    // T F
    @Test 
    public void test2(){
        assertEquals(obj.countLetterA("A book"), 1);
    }
    // F T
    @Test
    public void test3(){
        assertEquals(obj.countLetterA("anna"), 2);
    }
    @Test 
    public void test4(){
        assertEquals(obj.countLetterA("Anna"), 2);
    }
}
