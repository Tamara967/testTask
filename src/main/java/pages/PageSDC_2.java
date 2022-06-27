package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PageSDC_2 {
    final WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements
    public PageSDC_2(WebDriver driver){

        this.driver=driver;
    }
    @FindBy(xpath="/html/body/button")
    WebElement crNode;

    public void checkCreatedNodeName() {

        WebElement canvas = driver.findElements(By.tagName("canvas")).get(0);

        String out = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("src\\test\\resources\\images\\" + out + ".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void Create_Node(){
        crNode.click();
    }

    public void Quit_Driver(){
        driver.quit();
    }
}
