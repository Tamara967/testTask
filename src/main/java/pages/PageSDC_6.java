package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class PageSDC_6 {
    final WebDriver driver;

    public PageSDC_6(WebDriver driver){

        this.driver=driver;
    }
    @FindBy(xpath="/html/body/button")
    WebElement crNode;

    @FindBy(xpath = "//*[@id=\"selection_info\"]")
    WebElement selectedInfo;

    @FindBy(xpath = "//*[@id=\"contextmenu\"]/li[1]")
    WebElement chooseContexMenu;



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
    public void Right_Click_In_Node(){
        Actions actions = new Actions(driver);
        WebElement elementLocator = driver.findElement(By.id("KeyLines-chart-1"));
        actions.moveToElement(elementLocator).contextClick(elementLocator).build().perform();
    }

    public void Choose_Context_Menu(){
        chooseContexMenu.click();
    }

    public void Create_Node(){
        crNode.click();
    }

    public void Quit_Driver(){
        driver.quit();
    }
}
