package cw.tests.Day14;

import org.testng.annotations.Test;

public class C05_TimeOut {


    // time out bir metodun maximum çalışma süresini set eder. süre aşımında execption fırlatarak kodu kırar.
    @Test
    public void passedTest(){
        System.out.println("test passed");

    }

    @Test (timeOut = 1000)
    public void timeoutTest() throws InterruptedException {
        System.out.println("test time out");
         Thread.sleep(1500);
        System.out.println("test timeout ....");
    }
}
