package PO;

import BasePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterHealthcareProfPO extends BasePage {
    public RegisterHealthcareProfPO(WebDriver driver) {
        super(driver);
    }

    //////////////////////Locators for RegistrationPage/////////////////


    public By SignIN_xpath = By.xpath("//a[@class = 'mat-flat-button mat-button-base mat-primary']");
    public By HireReg_xpath = By.xpath("(//a[text() = 'Click Here'])[2]");
    public By FacilityName_xpath = By.xpath("//input[@name = 'facilityName']");
    public By FName_xpath = By.xpath("//input[@name = 'firstName']");
    public By LName_xpath = By.xpath("//input[@name = 'lastName']");
    public By Email_xpath = By.xpath("//input[@name = 'email']");
    public By Phone_xpath = By.xpath("//input[@name = 'phone']");
    public By Dept_xath = By.xpath("//input[@name = 'department']");
    public By Address_xpath = By.xpath("//input[@name = 'address1']");
    public By City_xpath = By.xpath("//input[@name = 'city']");
    public By State_xpath = By.xpath("//mat-select[@name= 'stateId']");  //div[@class = 'mat-form-field-infix ng-tns-c46-13']");
    public By State1_xpath = By.xpath("//span[contains((text()), 'Connecticut')]");
    public By Zip_xpath = By.xpath("//input[@name = 'zipCode']");
    //mat-checkbox[@name = 'isAcceptPrivacyPolicy']
    public By RegisterNow_xpath = By.xpath("//span[text()= ' Register Now ']");
    public By VerifyAcct_xpath = By.xpath("//div[contains(text(), 'Check inbox to verify your account.')]");


    //drew@yopmail.com
    //Drew=2020


}
