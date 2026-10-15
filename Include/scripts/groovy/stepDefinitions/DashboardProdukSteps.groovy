package stepDefinitions
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When

import pages.DashboardPage
import pages.ProdukDetailPage
import base.BasePage


public class DashboardProdukSteps {
	
	DashboardPage dashboardPage = new DashboardPage()
	ProdukDetailPage produkDetail = new ProdukDetailPage()
 
	@When ("user tap {string} pada dashboard")
	public void user_tap_produk_pada_dashboard(String produk){
		dashboardPage.tapAllProducts(produk)
	}
	
	@And ("user diarahkan ke halaman detail product {string}")
	public void user_diarahkan_ke_halaman_detail_product(String produk){
		produkDetail.verifyProduct(produk)
	}
	
	@Then ("User tap button back untuk kembali ke dashboard")
	public void user_tap_button_back_untuk_kembali_ke_dashboard() {
		produkDetail.pressButtonBackToProduk()
	}
	
	



 
}