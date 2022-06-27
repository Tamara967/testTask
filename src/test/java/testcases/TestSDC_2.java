package testcases;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import pages.PageSDC_2;

public class TestSDC_2 {
    public  void PageSdc_2(SearchContext driver) throws InterruptedException {
        PageSDC_2 caseSDC_2 = PageFactory.initElements(driver, PageSDC_2.class);
        caseSDC_2.Create_Node();
        caseSDC_2.Create_Node();
        caseSDC_2.checkCreatedNodeName();
        Thread.sleep(1000);
        caseSDC_2.Quit_Driver();
    }
}
