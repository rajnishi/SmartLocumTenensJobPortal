package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.DEAPO;
import PO.StateControlledSubstancePO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DEATC extends BaseTest {
    @Test

    public void verifyDEASLT() throws InterruptedException {

        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();

        //***********************Pre-condition : At least one License Require****************//
    /*    LicenseTC licenseTCObj = new LicenseTC();
        licenseTCObj.verifyLicenseSLT();
*/
        //****************Reading data from Read From Prop File********************//
        ReadFromPropFile readFromPropFileSCSObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        DEAPO deapoObj = new DEAPO(driver);


        //*****************Credentialing Info - DEA Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-011: Verify DEA ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3.Select ""DEA"" from menu
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.DEATab_xpath), "Unable to click on DEA link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on DEA link ", "User able to click on DEA link");

        //3.Select ""Add new btn""
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.DEAAddNew_xpath), "Unable to click on add new btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add new btn ", "User able to click on add new btn");

        //5.Enter DEA number
        Assert.assertTrue(deapoObj.enterTextInInputBtn(deapoObj.DEANum_xpath, readFromPropFileSCSObj.getDEA()), "Unable to enter DEA number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter DEA number", "User able to enter DEA number");

        //6.Select issue date
        Thread.sleep(2000);
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.IssueDtOpenCal_xpath), "Unable to click on Issue Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Issue Date calender ", "User able to open the Issue Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.IssueMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.IssueYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year ", "User able to select year");

        Thread.sleep(2000);
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.IssueMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.IssueDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        /*//7.Untick of ""no expiration date""
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.NoEndDate_xpath), "Unable to click on 'No End Date'");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to uncheck 'No End Date' option ", "User able to click on to uncheck 'No End Date' option");*/

        //8.Select ""Expiration date""
        Thread.sleep(2000);
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.NoExDtOpenCal_xpath), "Unable to click on Expiration Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Expiration Date calender ", "User able to open the Expiration Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.NoExDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year & month", "User able to select year & month");

        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.NoExDtyr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year ", "User able to select year");

        Thread.sleep(2000);
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.NoExDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.NoExDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //9.Select ""YES"" of ""Restriction or Disciplinary Action"" field
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.ResDiscipAct_xpath), "Unable to click on Restriction or Disciplinary Action");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on Restriction or Disciplinary Action ", "User able to click on Restriction or Disciplinary Action");

        //10.Enter description on ""Explanation"" field
        Assert.assertTrue(deapoObj.enterTextInInputBtn(deapoObj.Explan_xpath, readFromPropFileSCSObj.getDesc()), "Unable to enter description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter description ", "User able to enter description");

        //11.Click ""Add"" button"
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.AddBtn_xpath), "unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add button", "User able to click on add button");

        //12. User should be able to add license AND should display message of License inserted successfully
        Thread.sleep(2300);
        String expectedMessage = "A new DEA entry has been successfully created.";
        Assert.assertEquals(deapoObj.findText(deapoObj.ToastMessage_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of DEA", "User is able to add DEA successfully");
        System.out.println("Message : " + deapoObj.findText(deapoObj.ToastMessage_xpath));

        //13.Click on Save&Continue button
        Thread.sleep(2000);
        Assert.assertTrue(deapoObj.clickOnLinkBtn(deapoObj.SaveContinueBtn_xpath), "Unable to save the record");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to save DEA record", "User able to save DEA record successfully");

    }
}