package TS;
import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.FellowshipPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FellowshipTC extends BaseTest {
    @Test
        public void verifyFellowshipSLT() throws InterruptedException {

        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();
        //********************Reading data from Read From Prop File****************************//
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");
        FellowshipPO fellowshipPOObj = new FellowshipPO(driver);

        //*****************Credentialing Info - Fellowship Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-007: Verify Fellowship Page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Residency tab
        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.FellowTab_xpath), "Unable to click on fellowship tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on fellowship tab ", "User able to click on Fellowship tab");

        //3. Click on New add btn
        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.FellowshipAddNew_xpath), "Unable to click on new add btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on new add btn ", "User able to click on new add btn");

        Assert.assertTrue(fellowshipPOObj.selectFromDropDownBtn(fellowshipPOObj.FellowType_xpath, fellowshipPOObj.FellowOpt_xpath), "Unable to click on dropdown button of fellowship type");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select fellowship option  ", "User able to click drop down button and able to select from fellowship option");

        //4. Enter Institute Name
        Assert.assertTrue(fellowshipPOObj.enterTextInInputBtn(fellowshipPOObj.InstiName_xpath, readFromPropFileObj.getInstiName()), "Unable to enter institute name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter institute name ", "User able to enter institute name");

        //5.Enter address
        Assert.assertTrue(fellowshipPOObj.enterTextInInputBtn(fellowshipPOObj.HAdd1_xpath, readFromPropFileObj.getInstiAddress()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(fellowshipPOObj.enterTextInInputBtn(fellowshipPOObj.HCity_xpath, readFromPropFileObj.getInstiCity()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //6.Select state from drop down
        Assert.assertTrue(fellowshipPOObj.selectFromDropDownBtn(fellowshipPOObj.HState_xpath, fellowshipPOObj.HState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        //7.Enter zip
        Assert.assertTrue(fellowshipPOObj.enterTextInInputBtn(fellowshipPOObj.Zip_xpath, readFromPropFileObj.getInstiZip()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

        //8. Enter phone number
        Assert.assertTrue(fellowshipPOObj.enterTextInInputBtn(fellowshipPOObj.Phone_xpath, readFromPropFileObj.getphone()), "Unable to enter phone number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter phone number ", "User able to enter phone number");

       /* //9.Select degree
        Assert.assertTrue(fellowshipPOObj.selectFromDropDownBtn(fellowshipPOObj.Degree_xpath, fellowshipPOObj.DegreeOpt_xpath), "Unable to click on dropdown button of Degree");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select Degree option  ", "User able to click drop down button and able to select from Degree option");*/

        //10.Select start date

        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.StartDtOpenCal_xpath), "Unable to click on Start Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Start Date calender ", "User able to open the Start Date calender");
        Thread.sleep(2000);
        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.StartDtMonYr_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.StartDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year ", "User able to select year");

        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.StartDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.StartDtDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //11.Select End Date
        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.EndDtOpenCal_xpath), "Unable to click on End Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the End Date calender ", "User able to open the End Date calender");

        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.EndDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.EndDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year", "User able to select year");

        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.EndDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.EndDtDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //12. Click on Add button
        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add fellowship info");

        //Thread.sleep(2000);
        //13. User should be able to add fellowship AND should display message of fellowship inserted successfully
        String expectedMessage = "A new fellowship entry has been successfully created.";
        Assert.assertEquals(fellowshipPOObj.findText(fellowshipPOObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of fellowship", "User is able to add fellowship info successfully");
        System.out.println("Message : " + fellowshipPOObj.findText(fellowshipPOObj.ToastMessageSpec_xpath));

        //14. Click on Save & Continue button
        Assert.assertTrue(fellowshipPOObj.clickOnLinkBtn(fellowshipPOObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");

            }
        }
