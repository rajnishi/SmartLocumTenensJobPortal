package BasePage;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Properties;

public class BasePage {

    public WebDriver driver;
    Properties properties;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

        ///////////////Methods///////////

        public boolean clickOnLinkBtn(By by) {
            try {
                WebElement webElementObj = (new WebDriverWait(driver, 90))
                        .until(ExpectedConditions.visibilityOfElementLocated(by));
                webElementObj.click();
               return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
    }

    public boolean clickOnBtn(By by) {
        try {
            WebElement webElementObj = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webElementObj.click();
            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ESCAPE);
            r.keyRelease(KeyEvent.VK_ESCAPE);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean clickAction(By by) {
        try {
            Thread.sleep(5000);
            Actions actions = new Actions(driver);
            WebElement clickWomen = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            actions.moveToElement(clickWomen).build().perform();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean enterTextInInputBtn(By by, String text) {
        try {
            WebElement webElementObj = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            webElementObj.clear();
            webElementObj.sendKeys(text);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean selectFromDropDownBtn(By ddxpath, By valxpath) {
        try {
            Thread.sleep(2000);
            WebElement webElementObj = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(ddxpath));
            webElementObj.click();

            Thread.sleep(2000);
            WebElement webElementObj1 = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(valxpath));
            webElementObj1.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public boolean selectDropDown(By by, By by1, By by2) {
        try {
            Thread.sleep(2000);
            WebElement webElementObj = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by));
            //webElementObj.click();
            JavascriptExecutor jse = ((JavascriptExecutor) driver);
            jse.executeScript("arguments[0].click();",webElementObj );


            Thread.sleep(2000);
            WebElement webElementObj1 = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by1));
           // webElementObj1.click();
            JavascriptExecutor jse1 = ((JavascriptExecutor) driver);
            jse.executeScript("arguments[0].click();",webElementObj1 );

            Thread.sleep(2000);
            WebElement webElementObj2 = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.visibilityOfElementLocated(by2));
          //  webElementObj2.click();
            JavascriptExecutor jse2 = ((JavascriptExecutor) driver);
            jse.executeScript("arguments[0].click();",webElementObj2 );

            Robot r = new Robot();
            r.keyPress(KeyEvent.VK_ESCAPE);
            r.keyRelease(KeyEvent.VK_ESCAPE);

            return true;
            } catch (AWTException | InterruptedException ex) {
            ex.printStackTrace();
           return false;
        }
          }

    ////////////////Method for Toast message/////////

    public String findText(By by){
        WebElement webL = (new WebDriverWait(driver, 1000))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
        String text = webL.getText();
        return text;

    }

          //////////////////////////////////////////

    //Upload Image
    public boolean imageUpLoad(By by) {
        try {
            Thread.sleep(2000);
           // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

            WebElement imageUpLoad = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.presenceOfElementLocated(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", imageUpLoad);
            imageUpLoad.sendKeys("C:\\CherryBlossom.jpg");
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
    public boolean imageUpLoadPDF(By by) {
        try {
            Thread.sleep(2000);
            // ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

            WebElement imageUpLoad = (new WebDriverWait(driver, 60))
                    .until(ExpectedConditions.presenceOfElementLocated(by));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", imageUpLoad);
            imageUpLoad.sendKeys("C:\\medicaloffice.pdf");
            Thread.sleep(2000);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}