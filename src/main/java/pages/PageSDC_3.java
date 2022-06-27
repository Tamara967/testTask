package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class PageSDC_3{
    final WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements
    public PageSDC_3(WebDriver driver){

        this.driver=driver;
    }
    @FindBy(xpath="/html/body/button")
    WebElement crNode;



    public void createsNewNodeWithLink() throws IOException, InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"KeyLines-chart-1\"]"));
        Actions action = new Actions(driver);
         String s = element.getAttribute("innerHTML");
         action.moveToElement(element).doubleClick().perform();



    }
    public void Create_Node(){
        crNode.click();
    }

    public void Quit_Driver(){
        driver.quit();
    }
}
