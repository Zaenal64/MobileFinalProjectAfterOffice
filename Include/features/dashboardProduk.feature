Feature: User tap semua produk pada dashboard

  Background:
    Given User input "standard_user", "secret_sauce" dan tap button login

  Scenario Outline: User dapat tap semua produk pada dashboard
    When user tap "<produk>" pada dashboard
    And user diarahkan ke halaman detail product "<produk>"
    Then User tap button back untuk kembali ke dashboard

    Examples:
     | produk                            |
     | Sauce Labs Backpack               |
	 | Sauce Labs Bike Light             |
	 | Sauce Labs Bolt T-Shirt           |
	 | Sauce Labs Fleece Jacket          |
	 | Sauce Labs Onesie                 |
	 | Test.allTheThings() T-Shirt (Red) |