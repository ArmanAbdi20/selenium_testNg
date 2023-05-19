package cw.tests.Day14;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C07_Assertions {


    @Test
    public void testassertEquals() {

        Assert.assertEquals(1,1,"sayılar eşit değil");
    }

    @Test
    public void assertNotNull(){
        Assert.assertNotNull(2,"null is not null");
    }
}
