
package demo.test.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;


public class SearchJobForm extends BaseForm {
    
    public TextBox txtSearchJob = new TextBox(By.xpath("//input[@class='bloko-input                               HH-Navi-SearchSelector-Tab-TextInput                               HH-Navi-StickyMenu-MainSearch']"));
    public Button btnSearch = new Button(By.xpath("//button[@class='bloko-button                            bloko-button_primary                            bloko-button_stretched']"));
    public Button btnExpierence = new Button(By.xpath("//div[@data-toggle='experience']"));
    public Button btnChangeExp = new Button(By.xpath("//a[@href='?area=1002&enable_snippets=true&text=%D0%91%D1%83%D1%85%D0%B3%D0%B0%D0%BB%D1%82%D0%B5%D1%80&clusters=true&search_field=name&currency_code=BYR&experience=between1And3&from=cluster_experience']"));
    
    
    public void EnterSearch(String textSearch){
        txtSearchJob.sendKeys(textSearch);
        btnSearch.clickAndWait();
    }
    
    public void ChangeExpierence(){
        btnExpierence.isPresent();
        btnExpierence.moveToElement();
        btnExpierence.click();
        btnChangeExp.moveToElement();
        btnChangeExp.clickAndWait();
    }
    
    public SearchJobForm() {
        super(By.xpath("//span[@class='navi-logo navi-logo_jobs-tut-by']"),"Job page");
    }
    
}
