package cw.tests.Day14;

import org.testng.annotations.Test;

public class C04_Enabled {


    @Test
    public void enableTest(){
        System.out.println("enable test çalışıyor");
    }

    @Test (enabled = false)    // enable false olursa test pasif hale gelir ve çalışmaz
    public void disableTest(){

        System.out.println("disable test çalışıyor");
    }

}
