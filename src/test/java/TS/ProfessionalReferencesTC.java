package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.ProfessionalLiabilityInsurancePO;
import PO.ProfessionalReferencesPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class ProfessionalReferencesTC extends BaseTest {

    @Test

    public void verifyProfessionalReferencesSTL() throws InterruptedException {
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();

        ProfessionalReferencesPO ProfRefObj = new ProfessionalReferencesPO(driver);
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");

        //*****************Credentialing Info - Professional Liability Insurance Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-016: Verify Professional References page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Prof Liability Insurance tab
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.ProfRefTab_xpath), "Unable to click on professional references tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on professional liability references tab ", "User able to click on professional references tab");

        //4. Click on Add New btn
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.ProfRefAddNew_xpath), "Unable to click on add new btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add new btn ", "User able to click on add new btn");

        //5. Enter title from drop down
        Assert.assertTrue(ProfRefObj.selectFromDropDownBtn(ProfRefObj.ProfRefTitle_xpath, ProfRefObj.ProfRefTitleOpt_xpath), "Unable to select title");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select title from dropdown", "User able to select title from dropdown");

        //6.Enter Firstname
        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefirstName_xpath, readFromPropFileObj.getAddress2()), "Unable to enter first name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter first name ", "User able to enter first name ");

        //7.Enter Lastname
        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfReLastName_xpath, readFromPropFileObj.getAddress2()), "Unable to enter last name");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter last name ", "User able to enter last name ");

        //8.Select degree from drop down
        Assert.assertTrue(ProfRefObj.selectFromDropDownBtn(ProfRefObj.ProfRefDegree_xpath, ProfRefObj.ProfRefDegreeOpt_xpath), "Unable to select degree");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select degree from dropdown ", "User able to select degree from dropdown option ");

        //9. Enter specialty
        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefSpec_xpath, readFromPropFileObj.getSpecialty()), "Unable to enter specialty");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on specialty ", "User able to enter specialty");

        //10. Enter relationship
        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefRelationship_xpath, readFromPropFileObj.getrelationship()), "Unable to enter relationship");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on relationship ", "User able to enter relationship");

        //11.Select start date
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.StartDtOpenCal_xpath), "Unable to click on Start Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Start Date calender ", "User able to open the Start Date calender");
        sleep(2000);
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.StartDtMonYr_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.StartDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year ", "User able to select year");

        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.StartDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.StartDtDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //12.Select End Date
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.EndDtOpenCal_xpath), "Unable to click on End Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the End Date calender ", "User able to open the End Date calender");

        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.EndDtMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.EndDtYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year", "User able to select year");

        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.EndDtMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.EndDtDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //13. Enter phone number
        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefPhone_xpath, readFromPropFileObj.getPhone()), "Unable to enter phone number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on phone number ", "User able to enter phone number");

        //14. Enter fax number
        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefFax_xpath, readFromPropFileObj.getFax()), "Unable to enter fax phone");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on fax number", "User able to enter fax phone");

        //15.Enter email
        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefEmail_xpath, readFromPropFileObj.getEmail2()), "Unable to enter email");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter email", "User able to enter email");

        //16.Enter address
        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefAddress_xpath, readFromPropFileObj.getAddress2()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefCity_xpath, readFromPropFileObj.getCity2()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //17.Select state from drop down
        Assert.assertTrue(ProfRefObj.selectFromDropDownBtn(ProfRefObj.ProfRefState_xpath, ProfRefObj.ProfRefState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        Assert.assertTrue(ProfRefObj.enterTextInInputBtn(ProfRefObj.ProfRefZip_xpath, readFromPropFileObj.getZip2()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

        //18. Click on Add button
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add policy type");

        Thread.sleep(2000);
        //19. User should be able to add refrence AND should display message of professional reference entry
        String expectedMessage = "A new professional reference has been successfully created.";
        Assert.assertEquals(ProfRefObj.findText(ProfRefObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of professional reference ", "User is able to add professional reference  successfully");
        System.out.println("Message : " + ProfRefObj.findText(ProfRefObj.ToastMessageSpec_xpath));

        //20. Click on Save & Continue button
        Assert.assertTrue(ProfRefObj.clickOnLinkBtn(ProfRefObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");
    }
}
