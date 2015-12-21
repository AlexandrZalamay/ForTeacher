package webdriver.elements;

import org.openqa.selenium.By;
import webdriver.BaseEntity;

/**
 * Created by d.grigoryeva on 08.12.2015.
 */
public class Menu extends BaseEntity {

    protected String menuXpath = null;

    public Menu() {}

    public Menu(String menuXpath) {
        this.menuXpath = menuXpath;
    }

    public void openItem(String itemPath) {
        new Button(By.xpath(String.format(this.menuXpath, itemPath)), "").clickAndWait();
    }

    public void item(String itemPath) {
        new Button(By.xpath(String.format(this.menuXpath, itemPath)), "");
    }

    public void moveToItem(String itemPath) {
        Button item = new Button(By.xpath(String.format(this.menuXpath, itemPath)), "");
        item.moveToElement();
    }

    @Override
    protected String formatLogMsg(String message) {
        return null;
    }
}
