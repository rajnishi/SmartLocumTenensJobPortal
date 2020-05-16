package TS;
import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.LicensePO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LicenseTC extends BaseTest {
    @Test

    public void verifyLicenseSLT() throws InterruptedException {
        //***********************Pre-condition : Login Require***********************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();

        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        LicensePO licensePOObj = new LicensePO(driver);

        //*****************Credentialing Info - License Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-004: Verify License");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3.Select ""License"" from menu
        //4.Select state license from drop down list
        Assert.assertTrue(licensePOObj.selectFromDropDownBtn(licensePOObj.LicStateIDDD_xpath, licensePOObj.LicStateDD_xpath), "Unable to click on dropdown list");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown list ", "User able to click on dropdown list");

        //5.Enter license number
        Assert.assertTrue(licensePOObj.enterTextInInputBtn(licensePOObj.LicenseNum_xpath, readFromPropFileObj.getLicense()), "Unable to enter license number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter license number", "User able to enter license number");

        //6.Select issue date
        Thread.sleep(2000);
        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.IssueDtOpenCal_xpath), "Unable to click on Issue Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Issue Date calender ", "User able to open the Issue Date calender");

        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.IssueMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.IssueYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year ", "User able to select year");

        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.IssueMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.IssueDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

       /* //7.Untick of ""no expiration date""
        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.NoEndDate_xpath), "Unable to click on 'No End Date'");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to uncheck 'No End Date' option ", "User able to click on to uncheck 'No End Date' option");*/

        //8.Select ""Expiration date""
        Thread.sleep(2000);
        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.NoExDtOpenCal_xpath), "Unable to click on Expiration Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Expiration Date calender ", "User able to open the Expiration Date calender");

        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.NoExDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year & month", "User able to select year & month");

        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.NoExDtyr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year ", "User able to select year");

        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.NoExDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.NoExDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //9.Select ""YES"" of ""Restriction or Disciplinary Action"" field
        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.RestriDiscipAct_xpath), "Unable to click on Restriction or Disciplinary Action");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on Restriction or Disciplinary Action ", "User able to click on Restriction or Disciplinary Action");

        //10.Enter description on ""Explanation"" field
        Assert.assertTrue(licensePOObj.enterTextInInputBtn(licensePOObj.Explan_xpath, readFromPropFileObj.getDesc()), "Unable to enter description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter description ", "User able to enter description");

        //11.Click ""Add"" button"
        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.AddBtn_xpath), "unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add button", "User able to click on add button");

        //12. User should be able to add license AND should display message of License inserted successfully
        String expectedMessage = "This license has been successfully inserted.";
        Assert.assertEquals(licensePOObj.findText(licensePOObj.ToastMessage_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of add license ", "User is able to add license successfully");
        System.out.println("Message : " + licensePOObj.findText(licensePOObj.ToastMessage_xpath));

        //13.Click on Save&Continue button
        Assert.assertTrue(licensePOObj.clickOnLinkBtn(licensePOObj.SaveContinueBtn_xpath), "Unable to save the record");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to save the record", "User able to save record successfully");

    }
}
