
package demo.test.forms;

import junit.framework.Assert;
import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;


public class FilmForm extends BaseForm {

    Button btnGoOnlineFilm = new Button(By.xpath("//a[@href='http://afisha.tut.by/online-cinema/']"));
    Button btnFilm = new Button(By.xpath("//li[@class='lists__li center']"));
    Button btnRegForComFilm = new Button(By.id("do-enter"));
    public TextBox txtLogin = new TextBox(By.name("login"));
    public TextBox txtPassword = new TextBox(By.name("password"));
    Button btnSubmit = new Button(By.xpath("//input[@class='button']"));
    Button btnStar = new Button(By.xpath("html/body/div[4]/div/div/div[2]/div[7]/div[1]/div[3]/div/div/div/form/div/div/div/div/span"));
    public TextBox txtArea = new TextBox(By.name("comment"));
    Button btnSentComment = new Button(By.xpath("//input[@value='Оставить отзыв']"));
    Button btnSentError = new Button(By.xpath("//div[@class='b-error comment-notify']"));
       
    
        
    public void GoOnlineFilm(){
        btnGoOnlineFilm.clickAndWait();
    }
    
    public void GoFilm(){
        btnFilm.moveToElement();
        btnFilm.clickAndWait();
    }
    
    public void RerForComFilm(){
        btnRegForComFilm.moveToElement();
        btnRegForComFilm.click();
        txtLogin.type("AlexandrZalamay");
        txtPassword.type("12312345");
        btnSubmit.click();   
        
    }
    
    public void SentComment(){
        btnStar.isPresent();
        btnStar.moveToElement();
        btnStar.click();
        txtArea.moveToElement();
        txtArea.click();
        txtArea.type("Nice film, very very interesting! I recomendet!");
        btnSentComment.moveToElement();
        btnSentComment.click();
        Assert.assertTrue(btnSentError.isPresent());
    }
    
    
    
    
    
    public FilmForm() {
        super(By.xpath("//div[@class='logo']"), "Film's page");
    }
    
}
