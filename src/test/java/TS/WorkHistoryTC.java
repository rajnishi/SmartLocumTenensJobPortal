package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.HospitalMembershipPO;
import PO.WorkHistoryPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkHistoryTC extends BaseTest {
    @Test
    public void verifyWorkHistorySLT() throws InterruptedException {
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();
        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        WorkHistoryPO workHistoryPOObj = new WorkHistoryPO(driver);

        //*****************Credentialing Info - Work History Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-0013: Verify Work History Page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Work History tab
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.WorkHisTab_xpath), "Unable to click on Work History tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Work History tab ", "User able to click on Work History tab");

        //3. Click on Add new btn
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.WorkHisAddNew_xpath), "Unable to click on add new btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add new btn ", "User able to click on add new btn");

        //4. Enter employer
        Assert.assertTrue(workHistoryPOObj.enterTextInInputBtn(workHistoryPOObj.Employer_xpath, readFromPropFileObj.getEmployer()), "Unable to enter hospital name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter employer name ", "User able to enter employer name");

        //5. Enter position
        Assert.assertTrue(workHistoryPOObj.enterTextInInputBtn(workHistoryPOObj.Position_xpath, readFromPropFileObj.getPosition()), "Unable to enter hospital name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter position name ", "User able to enter position name");

        //6.Enter address
        Assert.assertTrue(workHistoryPOObj.enterTextInInputBtn(workHistoryPOObj.HAdd1_xpath, readFromPropFileObj.getInstiAddress()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(workHistoryPOObj.enterTextInInputBtn(workHistoryPOObj.HCity_xpath, readFromPropFileObj.getInstiCity()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //7.Select state from drop down
        Assert.assertTrue(workHistoryPOObj.selectFromDropDownBtn(workHistoryPOObj.HState_xpath, workHistoryPOObj.HState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        //8.Enter zip
        Assert.assertTrue(workHistoryPOObj.enterTextInInputBtn(workHistoryPOObj.Zip_xpath, readFromPropFileObj.getInstiZip()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

        //9. Enter phone number
        Assert.assertTrue(workHistoryPOObj.enterTextInInputBtn(workHistoryPOObj.Phone_xpath, readFromPropFileObj.getphone()), "Unable to enter department phone number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter phone number ", "User able to enter phone number");

        //10. Enter department fax number
        Assert.assertTrue(workHistoryPOObj.enterTextInInputBtn(workHistoryPOObj.Fax_xpath, readFromPropFileObj.getFax()), "Unable to enter department fax number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter fax number ", "User able to enter fax number");

        //11.Select start date
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.StartDtOpenCal_xpath), "Unable to click on Start Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Start Date calender ", "User able to open the Start Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.StartDtMonYr_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.StartDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year ", "User able to select year");

        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.StartDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.StartDtDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //12.Select End Date
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.EndDtOpenCal_xpath), "Unable to click on End Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the End Date calender ", "User able to open the End Date calender");

        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.EndDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.EndDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year", "User able to select year");

        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.EndDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.EndDtDayDt_xpath), "Unable to select day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //13.Click ""Add"" button"
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.AddBtn_xpath), "unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add button", "User able to click on add button");

        //14. User should be able to add work history AND should display message of work history inserted successfully
        String expectedMessage = "A new work history has been successfully created.";
        Assert.assertEquals(workHistoryPOObj.findText(workHistoryPOObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of work history", "User is able to add work history successfully");
        System.out.println("Message : " + workHistoryPOObj.findText(workHistoryPOObj.ToastMessageSpec_xpath));

        //15. Click on Save & Continue button
        Assert.assertTrue(workHistoryPOObj.clickOnLinkBtn(workHistoryPOObj.SaveContinueBtn_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");



    }


}
