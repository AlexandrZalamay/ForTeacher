
package MyTests;

import demo.test.forms.EmailForm;
import demo.test.forms.GetLetterAndDeleteForm;
import demo.test.forms.MainForm;
import demo.test.forms.WriteLetterForm;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import webdriver.BaseTest;


public class SentTest extends BaseTest {

// @BeforeMethod
// public void enterMail(){
//     browser.navigate("http://www.tut.by/");
//        MainForm mainForm = new MainForm();
//        mainForm.login(null, null);        
//        mainForm.goToMail();  
//}
 
 public String theme,letter;
 
// 
// @Parameters({"theme","letter"})   
// public void paramMethod(String theme,String letter)
// {     
//     this.theme = theme;
//     this.letter = letter;
// }
 
 public void runTest()  {  
      browser.navigate("http://www.tut.by/");
        MainForm mainForm = new MainForm();
        mainForm.login(null, null);        
        mainForm.goToMail(); 
          
        logger.stepInfo(1, "Go write letter");
        EmailForm emailForm = new EmailForm();
        emailForm.clickWriteLetter(); 
        logger.stepInfo(2, "Write letter");
        WriteLetterForm writeLetter = new WriteLetterForm();       
        writeLetter.EnterDataLetter("theme", "letter");
        logger.stepInfo(3, "Take my email and sent letter myself");
        writeLetter.ClickSent();
        GetLetterAndDeleteForm GLADF = new GetLetterAndDeleteForm();
        logger.stepInfo(4, "See new letter and delete");
        GLADF.SeeLetterAndDelete();
        
        
        
    }

    

    
    
}
