package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialtyPO extends BasePage {

    public SpecialtyPO(WebDriver driver) {
        super(driver);
    }
    //*****************Locators of Medicare/Medicaid/NPI tab************//
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By SpecialtyTab_xpath = By.xpath("//a[contains(text(), 'Specialty')]");
    public By SpecialtyAddNew_xpath = By.xpath("//span[text() = ' Add New ']");


    public By Specialty_xpath = By.xpath("//mat-select[@name = 'specialityId']");
    public By SpecialtyTxt_xpath = By.xpath("//span[contains(text(), ' Family Medicine ')]");

    public By SubSpec_xpath = By.xpath("//mat-select[@name = 'subSpecialityId']");
    public By SubSpecTxt_xpath = By.xpath("//span[contains(text(), ' Pain Medicine ')]");

    public By BCBE_xpath = By.xpath("//mat-select[@name = 'bcbeid']");
    public By BCBEText_xpath = By.xpath("//span[contains(text(), ' Board Eligible ')]");

    public By CertifyBoard_xpath = By.xpath("//mat-select[@name = 'certifyingBoardId']");
    public By CertifyBoardTxt_xpath = By.xpath("//span[contains(text(), ' American Board of Family Medicine ')]");

    public By DtCerti_xpath = By.xpath("//mat-select[@name = 'certifyingBoardId']");
    public By DtCertiTxt_xpath = By.xpath("//span[contains(text(), ' American Board of Family Medicine ')]");

  /*  public By DtCertiDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By DtCertiYr_xpath = By.xpath("//td[@aria-label = '2017']");   //div[contains(text(),' 2016 ')]
    public By DtCertiMonth_xpath = By.xpath("//div[contains(text(),' MAR ')]");*/

    public By DtCertiDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By DtCertiMonYr_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By DtCertiYr_xpath = By.xpath("//td[@aria-label= '2018']");
    public By DtCertiMonth_xpath = By.xpath("//div[contains(text(),' JAN ')]");
    public By DtCertiDay_xpath = By.xpath("//td[@aria-label = 'January 3, 2018']");

    public By NoEndDate_xpath = By.xpath("//mat-checkbox[@name = 'IsEndDate']");

    public By DtRecertiDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[2]");
    public By DtRecertiMonYrDt_xpath = By.xpath("//button[@aria-label= 'Choose month and year']");
    public By DtRecertiYr_xpath = By.xpath("//div[contains(text(),' 2021 ')]");
    public By DtRecertiMonth_xpath = By.xpath("//div[contains(text(),' MAY ')]");
    public By DtRecertiDayDt_xpath = By.xpath("//td[@aria-label = 'May 15, 2021']");

    public By AddBtn_xpath = By.xpath("//button[@type='submit']");
    public By ToastMessageSpec_xpath = By.xpath("//div[@aria-label='A new specialty has been successfully created.']");
    public By SaveContinue_xpath = By.xpath("//span[contains((text()), 'Save & Continue')]");


}
