package TS;

import BasePage.BaseTest;
import BasePage.ExtentReport.ExtentTestManager;
import PO.SpecialtyPO;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SpecialtyTC extends BaseTest {
    @Test

    public void verfiySpecialtySLT() throws InterruptedException {
        //*********************Pre-condition : Login Require******************//
        LoginTC loginTCObj = new LoginTC(driver);
        loginTCObj.VerifyLoginSLT();

        SpecialtyPO specialtyPOObj = new SpecialtyPO(driver);

        //*****************Credentialing Info - Specialty Tab*********************//
        ExtentTestManager.getTest().getTest().setName("SMT-008: Verify Specialty Page ");
        //1. Click dropdown arrow on profile user
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DropDownPU_xpath), "Unable to click on profile user dropdown");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on dropdown arrow on profile user ", "User able to click on dropdown arrow on profile user");

        //2. Click ""Credential Info"" link
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.CreInfo_xpath), "Unable to click on Credential Info link");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Credential Info link ", "User able to click on Credential Info link");

        //3. Click on Specialty tab
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.SpecialtyTab_xpath), "Unable to click on Specialty  tab");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Specialty tab ", "User able to click on Specialty tab");

        //3. Click on add new btn
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.SpecialtyAddNew_xpath), "Unable to click on add new btn");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on add new btn ", "User able to click on add new btn");

        //4. Click on dropdown to select Specialty option
        Thread.sleep(2000);
        Assert.assertTrue(specialtyPOObj.selectFromDropDownBtn(specialtyPOObj.Specialty_xpath, specialtyPOObj.SpecialtyTxt_xpath), "Unable to click on drop down button of Specialty");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select Specialty option ", "User able to click drop down button and able to select from Specialty option");

        //5. Click on dropdown to select Subspecialty option
        Assert.assertTrue(specialtyPOObj.selectFromDropDownBtn(specialtyPOObj.SubSpec_xpath, specialtyPOObj.SubSpecTxt_xpath), "Unable to click on drop down button of SubSpecialty");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select option SubSpecialty ", "User able to click drop down button and able to select the option from SubSpecialty");

        //6. Click on dropdown to select BC/BE option
        Assert.assertTrue(specialtyPOObj.selectFromDropDownBtn(specialtyPOObj.BCBE_xpath, specialtyPOObj.BCBEText_xpath), "Unable to click on drop down button of BC/BE ");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select option from BC/BE ", "User able to click drop down button and able to select the option from BC/BE ");

      /*  //7. Click on dropdown to select Certifying Board option
        Assert.assertTrue(specialtyPOObj.selectFromDropDownBtn(specialtyPOObj.CertifyBoard_xpath, specialtyPOObj.CertifyBoardTxt_xpath), "Unable to click on drop down button of Certifying Board ");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on drop down button and select option from Certifying Board ", "User able to click drop down button and able to select the option from Certifying Board ");

        //8.Select date of Certification
        Thread.sleep(2000);
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtCertiDtOpenCal_xpath), "Unable to click on Certification Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Certification Date calender ", "User able to open the Certification Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtCertiMonYr_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Thread.sleep(1000);
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtCertiYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year ", "User able to select year");

        Thread.sleep(1000);
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtCertiMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtCertiDay_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");

        //9.Untick on Not Applicable checkbox;
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.NoEndDate_xpath), "Unable to click on 'Not Applicable checkbox'");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to uncheck 'Not Applicable checkbox' option ", "User able to click unckeck 'Not Applicable checkbox' option");

        //10.Select ""Date of Recertification""
        Thread.sleep(2000);
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtRecertiDtOpenCal_xpath), "Unable to click on Recertification Date calender");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to open the Recertification Date calender ", "User able to open the Recertification Date calender");

        Thread.sleep(2000);
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtRecertiMonYrDt_xpath), "Unable to select year & month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Select the year & month ", "User able to select year & month");

        Thread.sleep(1000);
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtRecertiYr_xpath), "Unable to select year");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select year", "User able to select year");

        Thread.sleep(1000);
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtRecertiMonth_xpath), "Unable to select month");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select month ", "User able to select month");

        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.DtRecertiDayDt_xpath), "Unable to select Day");
        ExtentTestManager.getTest().log(LogStatus.PASS, "click on to select day ", "User able to select day");
*/
        //11. Click on Add button
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.AddBtn_xpath), "Unable to click on add button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Add button ", "User successfully able to add Specialty and Subspecialty");

        //12. User should be able to add license AND should display message of License inserted successfully
        String expectedMessage = "A new specialty has been successfully created.";
        Assert.assertEquals(specialtyPOObj.findText(specialtyPOObj.ToastMessageSpec_xpath), expectedMessage);
        ExtentTestManager.getTest().log(LogStatus.PASS, "Capture the successful message of Specialty", "User is able to add Specialty successfully");
        System.out.println("Message : " + specialtyPOObj.findText(specialtyPOObj.ToastMessageSpec_xpath));

        Thread.sleep(2000);
        //13. Click on Save & Continue button
        Assert.assertTrue(specialtyPOObj.clickOnLinkBtn(specialtyPOObj.SaveContinue_xpath), "Unable to click on Save & Continue button");
        ExtentTestManager.getTest().log(LogStatus.PASS, "Click on Save & Continue button ", "User able to successfully save the record");


    }


}
