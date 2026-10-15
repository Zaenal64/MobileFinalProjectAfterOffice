package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import base.BasePage
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

import internal.GlobalVariable

public class DashboardPage extends BasePage {

	private final TestObject Burger_Menu = findTestObject('Object Repository/components/Dashboard/burger_btn')
	private final TestObject Product_Text = findTestObject('Object Repository/components/Dashboard/product_txt')
	private final TestObject Produk_Dinamis = findTestObject('Object Repository/components/Dashboard/dynamicProduct_txt')


	/*
	 //List product pada dashboard
	 List<String> productNames =[
	 "Sauce Labs Backpack",
	 "Sauce Labs Bike Light",
	 "Sauce Labs Bolt T-Shirt",
	 "Sauce Labs Fleece Jacket",
	 "Sauce Labs Onesie",
	 "Test.allTheThings() T-Shirt (Red)"
	 ]
	 */

	public void verifyDashboard() {
		[
			Product_Text,
			Burger_Menu,
		].each { verifyVisible(it) }
		String titleProduk = getText(Product_Text)
		println("Teks " + titleProduk + " Ditemukan")
	}

	public void tapAllProducts(String produk) {

		try {
			//scroll ke text produk
			Mobile.scrollToText(produk)
			//tap produk secara dinamis
			Mobile.tap(findTestObject('Object Repository/components/Dashboard/dynamicProduct_txt', [('produkName') : produk]), 10)
			println("Berhasil tap produk: " +produk)
		}catch(Exception e) {
			println("Produk tidak ditemukan: " +produk)
		}
	}


}
