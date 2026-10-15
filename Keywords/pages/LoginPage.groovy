package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import base.BasePage
import internal.GlobalVariable

public class LoginPage extends BasePage {
	
	private final TestObject Login_Button =  findTestObject('Object Repository/pages/login/login_btn')
	private final TestObject Locked_User =  findTestObject('Object Repository/pages/login/lockedUser_txt')
	private final TestObject Username_Field = findTestObject('Object Repository/pages/login/username_field')
	private final TestObject Password_Field = findTestObject('Object Repository/pages/login/password_field')
	private final TestObject Login_Title = findTestObject('Object Repository/pages/login/loginTItle_txt')
	private final TestObject Username_Required = findTestObject('Object Repository/pages/login/usernameRequired_txt')
	private final TestObject Password_Requried = findTestObject('Object Repository/pages/login/passwordRequired_txt')
	private final TestObject Username_And_Password_Error = findTestObject('Object Repository/pages/login/usernameAndPasswordError_txt')
	private final TestObject Product_Title = findTestObject('Object Repository/components/Dashboard/product_txt')
	private final TestObject Title_Login = findTestObject('Object Repository/pages/login/loginTItle_txt')
	
	
	// Method input username & Password
	public void inputCredentials(String username, String password ) {
	// clear fields
		clear(Username_Field)
		clear(Password_Field)
	
	// input fields
		input(Username_Field, username)
		input(Password_Field, password)
	}
	
	// Method tap button login
	public void tapLogin() {
		tap(Login_Button)
	}
	
	public void verifyLoginPage() {
		[
			Title_Login,
			Username_Field,
			Password_Field,
			Login_Button
		].each { verifyVisible(it) }
		
		String loginText = getText(Title_Login)
		println("Title " + loginText + " Ditemukan")
	}

	
	// Method Verifikasi error massage
	public void verifyErrorMessage(String expectedMessage) {
		String actualMessage = ""
		
		if(expectedMessage == "Sorry, this user has been locked out.") {
			waitVisible(Locked_User)
			actualMessage = getText(Locked_User).trim()
			println("Teks " + actualMessage +" Berhasil ditampilkan")
		}else if (expectedMessage == "Password is required"){
			waitVisible(Password_Requried)
			actualMessage = getText(Password_Requried).trim()
			println("Teks " + actualMessage +" Berhasil ditampilkan")
		}else if(expectedMessage == "Username and password do not match any user in this service."){
			waitVisible(Username_And_Password_Error)
			actualMessage = getText(Username_And_Password_Error).trim()
			println("Teks " + actualMessage +" Berhasil ditampilkan")
		}else if(expectedMessage == "Username is required"){
			waitVisible(Username_Required)
			actualMessage = getText(Username_Required).trim()
			println("Teks " + actualMessage +" Berhasil ditampilkan")
		}
	}
	
	//Method verifikasi user berdasarkan type data
		public void verifyLoginType(String testType, String expectedMessage) {
			if(testType =='P') {
				verifyVisible(Product_Title)
			}else {
				verifyErrorMessage(expectedMessage)
				println("User masih berada di halaman login")
			}
		}
	
	

}
