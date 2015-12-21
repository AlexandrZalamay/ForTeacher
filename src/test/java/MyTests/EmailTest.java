
package MyTests;

import demo.test.forms.*;
import webdriver.BaseTest;


public class EmailTest extends BaseTest {

    
    public void runTest()  {
        logger.stepInfo(1, "Click button sing in");
        MainForm mainForm = new MainForm();
        mainForm.login(null, null);
        logger.stepInfo(2, "Login form");
        mainForm.goToMail();
        logger.stepInfo(3, "Enter and load email page");
        EmailForm emailForm = new EmailForm();
        emailForm.ClickForWatchMenu();
        emailForm.menu.openItem(emailForm.menu.exit);
        logger.stepInfo(4, "See email menu and exit");
        mainForm.exitEmailTest();
    }
    
}
