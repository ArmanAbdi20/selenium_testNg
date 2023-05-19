package cw.tests.Day18;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class C01_Listener implements ITestListener {


    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(result.getName() + " isimli  testimiz başladı");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getName()  + " isimli  testimiz başarıyla sonuçlandı");   }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println(result.getName()  + " isimli  testimiz başarısız oldu");
    }

    @Override
    public void onTestSkipped(ITestResult result) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("\t" + result.getTestName() + " isimli testimiz timeout ile fail oldu...");

    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test execution started");
        System.out.println("Baslangic saati:" + context.getStartDate().toString());

    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test execution finished");
        System.out.println("Bitis saati:" + context.getEndDate().toString());

    }
}
