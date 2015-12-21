
package demo.test.forms;

import org.openqa.selenium.By;
import org.testng.Assert;
import webdriver.BaseForm;
import webdriver.elements.Button;
import webdriver.elements.TextBox;


public class SearchJobForm extends BaseForm {
    
    public TextBox txtSearchJob = new TextBox(By.xpath("//input[@class='bloko-input                               HH-Navi-SearchSelector-Tab-TextInput                               HH-Navi-StickyMenu-MainSearch']"));
    public Button btnSearch = new Button(By.xpath("//button[@class='bloko-button                            bloko-button_primary                            bloko-button_stretched']"));
    public Button btnExpierence = new Button(By.xpath("//div[@data-toggle='experience']"));
    public Button btnChangeExp = new Button(By.xpath("//a[@href='?area=1002&enable_snippets=true&text=%D0%91%D1%83%D1%85%D0%B3%D0%B0%D0%BB%D1%82%D0%B5%D1%80&clusters=true&search_field=name&currency_code=BYR&experience=between1And3&from=cluster_experience']"));
    public Button btnTime = new Button(By.xpath("//div[@data-toggle='employment']"));
    public Button btnChangeTime = new Button(By.xpath("html/body/div[4]/div[1]/div/div[4]/div/table/tbody/tr/td[1]/div/div[2]/div/div/div/div[8]/div[2]/ul/li[2]/a/span[1]"));
    public Button btnWork = new Button(By.xpath("html/body/div[4]/div[1]/div/div[4]/div/table/tbody/tr/td[2]/div/table/tbody/tr/td[1]/div[1]/div[1]/div/div[2]/div[6]/div/div/a"));
    public Button btnRegistrationForWork = new Button(By.xpath("//input[@class='bloko-button bloko-button_primary bloko-button_stretched']"));
    
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
    
    public void ChangeTime(){
        btnTime.isPresent();
        btnTime.moveToElement();
        btnTime.click();
        btnChangeTime.moveToElement();
        btnChangeTime.clickAndWait();
    }
    
    public void FindWork(){
        btnWork.isPresent();
                btnWork.moveToElement();
                btnWork.clickAndWait();
    }
    
    public void SeeRegForm(){
        Assert.assertTrue(btnRegistrationForWork.isPresent());
    }
    
    public SearchJobForm() {
        super(By.xpath("//span[@class='navi-logo navi-logo_jobs-tut-by']"),"Job page");
    }
    
}
