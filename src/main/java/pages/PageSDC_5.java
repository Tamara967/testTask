package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PageSDC_5 {
    final WebDriver driver;

    //Constructor, as every page needs a Webdriver to find elements
    public PageSDC_5(WebDriver driver){

        this.driver=driver;
    }
    @FindBy(xpath="/html/body/button")
    WebElement crNode;

    @FindBy(xpath = "//*[@id=\"selection_info\"]")
    WebElement selectedInfo;


    public void createsNewNodeWithLink() throws IOException, InterruptedException {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"KeyLines-chart-1\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(element).doubleClick().perform();
    }

    public void checkSelectedType(){
      String outputSelectedInfo = selectedInfo.getAttribute("innerHTML");
      if(outputSelectedInfo.equals("Selected: <br> Nodes:  Node4<br> Links: ")) {
          System.out.println("Node and link shown in the selected section");
      }
      else{
          System.out.println("Nod and link wasn't shown in the selected section");

      }
    }
    public void takeScreenshot(){
        String out = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot , new File("src\\test\\resources\\images\\"+ out + ".png"));
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
