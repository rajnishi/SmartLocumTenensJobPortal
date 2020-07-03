package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HospitalMembershipPO extends BasePage {
    public HospitalMembershipPO(WebDriver driver) {
        super(driver);
    }
    //*****************Locators of Hospital Membership tab************//
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By HospMbrTab_xpath = By.xpath("//a[contains(text(), 'Hospital Membership')]");
    public By HospAddNew_xpath = By.xpath("//span[text() = ' Add New ']");

    public By HospName_xpath = By.xpath("//input[@name = 'hospitalName']");
    public By HAdd1_xpath = By.xpath("//input[@name ='address1']");
    public By HCity_xpath = By.xpath("//input[@name ='city']");
    public By HState_xpath = By.xpath("//mat-select[@name= 'stateId']");
    public By HState1_xpath = By.xpath("//span[contains((text()), 'New York')]");
    public By Zip_xpath = By.xpath("//input[@name= 'zipCode']");

    public By MbrStatus_xpath = By.xpath("//mat-select[@name= 'membershipTypeId']");
    public By MbrStatusOpt_xpath = By.xpath("//span[contains((text()), ' Active ')]");

    public By StartDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By StartDtMonYr_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By StartDtYr_xpath = By.xpath("//td[@aria-label= '2018']");
    public By StartDtMonth_xpath = By.xpath("//div[contains(text(),' JAN ')]");
    public By StartDtDay_xpath = By.xpath("//td[@aria-label = 'January 3, 2018']");

    public By NoEndDate_xpath = By.xpath("//mat-checkbox[@name = 'IsEndDate']");

    public By EndDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[2]");
    public By EndDtMonYrDt_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By EndDtYr_xpath = By.xpath("//div[contains(text(),' 2021 ')]");
    public By EndDtMonth_xpath = By.xpath("//div[contains(text(),' MAY ')]");
    public By EndDtDayDt_xpath = By.xpath("//td[@aria-label = 'May 15, 2021']");

    public By DeptName_xpath = By.xpath("//input[@name = 'department']");
    public By Phone_xpath = By.xpath("//input[@name= 'departmentPhone']");
    public By Fax_xpath = By.xpath("//input[@name= 'departmentFax']");
    public By OffPhone_xpath = By.xpath("//input[@name= 'officePhone']");


    public By AnyDisAct_xpath = By.xpath("//span[@class = 'switch-label'])");
    public By Explan_xpath = By.xpath("//textarea[@name= 'explanation']");

    public By AddBtn_xpath = By.xpath("//span[text() = ' Add ']");

    public By ToastMessageSpec_xpath = By.xpath("//div[@aria-label = 'A new hospital membership entry has been successfully created.']");
    public By SaveContinue_xpath = By.xpath("//span[text() = ' Save & Continue ']");
}


