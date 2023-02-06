package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.QuizOneJunit;

public class TestCheckTwoLetter {
    QuizOneJunit obj = new QuizOneJunit();
    @Before
    public void before() {
        System.out.println("-----befor checkTwoLetter -----");
    }
    @After
    public void after(){
        System.out.println("-----after checkTwoLetter-----");
    }
    // เข้า if
    @Test
    public void test1(){
        assertFalse("Tinnakon", obj.checkTwoLetter("a"));
    }
    // เข้า else if
    @Test
    public void test2(){

        assertTrue("a", obj.checkTwoLetter("ab"));
    }
}
