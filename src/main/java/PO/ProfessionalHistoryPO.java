package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfessionalHistoryPO extends BasePage {
    public ProfessionalHistoryPO(WebDriver driver) {
        super(driver);
    }

    //*****************Locators of Professional History tab************//
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By ProfHistTab_xpath = By.xpath("//a[contains(text(), 'Professional History')]");
    public By ProfHistSave_xpath = By.xpath("//button[text() = 'Save']");
}