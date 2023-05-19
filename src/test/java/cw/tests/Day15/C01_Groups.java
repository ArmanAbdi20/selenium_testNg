package cw.tests.Day15;

import org.testng.annotations.Test;

public class C01_Groups {


    @Test (groups = {"smoke"})
    public void smokeTest(){
        System.out.println("smoke test started");

    }

    @Test (groups = {"regression"})
    public void regressionTest(){
        System.out.println("Regression test started");

    }
    @Test (groups = {"smoke","regression"})
    public void smokeRegressionTest(){
        System.out.println("Smoke and regression test started");

    }
}
