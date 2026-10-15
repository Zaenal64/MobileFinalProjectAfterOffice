package base

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject

import io.appium.java_client.AppiumBy
import io.appium.java_client.AppiumDriver


public class BasePage {

    protected static final int TIMEOUT = 10

    // --- Driver & Object Resolver ---
   
    protected AppiumDriver getDriver() {
        return MobileDriverFactory.getDriver()
    }
    
    
    // --- Basic Actions --- 
    protected void tap(TestObject object) {
		Mobile.waitForElementPresent(object, TIMEOUT, FailureHandling.STOP_ON_FAILURE)
        Mobile.tap(object, TIMEOUT)
    }

    protected void input(TestObject object, String text) {
        Mobile.setText(object, text, TIMEOUT)
    }

    protected void clear(TestObject object) {
        Mobile.clearText(object, TIMEOUT)
    }

    protected String getText(TestObject object) {
        return Mobile.getText(object, TIMEOUT)
    }


    // --- Waiting ---
    protected void waitVisible(TestObject object) {
        Mobile.waitForElementPresent(object, TIMEOUT, FailureHandling.STOP_ON_FAILURE)
    }

    protected void waitNotVisible(TestObject object) {
        Mobile.waitForElementNotPresent(object, TIMEOUT)
    }


    
    // --- Verification ---
    
    protected void verifyExist(TestObject object) {
		Mobile.waitForElementPresent(object, TIMEOUT)
        Mobile.verifyElementExist(object, TIMEOUT)
    }

    protected void verifyNotExist(TestObject object) {
        Mobile.verifyElementNotExist(object, TIMEOUT)
    }

    protected void verifyVisible(TestObject object) {
		Mobile.waitForElementPresent(object, TIMEOUT)
        Mobile.verifyElementVisible(object, TIMEOUT)
    }

    protected void verifyNotVisible(TestObject object) {
        Mobile.verifyElementNotVisible(object, TIMEOUT)
    }

    protected void verifyEqual(Object actual, Object expected) {
        Mobile.verifyEqual(actual, expected)
    }

    
    // --- Native Android ---
    protected void pressBack() {
        Mobile.pressBack()
    }

    protected void scrollToText(String text) {
        Mobile.scrollToText(text)
    }

    protected void scrollToBottom() {

        int deviceHeight = Mobile.getDeviceHeight()
		int deviceWidht = Mobile.getDeviceWidth()
		
		int startX = deviceWidth / 2
		int startY = (int) (deviceHeight * 0.8) // atas ke bawah(80%)
		int endY = (int) (deviceHeight * 0.2) // Tarik ke atas (
		
		// scroll ke bawah
		Mobile.swipe(startX, startY, endY, endY)
    }

}