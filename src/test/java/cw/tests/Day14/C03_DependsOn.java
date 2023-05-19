package cw.tests.Day14;

import org.testng.annotations.Test;

public class C03_DependsOn {


    // DependsOn Methods attributes içerisine {} arasına test isimleri yazılarak birbirne bağlanır


    @Test
    public void test01(){
        System.out.println("test 01 çalışıyor");
    }
    @Test (
            dependsOnMethods = {"test01", "test03"}
    )
    public void test02(){
        System.out.println("test 02 çalışıyor");
    }
    @Test
    public void test03(){
        System.out.println("test 03 çalışıyor");
    }
    @Test
    public void test04(){
        System.out.println("test 04 çalışıyor");
    }
}
