package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\myProject\\target\\classes\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://104.248.248.105:8085/");

        TestSDC_1 RunTestCase_1 = PageFactory.initElements(driver, TestSDC_1.class);
        TestSDC_2 RunTestCase_2 = PageFactory.initElements(driver, TestSDC_2.class);
        TestSDC_3 RunTestCase_3 = PageFactory.initElements(driver, TestSDC_3.class);
        TestSDC_5 RunTestCase_5 = PageFactory.initElements(driver, TestSDC_5.class);
        TestSDC_6 RunTestCase_6 = PageFactory.initElements(driver, TestSDC_6.class);
        TestSDC_7 RunTestCase_7 = PageFactory.initElements(driver, TestSDC_7.class);

        try {
            //RunTestCase_1.PageSdc_1(driver);
            //Thread.sleep(1000);
           // RunTestCase_2.PageSdc_2(driver);
           // RunTestCase_3.PageSdc_3(driver);
           // RunTestCase_5.PageSdc_5(driver);
           // RunTestCase_6.PageSdc_6(driver);
            //Thread.sleep(2000);
          //  driver.switchTo().alert().accept();
            RunTestCase_7.PageSdc_7(driver);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}