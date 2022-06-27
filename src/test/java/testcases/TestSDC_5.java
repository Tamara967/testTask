package testcases;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import pages.PageSDC_5;

import java.io.IOException;

public class TestSDC_5 {
    public  void PageSdc_5(SearchContext driver) throws InterruptedException, IOException {

        PageSDC_5 caseSDC_5 = PageFactory.initElements(driver, PageSDC_5.class);
        caseSDC_5.Create_Node();
        caseSDC_5.Create_Node();
        caseSDC_5.Create_Node();
        caseSDC_5.createsNewNodeWithLink();
        caseSDC_5.createsNewNodeWithLink();
        Thread.sleep(1000);
        caseSDC_5.createsNewNodeWithLink();
        caseSDC_5.checkSelectedType();
        Thread.sleep(1000);
        caseSDC_5.takeScreenshot();
        Thread.sleep(1000);
        caseSDC_5.Quit_Driver();
    }

}
