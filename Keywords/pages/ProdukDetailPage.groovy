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
import com.kms.katalon.core.testobject.ConditionType


import base.BasePage
import internal.GlobalVariable

public class ProdukDetailPage extends BasePage{

	private final TestObject Back_To_Produk_Button = findTestObject('Object Repository/components/ProductDetail/backToProduct_btn')
	private final TestObject Produk_Detail_Image = findTestObject('Object Repository/components/ProductDetail/imageProdukDetail_img')
	
	BasePage basePage = new BasePage()
	
	
	public void verifyProduct(String produk) {
    TestObject dynamicTitle = new TestObject("dynamicTitle")
    dynamicTitle.addProperty("xpath", ConditionType.EQUALS, "//android.widget.TextView[@text='" + produk + "']")

    // Tunggu hingga elemen muncul di layar maksimal 10 detik
    Mobile.waitForElementPresent(dynamicTitle, 10)

    String titleProduk = Mobile.getText(dynamicTitle, 5).trim()
    println("Teks " + titleProduk + " Ditemukan")
    assert titleProduk == produk : "Gagal! Judul produk '${titleProduk}' tidak sesuai dengan '${produk}'"
}
	
	
	
	public void pressButtonBackToProduk() {
		basePage.tap(Back_To_Produk_Button)
	}
}
