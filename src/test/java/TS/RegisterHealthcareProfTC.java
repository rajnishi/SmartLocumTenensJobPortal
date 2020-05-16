package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.RegisterHealthcareProfPO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterHealthcareProfTC extends BaseTest {

    @Test

    public void verifyRegistrationPageSLT() throws InterruptedException {

        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("RegiProfile.properties");
        RegisterHealthcareProfPO registerHealthcareProfPOObj = new RegisterHealthcareProfPO(driver);

        //**********************Registration Screen************************************//

        //1. Click "Sign in" button
        Assert.assertTrue(registerHealthcareProfPOObj.clickOnLinkBtn(registerHealthcareProfPOObj.SignIN_xpath),"Unable to click on SignIn link ");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on SignIn link ", "User should able to click on sign in link");

        //3. Click on "Click Here" button for healthcare office.
        Assert.assertTrue(registerHealthcareProfPOObj.clickOnLinkBtn(registerHealthcareProfPOObj.HireReg_xpath),"Unable to 'Click Here' button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on 'Click Here' button ", "User should able to Click on 'Click Here' button ");

        //4.Enter "Facility" name
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.FacilityName_xpath,readFromPropFileObj.getFacilityName()),"Unable to enter facilityName");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter facility name ", "User should able to enter on facility name ");

        //5.Enter "First name"
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.FName_xpath, readFromPropFileObj.getFirstName()),"Unable to enter First Name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter first name ", "User should able to enter first name ");

        //5A.Enter "last name"
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.LName_xpath, readFromPropFileObj.getLastName()),"Unable to get LastName");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter last name ", "User should able to enter on last name ");

        //6.Enter EmailID
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.Email_xpath, readFromPropFileObj.getEmail1()),"Unable to enter emailID");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter EmailID ", "User should able to enter EmailID");

        //7.Enter phone number
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.Phone_xpath, readFromPropFileObj.getphone()),"Unable to enter ph");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter phone number ", "User should able to enter phone number");

        //8.Enter department
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.Dept_xath, readFromPropFileObj.getDept()),"Unable to enter Dept");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter department ", "User should able to enter department");

        //9.Enter address
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.Address_xpath, readFromPropFileObj.getAddress()),"Unable to enter addrees");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User should able to enter address");

        //10.Enter city
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.City_xpath, readFromPropFileObj.getCity()),"Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter department ", "User should able to enter department");

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,3000)");

        //11.Select State
        Assert.assertTrue(registerHealthcareProfPOObj.selectFromDropDownBtn(registerHealthcareProfPOObj.State_xpath, registerHealthcareProfPOObj.State1_xpath),"Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select state ", "User should able to select state");

        //12.Enter zip code
        Assert.assertTrue(registerHealthcareProfPOObj.enterTextInInputBtn(registerHealthcareProfPOObj.Zip_xpath, readFromPropFileObj.getZip()),"Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip code ", "User should able to enter zip code");

        //13.Click "Registor Now" button
        Assert.assertTrue(registerHealthcareProfPOObj.clickOnLinkBtn(registerHealthcareProfPOObj.RegisterNow_xpath),"Unable to click on register now");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on 'Register Now'", "User should able to Click on 'Register Now' ");

        //14.User registered successfully and message should display - "check inbox to verify your account".
        String expectedMessage = "Check inbox to verify your account.";
        Assert.assertEquals(registerHealthcareProfPOObj.findText(registerHealthcareProfPOObj.VerifyAcct_xpath),expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "User should see toast message 'Check inbox to verify your account'", "User able to see the toast message");

    }
}