package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfessionalReferencesPO extends BasePage {
    public ProfessionalReferencesPO(WebDriver driver) { super(driver); }

    //*****************Locators of Professional References tab************//
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By ProfRefTab_xpath = By.xpath("//a[contains(text(), 'Professional References')]");
    public By ProfRefAddNew_xpath = By.xpath("//span[text() = ' Add New ']");

    public By ProfRefTitle_xpath = By.xpath("//mat-select[@name= 'title']");
    public By ProfRefTitleOpt_xpath = By.xpath("//span[contains((text()), 'Miss')]");
    public By ProfRefirstName_xpath = By.xpath("//input[@name = 'firstName']");
    public By ProfReLastName_xpath = By.xpath("//input[@name ='lastName']");
    public By ProfRefDegree_xpath = By.xpath("//mat-select[@name= 'degreeId']");
    public By ProfRefDegreeOpt_xpath = By.xpath("//span[contains((text()), ' DO ')]");
    public By ProfRefSpec_xpath = By.xpath("//input[@name= 'specialityName']");
    public By ProfRefRelationship_xpath = By.xpath("//input[@name= 'relationship']");

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

    public By ProfRefPhone_xpath= By.xpath("//input[@name ='phoneNo']");
    public By ProfRefFax_xpath= By.xpath("//input[@name ='faxNo']");
    public By ProfRefAddress_xpath = By.xpath("//input[@name ='address1']");
    public By ProfRefEmail_xpath = By.xpath("//input[@name ='emailAddress']");
    public By ProfRefCity_xpath = By.xpath("//input[@name ='city']");
    public By ProfRefState_xpath = By.xpath("//mat-select[@name = 'stateId']");
    public By ProfRefState1_xpath = By.xpath("//span[contains((text()), ' Delaware ')]");
    public By ProfRefZip_xpath = By.xpath("//input[@name= 'zipCode']");

    public By AddBtn_xpath = By.xpath("//span[text() = ' Add ']");
    public By ToastMessageSpec_xpath = By.xpath("//div[@aria-label = 'A new professional reference has been successfully created.']");
    public By SaveContinue_xpath = By.xpath("//span[contains((text()), ' Save & Continue ')]");













}
