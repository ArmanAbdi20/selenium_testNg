package cw.tests.Day16;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C01_Parametres {



    @Test
    @Parameters("isim")
    public void parameterizedTest(String isim){

        System.out.println("hello "+ isim);

    }

    // parametrelerin sırasına göre xml dosyasından parametreler okunur
    // parametreleri String dışında veri tipleri alabiliriz (eğer ki çevirebilirse)
    @Test
    @Parameters ({"isim","soyisim", "yas"})
    public void parameterizedTest02 (String name, String surName, int age){

        System.out.println("hello "+ name + " naber " + surName);
        System.out.println(age);



    }
}
