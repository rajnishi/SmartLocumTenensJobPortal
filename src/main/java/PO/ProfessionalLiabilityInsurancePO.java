package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfessionalLiabilityInsurancePO extends BasePage {
    public ProfessionalLiabilityInsurancePO(WebDriver driver) {
        super(driver);
    }
    //*****************Locators of Professional Liability Insurance tab************//
    public By DropDownPU_xpath = By.xpath("//span[@class = 'name']");
    public By CreInfo_xpath = By.xpath("//a[contains(text(), 'Credentialing Information')]");
    public By ProfLiaInsuTab_xpath = By.xpath("//a[contains(text(), 'Professional Liability Insurance')]");
    public By ProfLiaInsuAddNew_xpath = By.xpath("//span[text() = ' Add New ']");

    public By Carrier_xpath = By.xpath("//input[@name = 'carrier']");
    public By HAdd1_xpath = By.xpath("//input[@name ='address1']");
    public By HCity_xpath = By.xpath("//input[@name ='city']");
    public By HState_xpath = By.xpath("//mat-select[@name= 'stateId']");
    public By HState1_xpath = By.xpath("//span[contains((text()), 'New York')]");
    public By Zip_xpath = By.xpath("//input[@name= 'zipCode']");

    public By PolicayNum_xpath = By.xpath("//input[@name = 'policyNumber']");

    public By EffDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    //button[@aria-label= 'Choose month and year']
    //div[contains(text(),' 2018 ')]
    public By EffDtYr_xpath = By.xpath("//td[@aria-label = '2017']");
    public By EffDtMonth_xpath = By.xpath("//div[contains(text(),' MAR ')]");

    public By RetroDtOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[2]");
    public By DtRetroYr_xpath = By.xpath("//div[contains(text(),' 2021 ')]");
    public By DtRetroMonth_xpath = By.xpath("//div[contains(text(),' DEC ')]");

    public By PolicyLimit_xpath = By.xpath("//input[@name= 'policyLimit']");
    public By Aggregate_xpath = By.xpath("//input[@name= 'aggregate']");
    public By PolicyTy_xpath = By.xpath("//mat-select[@name= 'policyTypeId']");
    public By PolcyTyOpt_xpath = By.xpath("//span[contains((text()), 'Claims Made')]");
    public By AnySuits_xpath = By.xpath("//span[@class = 'switch-label'][1]");

    public By PlaintiffFN_xpath = By.xpath("//input[@name = 'plaintiffFirstName']");
    public By PlaintiffMidN_xpath = By.xpath("//input[@name = 'plaintiffMiddleName']");
    public By PlaintiffLN_xpath = By.xpath("//input[@name = 'plaintiffLastName']");

    public By CourtCase_xpath = By.xpath("//span[@class = 'switch-label'][2]");
    public By PatientOutcome_xpath = By.xpath("//textarea[@name = 'patientOutcome']");

    public By DtofInciOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By DtofInciYr_xpath = By.xpath("//td[@aria-label = '2017']");
    public By DtofInciMonth_xpath = By.xpath("//div[contains(text(),' MAR ')]");

    public By DtFiledOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By DtFiledYr_xpath = By.xpath("//td[@aria-label = '2017']");
    public By DtFiledMonth_xpath = By.xpath("//div[contains(text(),' MAR ')]");

    public By DtFilClosedOpenCal_xpath = By.xpath("(//button[@aria-label= 'Open calendar'])[1]");
    public By DtFilClosedYr_xpath = By.xpath("//td[@aria-label = '2017']");
    public By DtFilClosedMonth_xpath = By.xpath("//div[contains(text(),' MAR ')]");

    public By Resolu_xpath = By.xpath("//mat-select[@name= 'resolutionCaseId']");
    public By RsoluOpt_xpath = By.xpath("//span[contains((text()), 'Judgement')]");

    public By AmtPaid_xpath = By.xpath("//input[@name= 'amountPaid']");
    public By AddBtn_xpath = By.xpath("//span[text() = 'Add']");

    public By ToastMessageSpec_xpath = By.xpath("//div[@aria-label = 'A new liability insurance entry has been successfully created.']");
    public By SaveContinue_xpath = By.xpath("//span[contains((text()), 'Save & Continue')]");

}
