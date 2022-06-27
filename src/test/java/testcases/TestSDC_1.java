package testcases;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import pages.PageSDC_1;

public class TestSDC_1 {
        public static void PageSdc_1(SearchContext driver) throws InterruptedException {
            PageSDC_1 caseSDC_1 = PageFactory.initElements(driver, PageSDC_1.class);
            caseSDC_1.Create_Node();
            Thread.sleep(1000);
            caseSDC_1.Quit_Driver();
        }
}
