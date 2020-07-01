package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import BasePage.ReadFromPropFile;
import PO.ProfessionalLiabilityInsurancePO;
import PO.SpecialtyPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.management.PlatformLoggingMXBean;

public class ProfessionalLiabilityInsuranceTC extends BaseTest{

    @Test

    public void verifyProfessionalLiabilityInsuranceSLT() throws InterruptedException {
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();

        ProfessionalLiabilityInsurancePO PLIPOObj = new ProfessionalLiabilityInsurancePO(driver);
        ReadFromPropFile readFromPropFileObj = new ReadFromPropFile("CredentialDocs_InfoConfig.properties");

        //*****************Credentialing Info - Professional Liability Insurance Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-015: Verify Professional Liability Insurance page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(PLIPOObj.clickOnLinkBtn(PLIPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(PLIPOObj.clickOnLinkBtn(PLIPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Prof Liability Insurance tab
        Assert.assertTrue(PLIPOObj.clickOnLinkBtn(PLIPOObj.ProfLiaInsuTab_xpath), "Unable to click on professional liability insurance  tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on professional liability insurance tab ", "User able to click on professional liability insurance tab");

        //4. Click on Add New btn
        Assert.assertTrue(PLIPOObj.clickOnLinkBtn(PLIPOObj.ProfLiaInsuAddNew_xpath), "Unable to click on add new btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add new btn ", "User able to click on add new btn");

        //5. Enter carrier info
        Assert.assertTrue(PLIPOObj.enterTextInInputBtn(PLIPOObj.Carrier_xpath, readFromPropFileObj.getCarrier()), "Unable to enter on carrier");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on professional carrier ", "User able to enter info on carrier");

        //6.Enter address
        Assert.assertTrue(PLIPOObj.enterTextInInputBtn(PLIPOObj.HAdd1_xpath, readFromPropFileObj.getInsuranceAddress()), "Unable to enter address");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter address ", "User able to enter address ");

        Assert.assertTrue(PLIPOObj.enterTextInInputBtn(PLIPOObj.HCity_xpath, readFromPropFileObj.getInsuranceCity()), "Unable to enter city");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter city", "User able to enter city ");

        //7.Select state from drop down
        Assert.assertTrue(PLIPOObj.selectFromDropDownBtn(PLIPOObj.HState_xpath, PLIPOObj.HState1_xpath), "Unable to select state");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Please select state from dropdown ", "User able to select state from dropdown option ");

        Assert.assertTrue(PLIPOObj.enterTextInInputBtn(PLIPOObj.Zip_xpath, readFromPropFileObj.getInsuranceZip()), "Unable to enter zip");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter zip ", "User able to enter zip");

        //8. Enter policy number
        Assert.assertTrue(PLIPOObj.enterTextInInputBtn(PLIPOObj.PolicayNum_xpath, readFromPropFileObj.getPolicyNum()), "Unable to enter policy number");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on policy number ", "User able to enter policy number");

        //9. Enter policy limits per occurrence
        Assert.assertTrue(PLIPOObj.enterTextInInputBtn(PLIPOObj.PolicyLimit_xpath, readFromPropFileObj.getPolicyLimit()), "Unable to enter policy limits per occurrence");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on policy limits per occurrence ", "User able to enter policy limits per occurrence");

        //10. Enter enter aggregate($)
        Assert.assertTrue(PLIPOObj.enterTextInInputBtn(PLIPOObj.Aggregate_xpath, readFromPropFileObj.getAggregate()), "Unable to enter aggregate($)");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Enter on aggregate($)", "User able to enter aggregate($)");

        //11.Select policy type
        Assert.assertTrue(PLIPOObj.selectFromDropDownBtn(PLIPOObj.PolicyTy_xpath, PLIPOObj.PolcyTyOpt_xpath), "Unable to click on dropdown button of policy type");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select policy type option  ", "User able to click drop down button and able to select from policy type option");

        //12. Click on Add button
        Assert.assertTrue(PLIPOObj.clickOnLinkBtn(PLIPOObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add policy type");

        Thread.sleep(2000);
        //13. User should be able to add insurance AND should display message of liability insurance entry
        String expectedMessage = "A new liability insurance entry has been successfully created.";
        Assert.assertEquals(PLIPOObj.findText(PLIPOObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of liability insurance", "User is able to add liability insurance entry successfully");
        System.out.println("Message : " + PLIPOObj.findText(PLIPOObj.ToastMessageSpec_xpath));

        //14. Click on Save & Continue button
        Assert.assertTrue(PLIPOObj.clickOnLinkBtn(PLIPOObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");





    }






}
