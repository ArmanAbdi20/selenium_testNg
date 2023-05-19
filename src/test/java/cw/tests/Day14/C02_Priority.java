package cw.tests.Day14;

import org.testng.annotations.Test;

public class C02_Priority {


    //bir priority belirlenmezse testler alfabetik sırayla çalışır
    // priority en düşük olan en önemlidir
    // priority olmayanın değeri 0 dır
    // priority negatif değer de verilebilir.
    // aynı priority değeri alan testlerde alfabetik sıraya göre çalışır

    @Test (priority = 3)
    public void testA(){
        System.out.println("test a çalışıyor");

    }
    @Test (priority = 2)
    public void testB(){
        System.out.println("test b çalışıyor");
    }
    @Test(priority = -5)
    public void testC(){
        System.out.println("test c çalışıyor");
    }

}
