package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
public class PageSDC_7 {
    WebDriver driver;
    public PageSDC_7(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/button")
    WebElement crNode;


    public void createsNewNodeWithLink() throws IOException, InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"KeyLines-chart-1\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).doubleClick().perform();
    }

    public void Create_Node() {
        crNode.click();
    }

    public void Quit_Driver() {
        driver.quit();
    }

    public void selectCanvasArea() {
        WebElement canvas = driver.findElement(By.id("KeyLines-chart-1"));
        Actions builder = new Actions(driver);
        Action dragAndDrop = builder
                .moveToElement(canvas, -190, -200)
                .pause(2000)
                .clickAndHold()
                .pause(2000)
                .moveToElement(canvas, -185, -185)
                .pause(2000)
                .release()
                .build();
        dragAndDrop.perform();
    }



}

