
package MyTests;

import demo.test.forms.FilmForm;
import demo.test.forms.MainForm;
import webdriver.BaseTest;


public class CommentTest extends BaseTest {

    
    public void runTest()  {
        browser.navigate("http://www.tut.by/");
        logger.stepInfo(1, "Go to film's page");
        MainForm mainForm = new MainForm();
        mainForm.goToAfisha();
        logger.stepInfo(2, "Use online film");
        FilmForm filmForm = new FilmForm();
        filmForm.GoOnlineFilm();
        filmForm.GoFilm();
        logger.stepInfo(3, "Rer for comment");
        filmForm.RerForComFilm();
        logger.stepInfo(4, "Short comment");
        filmForm.SentComment();
        
    }
    
}
