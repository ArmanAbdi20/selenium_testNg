package cw.tests.Day17;

import org.testng.annotations.Test;

public class C02_ParalelExecution {


    @Test
    public void test01(){

        long id = Thread.currentThread().getId();
        System.out.println("This test is running in thread " + id);

    }
    @Test
    public void test02(){
        long id = Thread.currentThread().getId();
        System.out.println("This test is running in thread " + id);

    }
    @Test
    public void test03(){
        long id = Thread.currentThread().getId();
        System.out.println("This test is running in thread " + id);

    }
    @Test
    public void test04(){
        long id = Thread.currentThread().getId();
        System.out.println("This test is running in thread " + id);

    }
    @Test
    public void test05(){
        long id = Thread.currentThread().getId();
        System.out.println("This test is running in thread " + id);

    }
    @Test
    public void test06(){
        long id = Thread.currentThread().getId();
        System.out.println("This test is running in thread " + id);

    }
    @Test
    public void test07(){
        long id = Thread.currentThread().getId();
        System.out.println("This test is running in thread " + id);

    }
    @Test
    public void test08(){
        long id = Thread.currentThread().getId();
        System.out.println("This test is running in thread " + id);

    }

}
