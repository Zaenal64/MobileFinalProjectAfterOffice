package stepDefinitions


import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import pages.LoginPage
import pages.DashboardPage
import component.Logout
import base.BasePage



public class LogoutStep {
	LoginPage loginPage = new LoginPage()
	DashboardPage dashboardPage = new DashboardPage()
	Logout logoutComp = new Logout()
	BasePage basePage = new BasePage()


	@Given ("User input {string}, {string} dan tap button login")
	public void user_input_username_password_dan_tap_button_login(String username, String password) {
		loginPage.inputCredentials(username, password)
		loginPage.tapLogin()
	}

	@When("User berada pada halaman dashboard")
	public void user_berada_pada_halaman_dashboard() {
		dashboardPage.verifyDashboard()
	}

	@And ("User tap tombol logout")
	public void user_tap_tombol_logout(){
		logoutComp.tapLogout()
	}
	
	@Then ("User berhasil logout, diarahkan ke halaman login")
	public void user_berhasil_logout_diarahkan_kehalaman_login() {
		loginPage.verifyLoginPage()
	}
	
}