
package demo.test.forms;

import demo.test.menus.TutbyEmailMenu;
import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;


public class EmailForm extends BaseForm {

    public TutbyEmailMenu menu = new TutbyEmailMenu();
    public Button btnForMenu = new Button(By.xpath("//span[@class = 'header-user-name js-header-user-name']"));
    public Button btnWriteLetter = new Button(By.xpath("//a[@title='Написать (w, c)']"));
    
    public void ClickForWatchMenu(){
        btnForMenu.click();
    }
    
    public void clickWriteLetter(){    
        btnWriteLetter.clickAndWait();        
    }
    
    public EmailForm() {
        super(By.xpath("//a[@title='Написать (w, c)']"),"Email Page");
    }
    
}
