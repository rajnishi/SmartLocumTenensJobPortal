package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.LicensePO;
import PO.StateControlledSubstancePO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StateControlledSubstanceTC extends BaseTest {
    @Test

    public void verifyStateControlledSubstanceSLT() throws InterruptedException {
        //*********************Pre-condition : Login Require*********************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();

        //*********************Pre-condition : At least one License Require*************//
    /*    LicenseTC licenseTCObj = new LicenseTC();
        licenseTCObj.verifyLicenseSLT();
*/
        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileSCSObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        StateControlledSubstancePO SCSPOObj = new StateControlledSubstancePO(driver);

        //*****************Credentialing Info - State Controlled Substance Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-010: Verify State Controlled Substance ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3.Select ""State Controlled Substance"" from menu
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.SCSTab_xpath), "Unable to click on State Controlled Substance link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on State Controlled Substance link ", "User able to click on State Controlled Substance link");

        //3.Select "Add New"
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.SCSAddNew_xpath), "Unable to click on add new btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add new btn ", "User able to click on add new btn");

        //4.Select ""State Controlled Substance"" from drop down list
        Assert.assertTrue(SCSPOObj.selectFromDropDownBtn(SCSPOObj.SCSIDDD_xpath, SCSPOObj.StateDD_xpath), "Unable to click on dropdown list");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown list ", "User able to click on dropdown list");

        //5.Enter license number
        Assert.assertTrue(SCSPOObj.enterTextInInputBtn(SCSPOObj.LicenseNum_xpath, readFromPropFileSCSObj.getLicense()), "Unable to enter license number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter license number", "User able to enter license number");

        //6.Select issue date
        Thread.sleep(2000);
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.IssueDtOpenCal_xpath), "Unable to click on Issue Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Issue Date calender ", "User able to open the Issue Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.IssueMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.IssueYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year ", "User able to select year");

        Thread.sleep(2000);
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.IssueMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.IssueDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");


        /*//7.Untick of ""no expiration date""
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.NoEndDate_xpath), "Unable to click on 'No End Date'");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to uncheck 'No End Date' option ", "User able to click on to uncheck 'No End Date' option");*/

        //8.Select ""Expiration date""
        Thread.sleep(2000);
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.NoExDtOpenCal_xpath), "Unable to click on Expiration Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Expiration Date calender ", "User able to open the Expiration Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.NoExDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year & month", "User able to select year & month");

        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.NoExDtyr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year ", "User able to select year");

        Thread.sleep(2000);
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.NoExDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.NoExDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");


        //9.Select ""YES"" of ""Restriction or Disciplinary Action"" field
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.RestriDiscipAct_xpath), "Unable to click on Restriction or Disciplinary Action");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on Restriction or Disciplinary Action ", "User able to click on Restriction or Disciplinary Action");

        //10.Enter description on ""Explanation"" field
        Assert.assertTrue(SCSPOObj.enterTextInInputBtn(SCSPOObj.Explan_xpath, readFromPropFileSCSObj.getDesc()), "Unable to enter description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter description ", "User able to enter description");

        //11.Click ""Add"" button"
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.AddBtn_xpath), "unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add button", "User able to click on add button");

        //12. User should be able to add license AND should display message of License inserted successfully
        String expectedMessage = "A new state controlled substance license entry has been successfully created.";
        Assert.assertEquals(SCSPOObj.findText(SCSPOObj.ToastMessage_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of state license", "User is able to add state license successfully");
        System.out.println("Message : " + SCSPOObj.findText(SCSPOObj.ToastMessage_xpath));

        //13.Click on Save&Continue button
        Assert.assertTrue(SCSPOObj.clickOnLinkBtn(SCSPOObj.SaveContinueBtn_xpath), "Unable to save the record");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to save the record", "User able to save record successfully");

    }
}


