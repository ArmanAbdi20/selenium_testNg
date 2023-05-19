package cw.tests.Day18;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(C01_Listener.class)
public class C02_Test {


    @Test
    public void successFulltest(){

        Assert.assertEquals(1,1);

    }

    @Test
    public void failedTest(){

        Assert.assertEquals(1,2);
    }
}
