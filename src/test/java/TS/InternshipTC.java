package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.InternshipPO;
import PO.MedicalEducationPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InternshipTC extends BaseTest {

    @Test
    public void verifyInternshipSLT() throws InterruptedException {
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();
        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        InternshipPO internshipPOObj = new InternshipPO(driver);

        //*****************Credentialing Info - Internship Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-005: Verify Internship Page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Internship tab
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.InternTab_xpath), "Unable to click on Internship tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Internship tab ", "User able to click on Internship tab");

        //3. Click on Internship tab
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.InternAddNew_xpath), "Unable to click on add new btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add new btn ", "User able to click on add new btn");

        //4. Enter Institute Name
        Assert.assertTrue(internshipPOObj.enterTextInInputBtn(internshipPOObj.InstiName_xpath, readFromPropFileObj.getInstiName()), "Unable to enter institute name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter institute name ", "User able to enter institute name");

        //5.Enter address
        Assert.assertTrue(internshipPOObj.enterTextInInputBtn(internshipPOObj.HAdd1_xpath, readFromPropFileObj.getInstiAddress()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(internshipPOObj.enterTextInInputBtn(internshipPOObj.HCity_xpath, readFromPropFileObj.getInstiCity()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //6.Select state from drop down
        Assert.assertTrue(internshipPOObj.selectFromDropDownBtn(internshipPOObj.HState_xpath, internshipPOObj.HState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        //7.Enter zip
        Assert.assertTrue(internshipPOObj.enterTextInInputBtn(internshipPOObj.Zip_xpath, readFromPropFileObj.getInstiZip()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

        //8. Enter phone number
        Assert.assertTrue(internshipPOObj.enterTextInInputBtn(internshipPOObj.Phone_xpath, readFromPropFileObj.getphone()), "Unable to enter phone number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter phone number ", "User able to enter phone number");

       /* //9.Select degree
        Assert.assertTrue(internshipPOObj.selectFromDropDownBtn(internshipPOObj.Degree_xpath, internshipPOObj.DegreeOpt_xpath), "Unable to click on dropdown button of Degree");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select Degree option  ", "User able to click drop down button and able to select from Degree option");
*/
        //9.Select start date
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.StartDtOpenCal_xpath), "Unable to click on Certification Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Certification Date calender ", "User able to open the Certification Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.StartDtMonYr_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.StartDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year ", "User able to select year");

        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.StartDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.StartDtDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //10.Select End Date
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.EndDtOpenCal_xpath), "Unable to click on Recertification Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Recertification Date calender ", "User able to open the Recertification Date calender");

        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.EndDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.EndDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year", "User able to select year");

        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.EndDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.EndDtDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //11. Click on Add button
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add internship info");

        Thread.sleep(2000);
        //12. User should be able to add license AND should display message of License inserted successfully
        String expectedMessage = "A new internship entry has been successfully created.";
        Assert.assertEquals(internshipPOObj.findText(internshipPOObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of internship", "User is able to add internship successfully");
        System.out.println("Message : " + internshipPOObj.findText(internshipPOObj.ToastMessageSpec_xpath));

        //13. Click on Save & Continue button
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");
    }
}
