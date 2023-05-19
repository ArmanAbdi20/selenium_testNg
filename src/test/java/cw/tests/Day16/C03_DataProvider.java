package cw.tests.Day16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.xml.crypto.Data;

public class C03_DataProvider {




// data provider sayesinde bir testi veri seti sayesinde tekrar test yapabilirz

    // veriyi kullanacak

    @Test (dataProvider = "data")
    public void test01(String email, String şifre, String hataMesajı ){

        System.out.println("----------------------------------------------------");
        System.out.println("siteye git");
        System.out.println("kullanıcı adına " + email + " yaz ");
        System.out.println("şifre alanına "+ şifre + " yaz ");
        System.out.println("singin butonuna tıkla ve hata mesajının "+ hataMesajı + " olduğunu doğrula");

    }


    // veriyi sağlayacak
    @DataProvider
    public Object[][] data(){

        // veriler oluşturulur
        // iki boyutlu array oluşturulur

        // en sık kullanımı Exel den veri okunup return etmek

        Object[][] data = new Object[6][3];
        data[0] = new Object []{"karl@clarusway.com", "Aa1.","6 karakterden kısa"};
        data[1] = new Object []{"karl@clarusway.com", "Aa1.asjkdkjahdkahdakhdadsdfsdfj","20 karakterden fazla"};
        data[2] = new Object []{"karl@clarusway.com", "ASDJAS.3","küçük harf yok"};
        data[3] = new Object []{"karl@clarusway","sadja.3","büyük harf yok"};
        data[4] = new Object []{"karl@clarusway","Ajdnıasn.","rakam yok"};
        data[5] = new Object []{"karl@clarusway","Ajdshsd35","özel karakter yok"};


        return data;
    }
}
