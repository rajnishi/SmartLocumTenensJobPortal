package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.CredentialDocsPO;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CredentialDocsTC extends BaseTest {

    public CredentialDocsTC() {    }
    public CredentialDocsTC(WebDriver passDriver) { driver = passDriver; }

    @Test
    public void verifyCredentialDocsSLT() throws InterruptedException {
        //**********************Pre-condition : Login Require************************//
        LoginTC loginpage = new LoginTC(driver);
        loginpage.VerifyLoginSLT();

        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        CredentialDocsPO credentialDocsPOObj = new CredentialDocsPO(driver);

        //**************CredentialDocs Page********************//
        ExtentTestManager.getTest().getTest().setName("SMT-003: Verify Credential Docs");

        //1. Click dropdown arrow on profile user
        Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.DropDown_xpath), "Unable to click on dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Sign In button ", "User able to click on sign in button");

        //2. Click ""Credential Doc"" link
        Assert.assertTrue(credentialDocsPOObj.clickOnBtn(credentialDocsPOObj.CredDoc_xpath), "Unable to click on Credential Docs ");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Docs link ", "User able to click on Credential Docs link");

        //3.Select ""Credential Type"" from drop down list
        Assert.assertTrue(credentialDocsPOObj.selectFromDropDownBtn(credentialDocsPOObj.DEA_xpath, credentialDocsPOObj.DEA1_xpath), "Unable to select credential type ");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select credential type from dropdown ", "User able to select credential type from dropdown");

        //4.Click Browse for file upload
        Assert.assertTrue(credentialDocsPOObj.imageUpLoadPDF(credentialDocsPOObj.UploadDoc_xpath), "Unable to select upload file ");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click to upload file ", "User able to click to upload file");

        //5.Select Issue date
        Thread.sleep(2000);
        Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.IssueDtOpenCal_xpath), "Unable to click on Issue Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Issue Date calender ", "User able to open the Issue Date calender");
        Thread.sleep(1000);
        Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.IssuePrevMonth_xpath), "Unable to click on previous month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to previous month ", "User able to previous month");
        Thread.sleep(1000);
        Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.IssueDt_xpath), "Unable to select date");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select date ", "User able to select date");

        //6.Untick ""Expiration date"
        /*Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.NoEndDate_xpath), "Unable to click on 'No End Date'");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to uncheck 'No End Date' option ", "User able to click on to uncheck 'No End Date' option");*/

        //7.Select Expiration date
        Thread.sleep(2000);
        Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.NoExDtOpenCal_xpath), "Unable to click on Expiration Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Expiration Date calender ", "User able to open the Expiration Date calender");
        Thread.sleep(1000);
        Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.NoExDtNextMonth_xpath), "Unable to select next month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select next month", "User able to select next month");
        Thread.sleep(1000);
        Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.NoExDt_xpath), "Unable to select date");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select date ", "User able to select date");

        //8.Enter Description
        Assert.assertTrue(credentialDocsPOObj.enterTextInInputBtn(credentialDocsPOObj.Desc_xpath, readFromPropFileObj.getDesc()), "Unable to enter description");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter description ", "User able to enter description");

        //9.Click Save button
        Assert.assertTrue(credentialDocsPOObj.clickOnLinkBtn(credentialDocsPOObj.Save_xpath), "Unable to save the record");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to save the record", "User able to save record successfully");

        //10.  User should be able to add credential document and will display on the list
        String expectedMessage = "Credential document inserted successfully.";
        Assert.assertEquals(credentialDocsPOObj.findText(credentialDocsPOObj.ToastMessage_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of add credential doc ", "User is getting the successful message as credential doc added on the list");
        System.out.println("Message : "+ credentialDocsPOObj.findText(credentialDocsPOObj.ToastMessage_xpath));

    }
}
