
package MyTests;

import demo.test.forms.MainForm;
import demo.test.forms.SearchJobForm;
import webdriver.BaseTest;


public class JobSearchTest extends BaseTest {

    
    public void runTest()  {
        browser.navigate("http://www.tut.by/");
        logger.stepInfo(1, "Click button job");
        MainForm mainForm = new MainForm();
        mainForm.goToJob();
        logger.stepInfo(2, "Search job");
        SearchJobForm searchJob = new SearchJobForm();
        searchJob.EnterSearch("Бухгалтер");
        logger.stepInfo(3, "Change data search");
        searchJob.ChangeExpierence();
    }
    
}
