package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.FellowshipPO;
import PO.HospitalMembershipPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HospitalMembershipTC extends BaseTest {
    @Test

    public void verifyHospitalMembershipSLT(){
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();
        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        HospitalMembershipPO hospMbrPOObj = new HospitalMembershipPO(driver);

        //*****************Credentialing Info - Hospital Membership Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-0014: Verify Hospital Membership Page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Hospital Membership tab
        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.HospMbrTab_xpath), "Unable to click on Hospital Membership tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Hospital Membership tab ", "User able to click on Hospital Membership tab");

        //3. Click on new add btn
        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.HospAddNew_xpath), "Unable to click on new add btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on new add btn ", "User able to click on new add btn");

        //4. Enter hospital Name
        Assert.assertTrue(hospMbrPOObj.enterTextInInputBtn(hospMbrPOObj.HospName_xpath, readFromPropFileObj.getHospitalName()), "Unable to enter hospital name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter hospital name ", "User able to enter hospital name");

        //5.Enter address
        Assert.assertTrue(hospMbrPOObj.enterTextInInputBtn(hospMbrPOObj.HAdd1_xpath, readFromPropFileObj.getInstiAddress()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(hospMbrPOObj.enterTextInInputBtn(hospMbrPOObj.HCity_xpath, readFromPropFileObj.getInstiCity()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //6.Select state from drop down
        Assert.assertTrue(hospMbrPOObj.selectFromDropDownBtn(hospMbrPOObj.HState_xpath, hospMbrPOObj.HState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        //7.Enter zip
        Assert.assertTrue(hospMbrPOObj.enterTextInInputBtn(hospMbrPOObj.Zip_xpath, readFromPropFileObj.getInstiZip()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

         //9.Select membership status
        Assert.assertTrue(hospMbrPOObj.selectFromDropDownBtn(hospMbrPOObj.MbrStatus_xpath, hospMbrPOObj.MbrStatusOpt_xpath), "Unable to click on dropdown button of membership status");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select membership status option  ", "User able to click and able to select from membership status option");

        //10.Select start date
        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.StartDtOpenCal_xpath), "Unable to click on Start Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Start Date calender ", "User able to open the Start Date calender");

        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.StartDtMonYr_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.StartDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year ", "User able to select year");

        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.StartDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.StartDtDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //11.Select End Date
        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.EndDtOpenCal_xpath), "Unable to click on End Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the End Date calender ", "User able to open the End Date calender");

        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.EndDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.EndDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year", "User able to select year");

        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.EndDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.EndDtDayDt_xpath), "Unable to select day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //8. Enter department
        Assert.assertTrue(hospMbrPOObj.enterTextInInputBtn(hospMbrPOObj.DeptName_xpath, readFromPropFileObj.getDepartment()), "Unable to enter department");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter department", "User able to enter department");

        //8. Enter department phone number
        Assert.assertTrue(hospMbrPOObj.enterTextInInputBtn(hospMbrPOObj.Phone_xpath, readFromPropFileObj.getphone()), "Unable to enter department phone number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter department phone number ", "User able to enter department phone number");

        //8. Enter department fax number
        Assert.assertTrue(hospMbrPOObj.enterTextInInputBtn(hospMbrPOObj.Fax_xpath, readFromPropFileObj.getFax()), "Unable to enter department fax number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter department fax number ", "User able to enter department fax number");

        //8. Enter office phone number
        Assert.assertTrue(hospMbrPOObj.enterTextInInputBtn(hospMbrPOObj.OffPhone_xpath, readFromPropFileObj.getOfficephone()), "Unable to enter office phone number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter office phone number ", "User able to enter office phone number");

        //12. Click on Add button
        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add fellowship info");

        //13. User should be able to add hospital Mbrship AND should display message of hospital Mbrship inserted successfully
        String expectedMessage = "A new hospital membership entry has been successfully created.";
        Assert.assertEquals(hospMbrPOObj.findText(hospMbrPOObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of hospital membership", "User is able to add hospital membership successfully");
        System.out.println("Message : " + hospMbrPOObj.findText(hospMbrPOObj.ToastMessageSpec_xpath));

        //14. Click on Save & Continue button
        Assert.assertTrue(hospMbrPOObj.clickOnLinkBtn(hospMbrPOObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");



    }
}
