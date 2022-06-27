package testcases;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import pages.PageSDC_3;

import java.io.IOException;

public class TestSDC_3 {
    public  void PageSdc_3(SearchContext driver) throws InterruptedException, IOException {
        PageSDC_3 caseSDC_3 = PageFactory.initElements(driver, PageSDC_3.class);
        caseSDC_3.Create_Node();
        caseSDC_3.Create_Node();
        caseSDC_3.createsNewNodeWithLink();
        caseSDC_3.createsNewNodeWithLink();
        Thread.sleep(1000);
        caseSDC_3.Quit_Driver();
    }

}
