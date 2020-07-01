package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DEAPO extends BasePage {
    public DEAPO(WebDriver driver) { super(driver);    }

    //////Locators for DEA page /////////
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By DEATab_xpath = By.xpath("//a[contains(text(), 'DEA')]");
    public By DEAAddNew_xpath = By.xpath("//span[text() = ' Add New ']");
    public By DEANum_xpath = By.xpath("//input[@name ='deaNumber']");

    public By IssueDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By IssueMonYrDt_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By IssueYr_xpath = By.xpath("//td[@aria-label= '2018']");
    public By IssueMonth_xpath = By.xpath("//div[contains(text(),' JAN ')]");
    public By IssueDay_xpath = By.xpath("//td[@aria-label = 'January 15, 2018']");

    public By NoEndDate_xpath = By.xpath("//mat-checkbox[@name = 'IsEndDate']");

    public By NoExDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[2]");
    public By NoExDtMonYrDt_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By NoExDtyr_xpath = By.xpath("//td[@aria-label='2021']");
    public By NoExDtMonth_xpath = By.xpath("//div[contains(text(),' DEC ')]");
    public By NoExDayDt_xpath = By.xpath("//td[@aria-label = 'December 31, 2021']");

    public By ResDiscipAct_xpath = By.xpath("(//span[@class = 'switch-label'])");
    public By Explan_xpath = By.xpath("//textarea[@name = 'explanation']");
    public By AddBtn_xpath = By.xpath("//button[@type= 'submit']");
    public By ToastMessage_xpath = By.xpath("//div[@aria-label='A new DEA entry has been successfully created.']");
    public By SaveContinueBtn_xpath = By.xpath("//span[contains(text(), 'Save & Continue')]");

}
