package com.zipcodewilmington.looplabs;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class patricksSuperGoodNewCustomTest {
    private StringDuplicateDeleter deleter;

    @Before
    public void setup() {
        String[] arr = new String[] {"aba", "aba", "bba", "bbb"};
        this.deleter = new StringDuplicateDeleter(arr);
    }

    @Test
    public void oneChecker(){
        Boolean actual = this.deleter.removeAllZeroOneChecker(1);
        Assert.assertTrue(actual);
    }

    @Test
    public void zeroChecker(){
        Boolean actual = deleter.removeAllZeroOneChecker(0);
        Assert.assertTrue(actual);
    }

//    @Test
//    public void dupeChecker(){
//        int actual = deleter.getDupeCounterOuter(3, "aba aba bba");
//    }

    @Test
    public void dupeCounterCheckerSame(){
        int actual = deleter.getDupeCounter(0, "aba", "aba");
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dupeCounterCheckerDifferent(){
        int actual = deleter.getDupeCounter(0, "aba", "abb");
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

}
