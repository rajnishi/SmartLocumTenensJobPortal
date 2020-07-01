package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Medicare_Medicaid_NPI_PO extends BasePage {
    public Medicare_Medicaid_NPI_PO(WebDriver driver){
        super (driver);
        }
//*****************Locators of Medicare/Medicaid/NPI tab************//
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By NPITab_xpath = By.xpath("//a[text() ='Medicare/Medicaid/NPI']");
    public By NPIAddNew_xpath = By.xpath("//span[text() = ' Add New ']");

    public By TypeDrpDown_xpath = By.xpath("//mat-select[@name = 'npiTypeId']");
    public By SelectTypeDrpDown_xpath = By.xpath("//span[text() = ' National Provider Identification Number (NPI) ']");
    public By NipNum_xpath = By.xpath("//input[@name='npiNumber']");
    public By AddBtn_xpath = By.xpath("//button[@type='submit']");
    public By ToastMessageNPI_xpath = By.xpath("//div[@aria-label='A new medicare/medicaid/npi has been successfully created.']");
    public By SaveContinue_xpath = By.xpath("//span[contains((text()), 'Save & Continue')]");

}
