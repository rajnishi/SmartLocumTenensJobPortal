package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StateControlledSubstancePO extends BasePage {
    public StateControlledSubstancePO(WebDriver driver) { super(driver);  }

    //////Locators for State Controlled Substance page/////////
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By SCSTab_xpath = By.xpath("//a[contains(text(), 'State Controlled Substance License(s)')]");
    public By SCSAddNew_xpath = By.xpath("//span[text() = ' Add New ']");

    public By SCSIDDD_xpath = By.xpath("//mat-select[@name = 'substanceId']");
    public By StateDD_xpath = By.xpath("//span[contains(text(),'New York')]");
    public By LicenseNum_xpath = By.xpath("//input[@name='licenceNumber']");

    public By IssueDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By IssueMonYrDt_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By IssueYr_xpath = By.xpath("//td[@aria-label= '2018']");
    public By IssueMonth_xpath = By.xpath("//div[contains(text(),' JAN ')]");
    public By IssueDay_xpath = By.xpath("//td[@aria-label = 'January 3, 2018']");

    public By NoEndDate_xpath = By.xpath("//mat-checkbox[@name = 'IsEndDate']");

    public By NoExDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[2]");
    public By NoExDtMonYrDt_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By NoExDtyr_xpath = By.xpath("//td[@aria-label='2021']");
    public By NoExDtMonth_xpath = By.xpath("//div[contains(text(),' DEC ')]");
    public By NoExDayDt_xpath = By.xpath("//td[@aria-label = 'December 15, 2021']");

    public By RestriDiscipAct_xpath = By.xpath("(//span[@class = 'switch-label'])");
    public By Explan_xpath = By.xpath("//textarea[@name = 'explanation']");
    public By AddBtn_xpath = By.xpath("//button[@type= 'submit']");
    public By ToastMessage_xpath = By.xpath("//div[@aria-label= 'A new state controlled substance license entry has been successfully created.']");
    public By SaveContinueBtn_xpath = By.xpath("//span[contains((text()), 'Save & Continue')]");

}
