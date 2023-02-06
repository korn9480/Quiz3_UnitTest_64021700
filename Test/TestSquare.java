package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.QuizOneJunit;
/**
 * TestQuizOnejunit
 */
public class TestSquare {
    QuizOneJunit obj = new QuizOneJunit();
    @Before
    public void before() {
        System.out.println("-----befor square-----");
    }
    @After
    public void after(){
        System.out.println("-----after square-----");
    }

    @Test
    public void test1(){
        assertEquals(obj.square(2),4);
    }
    @Test 
    public void test2(){
        assertNotEquals(obj.square(-1), -1);
    }
}