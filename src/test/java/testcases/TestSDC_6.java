package testcases;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import pages.PageSDC_6;

import java.io.IOException;

public class TestSDC_6 {
    public  void PageSdc_6(SearchContext driver) throws InterruptedException, IOException {
        PageSDC_6 caseSDC_6 = PageFactory.initElements(driver, PageSDC_6.class);
        caseSDC_6.Create_Node();
        caseSDC_6.Create_Node();
        Thread.sleep(2000);
        caseSDC_6.createsNewNodeWithLink();
        caseSDC_6.createsNewNodeWithLink();
        caseSDC_6.Right_Click_In_Node();
        Thread.sleep(2000);
        caseSDC_6.Choose_Context_Menu();
        Thread.sleep(2000);
        caseSDC_6.Quit_Driver();
    }

}
