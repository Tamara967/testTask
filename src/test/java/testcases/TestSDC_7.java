package testcases;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import pages.PageSDC_7;

import java.io.IOException;

public class TestSDC_7 {
    public  void PageSdc_7(SearchContext driver) throws InterruptedException, IOException {
        PageSDC_7 caseSDC_7 = PageFactory.initElements( driver,PageSDC_7.class);
        caseSDC_7.Create_Node();
        caseSDC_7.Create_Node();
        caseSDC_7.createsNewNodeWithLink();
        caseSDC_7.createsNewNodeWithLink();
        caseSDC_7.selectCanvasArea();
        Thread.sleep(1000);
        caseSDC_7.Quit_Driver();

    }
}
