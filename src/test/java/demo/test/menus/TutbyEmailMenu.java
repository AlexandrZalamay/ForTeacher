/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.test.menus;

import webdriver.elements.Menu;

/**
 *
 * @author Alexandr
 */
public class TutbyEmailMenu extends Menu {
    
    public String exit = "Выход";
    public TutbyEmailMenu(){
        this.menuXpath = "//div[@class='b-user-dropdown-content']//div//a[text()='%1$s']";
    }
}
