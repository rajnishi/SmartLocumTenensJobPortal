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
    public void verifyInternshipSLT(){
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();
        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        InternshipPO internshipPOObj = new InternshipPO(driver);

        //*****************Credentialing Info - Medical Education Tab*********************//
      /*  ExtentTestManager.getTest().getTest().setName("SMT-0010: Verify Internship Page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(terminateReport();edEduPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Internship tab
        Assert.assertTrue(internshipPOObj.clickOnLinkBtn(internshipPOObj.InternTab_xpath), "Unable to click on Internship tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Internship tab ", "User able to click on Internship tab");

        //4. Enter Institute Name
        Assert.assertTrue(medEduPOObj.enterTextInInputBtn(medEduPOObj.InstiName_xpath, readFromPropFileObj.getInstiName()), "Unable to enter institute name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter institute name ", "User able to enter institute name");

        //5.Enter address
        Assert.assertTrue(medEduPOObj.enterTextInInputBtn(medEduPOObj.HAdd1_xpath, readFromPropFileObj.getInstiAddress()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(medEduPOObj.enterTextInInputBtn(medEduPOObj.HCity_xpath, readFromPropFileObj.getInstiCity()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //6.Select state from drop down
        Assert.assertTrue(medEduPOObj.selectFromDropDownBtn(medEduPOObj.HState_xpath, medEduPOObj.HState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        //7.Enter zip
        Assert.assertTrue(medEduPOObj.enterTextInInputBtn(medEduPOObj.Zip_xpath, readFromPropFileObj.getInstiZip()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

        //8. Enter phone number
        Assert.assertTrue(medEduPOObj.enterTextInInputBtn(medEduPOObj.Phone_xpath, readFromPropFileObj.getphone()), "Unable to enter phone number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter phone number ", "User able to enter phone number");

        //9.Select degree
        Assert.assertTrue(medEduPOObj.selectFromDropDownBtn(medEduPOObj.Degree_xpath, medEduPOObj.RsoluOpt_xpath), "Unable to click on dropdown button of Degree");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select Degree option  ", "User able to click drop down button and able to select from Degree option");

        //10.Select start date
        Thread.sleep(2000);
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.StartDtOpenCal_xpath), "Unable to click on Certification Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Certification Date calender ", "User able to open the Certification Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.StartDtMonYr_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Thread.sleep(1000);
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.StartDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year ", "User able to select year");

        Thread.sleep(1000);
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.StartDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.StartDtDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //11.Select End Date
        Thread.sleep(2000);
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.EndDtOpenCal_xpath), "Unable to click on Recertification Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Recertification Date calender ", "User able to open the Recertification Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.EndDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Thread.sleep(1000);
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.EndDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year", "User able to select year");

        Thread.sleep(1000);
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.EndDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.EndDtDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //12. Click on Add button
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add medical education info");

        Thread.sleep(2000);
        //13. User should be able to add license AND should display message of License inserted successfully
        String expectedMessage = "A new medical education entry has been sucessfully created.";
        Assert.assertEquals(medEduPOObj.findText(medEduPOObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of medical education", "User is able to add Medical Education Info successfully");
        System.out.println("Message : " + medEduPOObj.findText(medEduPOObj.ToastMessageSpec_xpath));

        //14. Click on Save & Continue button
        Assert.assertTrue(medEduPOObj.clickOnLinkBtn(medEduPOObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");



*/


    }




}
