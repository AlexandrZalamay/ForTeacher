
package demo.test.forms;

import static java.lang.Thread.sleep;
import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.Label;
import webdriver.elements.TextBox;


public class GetLetterAndDeleteForm extends BaseForm {
    
    public Button btrIncoming = new Button(By.xpath("html/body/div[2]/div/div[5]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/a[2]"));
    public Label btrChek = new Label(By.xpath("//label[@class='b-messages-head__title']"));
    public Button btrDelete = new Button (By.xpath("//span[@class='b-toolbar__item__label js-toolbar-item-title-delete']"));
    
    public void SeeLetterAndDelete() {
      btrIncoming.click();
      
      btrChek.isPresent();
      btrChek.moveToElement();
      btrChek.click();
    
      btrDelete.moveToElement();
      btrDelete.click();
 
      
    }

    public GetLetterAndDeleteForm() {
        super(By.xpath("//a[@data-params='current_folder=2390000440033437397']"), "See get letter");
    }
    
}
