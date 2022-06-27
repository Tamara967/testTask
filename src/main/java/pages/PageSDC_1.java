package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PageSDC_1 {
    final WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements
    public PageSDC_1(WebDriver driver){

        this.driver=driver;
    }
    @FindBy(xpath="/html/body/button")
    WebElement crNode;

    public void Create_Node(){
        crNode.click();
    }

    public void Quit_Driver(){
        driver.quit();
    }
}
