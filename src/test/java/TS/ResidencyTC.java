package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.InternshipPO;
import PO.ResidencyPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResidencyTC extends BaseTest {
    @Test
    public void verifyResidencySLT() throws InterruptedException {
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();
        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        ResidencyPO residencyPOObj = new ResidencyPO(driver);

        //*****************Credentialing Info - Residency Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-006: Verify Residency Page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Residency tab
        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.ResiTab_xpath), "Unable to click on Residency tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Residency tab ", "User able to click on Residency tab");

        //3. Click on New add btn
        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.ResiAddNew_xpath), "Unable to click on new add btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on new add btn ", "User able to click on new add btn");

        //4. Click on Residency type
        Assert.assertTrue(residencyPOObj.selectFromDropDownBtn(residencyPOObj.ResiType_xpath, residencyPOObj.ResiOpt_xpath), "Unable to click on dropdown button of residency type");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select residency option  ", "User able to click drop down button and able to select from residency option");

        //5. Enter Institute Name
        Assert.assertTrue(residencyPOObj.enterTextInInputBtn(residencyPOObj.InstiName_xpath, readFromPropFileObj.getInstiName()), "Unable to enter institute name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter institute name ", "User able to enter institute name");

        //6.Enter address
        Assert.assertTrue(residencyPOObj.enterTextInInputBtn(residencyPOObj.HAdd1_xpath, readFromPropFileObj.getInstiAddress()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(residencyPOObj.enterTextInInputBtn(residencyPOObj.HCity_xpath, readFromPropFileObj.getInstiCity()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //7.Select state from drop down
        Assert.assertTrue(residencyPOObj.selectFromDropDownBtn(residencyPOObj.HState_xpath, residencyPOObj.HState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        //8.Enter zip
        Assert.assertTrue(residencyPOObj.enterTextInInputBtn(residencyPOObj.Zip_xpath, readFromPropFileObj.getInstiZip()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

        //9. Enter phone number
        Assert.assertTrue(residencyPOObj.enterTextInInputBtn(residencyPOObj.Phone_xpath, readFromPropFileObj.getphone()), "Unable to enter phone number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter phone number ", "User able to enter phone number");

        /*//9.Select degree
        Assert.assertTrue(residencyPOObj.selectFromDropDownBtn(residencyPOObj.Degree_xpath, residencyPOObj.DegreeOpt_xpath), "Unable to click on dropdown button of Degree");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select Degree option  ", "User able to click drop down button and able to select from Degree option");*/

        //10.Select start date
        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.StartDtOpenCal_xpath), "Unable to click on Start Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Start Date calender ", "User able to open the Start Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.StartDtMonYr_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");


        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.StartDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year ", "User able to select year");


        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.StartDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.StartDtDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //11.Select End Date

        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.EndDtOpenCal_xpath), "Unable to click on End Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the End Date calender ", "User able to open the End Date calender");


        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.EndDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");


        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.EndDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year", "User able to select year");


        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.EndDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.EndDtDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //12. Click on Add button
        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add residencyinfo");

        //Thread.sleep(2000);
        //13. User should be able to add license AND should display message of License inserted successfully
        String expectedMessage = "A new residency has been successfully created.";
        Assert.assertEquals(residencyPOObj.findText(residencyPOObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of residency", "User is able to add residency info successfully");
        System.out.println("Message : " + residencyPOObj.findText(residencyPOObj.ToastMessageSpec_xpath));

        //14. Click on Save & Continue button
        Assert.assertTrue(residencyPOObj.clickOnLinkBtn(residencyPOObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");
    }
}

