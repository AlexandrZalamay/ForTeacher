
package demo.test.forms;

import static java.lang.Thread.sleep;
import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;

public class WriteLetterForm extends BaseForm {
    
    TextBox txtInputTheme = new TextBox(By.xpath("//input[@class='b-input__text js-kbd-subj']"));
    TextBox txtInputLetter = new TextBox(By.id("compose-send_ifr"));
    Button btrSent = new Button(By.xpath("//button[@class='nb-button _nb-small-action-button _init js-send-button ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"));
    Button btrTo = new Button(By.xpath("//span[contains(text(),\"Кому\")]"));
    Button btrChangeMe = new Button(By.xpath("//input[@class='abook-entry-checkbox-controller']"));
    Button btrEnter = new Button(By.xpath("//span[contains(text(),\"Готово\")]"));    
    
    public void EnterDataLetter(String theme, String letter) {
        TakeEmail();         

        txtInputTheme.type(theme);
        txtInputLetter.type(letter);
    }
    
    public void TakeEmail (){
        btrTo.click();
        btrChangeMe.click();
        btrEnter.moveToElement();
        btrEnter.click();
    }
    
    public void ClickSent(){
        this.btrSent.clickAndWait();
    }
    
    public WriteLetterForm() {
        super(By.xpath("//button[@class='nb-button _nb-small-action-button _init js-send-button ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only']"), "Write letter");
    }
    
}
