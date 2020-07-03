package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkHistoryPO extends BasePage {
    public WorkHistoryPO(WebDriver driver) {
        super(driver);
    }
    //////Locators for Work History page/////////
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By WorkHisTab_xpath = By.xpath("//a[contains(text(), 'Work History')]");
    public By WorkHisAddNew_xpath = By.xpath("//span[text() = ' Add New ']");

    public By Employer_xpath = By.xpath("//input[@name = 'employer']");
    public By Position_xpath = By.xpath("//input[@name = 'position']");
    public By HAdd1_xpath = By.xpath("//input[@name ='address1']");
    public By HCity_xpath = By.xpath("//input[@name ='city']");
    public By HState_xpath = By.xpath("//mat-select[@name= 'stateId']");
    public By HState1_xpath = By.xpath("//span[contains((text()), 'New York')]");
    public By Zip_xpath = By.xpath("//input[@name= 'zipCode']");

    public By Phone_xpath = By.xpath("//input[@name= 'phoneNo']");
    public By Fax_xpath = By.xpath("//input[@name= 'faxNo']");

    public By StartDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By StartDtMonYr_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By StartDtYr_xpath = By.xpath("//td[@aria-label= '2018']");
    public By StartDtMonth_xpath = By.xpath("//div[contains(text(),' JAN ')]");
    public By StartDtDay_xpath = By.xpath("//td[@aria-label = 'January 10, 2018']");

    public By NoEndDate_xpath = By.xpath("//mat-checkbox[@name = 'IsEndDate']");

    public By EndDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[2]");
    public By EndDtMonYrDt_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By EndDtYr_xpath = By.xpath("//div[contains(text(),' 2021 ')]");
    public By EndDtMonth_xpath = By.xpath("//div[contains(text(),' MAY ')]");
    public By EndDtDayDt_xpath = By.xpath("//td[@aria-label = 'May 15, 2021']");

    public By AddBtn_xpath = By.xpath("//span[text() = ' Add ']");

    public By ToastMessageSpec_xpath = By.xpath("//div[@aria-label = 'A new work history has been successfully created.']");
    public By SaveContinueBtn_xpath = By.xpath("//span[text() = ' Save & Continue ']");

}
