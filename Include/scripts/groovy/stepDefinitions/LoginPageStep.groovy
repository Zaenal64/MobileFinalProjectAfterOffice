package stepDefinitions

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import io.cucumber.java.en.Given
import io.cucumber.java.en.When
import io.cucumber.java.en.Then
import io.cucumber.java.en.And

import com.kms.katalon.core.testdata.TestData
import component.Navigation
import pages.LoginPage


public class LoginPageStep {
 	LoginPage loginPage = new LoginPage()
	 
 	TestData dbData = findTestData('Data Files/DDT/login_DB')
	 
 
	 @Given ('User mengambil kredensial login dari data file baris ke {int}')
	 public void user_mengambil_kredensial_login_dari_data_file_baris_ke(int rowIndex) {
		 String username = dbData.getValue('username', rowIndex)
		 String password = dbData.getValue('password', rowIndex)
		 
		 
		 loginPage.inputCredentials(username, password)
	 }
	 
	 @When('User menekan tombol Login')
	 public void user_menekan_tombol_login() {
		 loginPage.tapLogin()
	 }
	 
	 @Then('Verifikasi hasil login untuk baris ke {int}')
	 public void verifikasi_hasil_login_untuk_baris_ke(int rowIndex) {
		 String testType = dbData.getValue('testType', rowIndex)
		 String expectedMessage = dbData.getValue('expected', rowIndex)
		 
		 loginPage.verifyLoginType(testType, expectedMessage)
	 }
	 
}