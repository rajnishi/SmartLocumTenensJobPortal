package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CredentialDocsPO extends BasePage {
    public CredentialDocsPO(WebDriver driver){super (driver);}

    public By DropDown_xpath = By.xpath("//span[@class = 'name']");
    public By CredDoc_xpath = By.xpath("//a[contains(text(), 'Credential Docs')]");
    public By DEA_xpath = By.xpath("//mat-select[@name = 'credentialTypeId']");
    public By DEA1_xpath = By.xpath("//span[contains(text(),'DEA')]");
    public By UploadDoc_xpath = By.xpath("//input[@id = 'customFile']");

    public By IssueDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By IssuePrevMonth_xpath = By.xpath("//button[@aria-label= 'Previous month']");
    public By IssueDt_xpath = By.xpath("//td[@aria-label= 'April 9, 2020']");

    public By NoEndDate_xpath = By.xpath("//mat-checkbox[@name = 'IsEndDate']");

    public By NoExDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[2]");
    public By NoExDtNextMonth_xpath = By.xpath("//button[@aria-label= 'Next month']");
    public By NoExDt_xpath = By.xpath("//td[@aria-label= 'June 21, 2020']");

    public By Desc_xpath = By.xpath("//textarea[@name = 'description']");
    public By Save_xpath = By.xpath("//span[text()=' Save ']");
    public By ToastMessage_xpath = By.xpath("//div[@aria-label = 'Credential document inserted successfully.']"); //div[contains(text(), 'Credential document updated successfully.')]




    //button[@aria-label = 'Previous 20 years']

     //- no end date  - ("//mat-checkbox//div[contains(@class,'checkbox-inner-container')]") - working one








}
