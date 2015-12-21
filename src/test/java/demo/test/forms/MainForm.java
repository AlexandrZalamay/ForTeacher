
package demo.test.forms;

import junit.framework.Assert;
import static org.apache.poi.hssf.usermodel.HSSFShapeTypes.TextBox;
import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;


public class MainForm extends BaseForm {

    public Button btnEnter = new Button(By.className("enter"), "Enter button on main page");
    public Button btnSubmit = new Button(By.xpath("//input[contains(@class,\"auth__enter\")]"));
    public TextBox txtLogin = new TextBox(By.name("login"));
    public TextBox txtPassword = new TextBox(By.name("password"));
    public TextBox txtMyName = new TextBox(By.xpath("//span[@class = 'uname']"));
    public Button btnMail = new Button(By.xpath("//a[@href='http://mail.tut.by/#ua:top_menu_www.tut.by~1']"));
    public Button btnJob = new Button(By.xpath("//a[@href='http://jobs.tut.by/#ua:top_menu_www.tut.by~7']"));
    public Button btnAfisha = new Button(By.xpath("//a[@href='http://afisha.tut.by/#ua:top_menu_www.tut.by~5']"));
    
    public void login(String login, String password){
        btnEnter.click();
        txtLogin.type("AlexandrZalamay");
        txtPassword.type("12312345");
        btnSubmit.clickAndWait();
        Assert.assertEquals(txtMyName.getText(), "Alexandr Zalamay");
    }
    
    public void exitEmailTest(){
        Assert.assertTrue(btnEnter.isPresent());
    }
    
    
    public void goToMail (){
        btnMail.clickAndWait();
    } 
    
    public void goToJob (){
        btnJob.clickAndWait();
    }
    
    public void goToAfisha(){
        btnAfisha.clickAndWait();
    }
            
    public MainForm() {
        super(By.xpath("//a[@class='header-logo']"), "main page");
    }
    
}
