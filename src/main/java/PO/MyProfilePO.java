package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfilePO extends BasePage {
    public MyProfilePO(WebDriver driver) {
        super(driver);
    }

    /////////////////////////Edit Profile//////////

    public By DropDown_xpath = By.xpath("//span[@class = 'name']");
    public By MyProfile_xpath = By.xpath("//a[text() = 'My Profile']");
    public By EditProfile_xpath = By.xpath("//span[text()=' Edit Profile ']");

    public By UploadCV_xpath = By.xpath("//input[@id = 'userCVFile']");
    public By ProfilePho_xpath = By.xpath("//input[@id = 'customFile']");
    //  public By LastName_xpath= By.xpath("//input[@name ='lastname']");
    // public By Phone_xpath= By.xpath("//input[@name ='phone']");
    public By HAdd_xpath = By.xpath("//input[@name ='address1']");
    public By HCity_xpath = By.xpath("//input[@name ='city']");
    public By HState_xpath = By.xpath("//mat-select[@name= 'stateId']");
    public By HState1_xpath = By.xpath("//span[contains((text()), 'Nevada')]");    //span[contains((text()), 'Maine')]
    public By Zip_xpath = By.xpath("//input[@name= 'zipCode']");
    public By Citizenship_xpath = By.xpath("(//span[@class = 'switch-label'])[1]");

    public By Specialty_xpath = By.xpath("//mat-select[@name='specialityid']");
    public By SpecDropDwn_xpath = By.xpath("//span[text()=' Internal Medicine - Hepatology ']");

    public By SubSp_xpath = By.xpath("//mat-select[@name='subspecialityid']");
    public By SubSpDropDwn_xpath = By.xpath("//span[contains((text()),  'None')]");

    public By BoardElig_xpath = By.xpath("(//span[@class = 'switch-label'])[3]");
    public By AddSkills_xpath = By.xpath("//a[contains((text()),  'Add Skills')]");
    public By SkillsChkList_xpath = By.xpath("//div[@id='divSkillsCheckboxlist']");
    public By SkillsChkList1_xpath = By.xpath("//span[text()= 'Burns, superficial and partial thickness']");
    public By SkillsChkList2_xpath = By.xpath("//span[text() = 'EKG interpretation']");
    public By SkillsChkList3Add_xpath = By.xpath("//span[text()= ' Add ']");
    public By SkillsPlusSign_xpath = By.xpath("//span[contains(text(), ' Add specialty/subspecialty ')]");

    public By SelectDegree_xpath = By.xpath("//mat-select[@name ='degreeIds']");
    //div[@class='mat-select-panel-wrap ng-tns-c100-34 ng-trigger ng-trigger-transformPanelWrap ng-star-inserted']
    public By SelectDegree1_xpath = By.xpath("//Span[contains(text(),' ARNP ')]");
    public By SelectDegree2_xpath = By.xpath("//span[text() = ' RN ']");
    public By SelectDegree3_xpath = By.xpath("//span[text() = ' MD ']");

    public By StateLicense_xpath = By.xpath("//mat-select[@name ='stateLicenceIds']");
    //div[@class = 'ng-tns-c100-36 ng-trigger ng-trigger-transformPanel mat-select-panel mat-primary']
    public By State1_xpath = By.xpath("//span[text() = ' District of Columbia ']");
    public By State2_xpath = By.xpath("//span[text() = ' Michigan ']");
    public By State3_xpath = By.xpath("//span[text() = ' Nevada ']]");
    public By DEA_xpath = By.xpath("(//span[@class = 'switch-label'])[4]");

    public By ScheduleAva_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By ScheduleAvaFromDt_xpath = By.xpath("//button[@aria-label= 'Next month']");
    public By ScheduleAvaFromDt2_xpath = By.xpath("//td[@aria-label= 'June 7, 2020']");

    public By ScheduleNoEndDt_xpath = By.xpath("//mat-checkbox//div[contains(@class,'checkbox-inner-container')]"); //mat-checkbox[@id = 'mat-checkbox-2']//div//input[@type = 'checkbox']

    public By ScheduleAvaToDt_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[2]");
    public By ScheduleAvaToDt1_xpath = By.xpath("//button[@aria-label= 'Next month']");
    public By ScheduleAvaToDt2_xpath = By.xpath("//td[@aria-label= 'June 21, 2020']");

    public By ScheduleAvaPlusSign_xpath = By.xpath("//span[contains(text(), ' Add Availability ')]");
    public By Save_xpath = By.xpath("//span[text() = ' Save ']");


}
