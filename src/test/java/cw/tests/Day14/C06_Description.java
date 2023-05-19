package cw.tests.Day14;

import org.testng.annotations.Test;

public class C06_Description {

        // test metodlarının ne yaptığını açıklamak için kullanılan attributes dur.
    @Test (description = "this is a description")
    public void test(){
        System.out.println("test çalışıyor");
    }
}
