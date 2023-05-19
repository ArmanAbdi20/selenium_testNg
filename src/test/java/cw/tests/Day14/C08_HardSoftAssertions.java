package cw.tests.Day14;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C08_HardSoftAssertions {


    @Test
    public void hardAssertions(){
    // hard assertionslar Assert clası ile çağırılan assertions lardır

        System.out.println("check 1-1");
        Assert.assertEquals(1,1,"test passed");

        System.out.println("check 2-1");
        Assert.assertEquals(2,1,"test failed");

        System.out.println("check 3-1");
        Assert.assertEquals(3,1,"test failed");

    }

    @Test
    public void softAssertions(){

        //
        SoftAssert sa = new SoftAssert();

        System.out.println("check 1-1");
        sa.assertEquals(1,1);
        System.out.println("check 1-2");
        sa.assertEquals(1,2,"second assertion");
        System.out.println("check 2-3");
        sa.assertEquals(2,3);

        sa.assertAll("all assertion"); //assetAll kullanılmazsa bütüm assertion lar boşa gider


    }
}
