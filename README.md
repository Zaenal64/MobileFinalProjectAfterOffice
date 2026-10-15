<h1 align="center"> 📱 Katalon Sauce Labs Mobile Automation Testing </h1>

![Katalon Studio](https://img.shields.io/badge/Tool-Katalon%20Studio%20v11.x-green)
![Appium](https://img.shields.io/badge/Engine-Appium-purple)
![Platform](https://img.shields.io/badge/Platform-Android-brightgreen)
![App](https://img.shields.io/badge/App-MyDemoApp%20(Sauce%20Labs)-orange)

This project is an automated mobile testing framework built for the **MyDemoApp** (Sauce Labs Sample Android Application). Built using **Katalon Studio** and **Appium Driver**, this framework automates key mobile functionality including product navigation, item selection, cart interactions, and UI element verification.

---

## 🛠️ Prerequisites & Setup
Ensure the following software and environment dependencies are configured on your local machine before executing the tests:

1. **Katalon Studio** (v11.x Enterprise / Free Trial)
2. **Node.js** (v18.x or later)
3. **Appium Server** (`npm install -g appium`)
4. **Appium uiautomator2 driver** (`appium driver install uiautomator2`)
5. **Android SDK / Android Studio** (with the `ANDROID_HOME` environment variable configured)
6. **Android Virtual Device (AVD / Emulator)** or a Physical Android Device with USB Debugging enabled.
7. **Application File:** `mda-2.2.0-25.apk` (Sauce Labs MyDemoApp APK).

---

## 📂 Project Structure
```text
|   .classpath
|   .gitattributes
|   .gitignore
|   .project
|   appium.log
|   build.gradle
|   console.properties
|   MobileAfterOffice.prj
|   README.md
|
+---.cache
|   \---Keywords
|           ..__Include__scripts__groovy__hooks__Hooks
|           ..__Include__scripts__groovy__stepDefinitions__DashboardProdukSteps
|           ..__Include__scripts__groovy__stepDefinitions__LoginPageStep
|           ..__Include__scripts__groovy__stepDefinitions__LogoutStep
|           base__BasePage
|           component__Logout
|           component__Navigation
|           navigation__Navigation
|           pages__DashboardPage
|           pages__Login
|           pages__LoginPage
|           pages__produkDetail
|           pages__ProdukDetailPage
|
+---.settings
|       io.cucumber.eclipse.java.prefs
|       org.eclipse.core.resources.prefs
|       org.eclipse.jdt.core.prefs
|       org.eclipse.jdt.groovy.core.prefs
|
+---bin
|   +---groovy
|   |   +---hooks
|   |   |       Hooks.class
|   |   |
|   |   \---stepDefinitions
|   |           DashboardProdukSteps.class
|   |           LoginPageStep.class
|   |           LogoutStep.class
|   |
|   +---keyword
|   |   +---base
|   |   |       BasePage.class
|   |   |
|   |   +---component
|   |   |       Logout.class
|   |   |       Navigation.class
|   |   |
|   |   \---pages
|   |           DashboardPage$_verifyDashboard_closure1.class
|   |           DashboardPage.class
|   |           LoginPage$_verifyLoginPage_closure1.class
|   |           LoginPage.class
|   |           ProdukDetailPage.class
|   |
|   +---lib
|   |   |   CustomKeywords.class
|   |   |   S1012_11.class
|   |   |
|   |   \---internal
|   |           GlobalVariable.class
|   |
|   +---listener
|   \---testcase
+---Checkpoints
+---Data
|   \---APK
|           default.apk
|
+---Data Files
|   \---DDT
|           login_DB.dat
|
+---Drivers
|       mysql-connector-j-26.7.0.jar
|
+---Include
|   +---config
|   |       log.properties
|   |
|   +---features
|   |       dashboardProduk.feature
|   |       login.feature
|   |       logout.feature
|   |
|   \---scripts
|       \---groovy
|           +---hooks
|           |       Hooks.groovy
|           |
|           \---stepDefinitions
|                   DashboardProdukSteps.groovy
|                   LoginPageStep.groovy
|                   LogoutStep.groovy
|
+---Keywords
|   +---base
|   |       BasePage.groovy
|   |
|   +---component
|   |       Logout.groovy
|   |       Navigation.groovy
|   |
|   \---pages
|           DashboardPage.groovy
|           LoginPage.groovy
|           ProdukDetailPage.groovy
|
+---Libs
|   |   CustomKeywords.groovy
|   |   S1012_11.groovy
|   |
|   \---internal
|           GlobalVariable.groovy
|
+---Object Repository
|   +---components
|   |   +---Dashboard
|   |   |   |   burger_btn.rs
|   |   |   |   dynamicProduct_txt.rs
|   |   |   |   product_txt.rs
|   |   |   |
|   |   |   \---view
|   |   |           logout_view.rs
|   |   |
|   |   \---ProductDetail
|   |           backToProduct_btn.rs
|   |           imageProdukDetail_img.rs
|   |           titleProduk_txt.rs
|   |
|   \---pages
|       \---login
|               lockedUser_txt.rs
|               loginTItle_txt.rs
|               login_btn.rs
|               passwordRequired_txt.rs
|               password_field.rs
|               usernameAndPasswordError_txt.rs
|               usernameRequired_txt.rs
|               username_field.rs
|
+---Plugins
+---Profiles
|       default.glbl
|
+---Reports
|   +---20261012_011404
|   |   |   plan.jsonl
|   |   |
|   |   +---.metadata
|   |   |   \---Final Project
|   |   |       \---Final Project After Office
|   |   \---Final Project
|   |       \---Final Project After Office
|   |           \---20261012_011405
|   |               |   20261012_011405.csv
|   |               |   20261012_011405.html
|   |               |   appium.log
|   |               |   console0.log
|   |               |   execution.properties
|   |               |   execution.uuid
|   |               |   execution0.log
|   |               |   JUnit_Report.xml
|   |               |   testCaseBinding
|   |               |   tsc_id.txt
|   |               |
|   |               \---cucumber_report
|   |                   +---1791742451103
|   |                   |       cucumber.html
|   |                   |       cucumber.json
|   |                   |       cucumber.xml
|   |                   |       k-cucumber.json
|   |                   |
|   |                   +---1791742690265
|   |                   |       cucumber.html
|   |                   |       cucumber.json
|   |                   |       cucumber.xml
|   |                   |       k-cucumber.json
|   |                   |
|   |                   \---1791742751352
|   |                           cucumber.html
|   |                           cucumber.json
|   |                           cucumber.xml
|   |                           k-cucumber.json
|   |
|   \---Self-healing
|           broken-test-objects-v2.json
|
+---Scripts
|   +---TC01 - Login
|   |       Script1791738682605.groovy
|   |
|   +---TC02 - logout
|   |       Script1791740903172.groovy
|   |
|   \---TC03 - DashboardProduk
|           Script1791741778804.groovy
|
+---settings
|   +---external
|   |       com.kms.katalon.composer.execution.settings.properties
|   |       com.kms.katalon.core.db.DatabaseSettings.properties
|   |       com.kms.katalon.integration.azure.properties
|   |
|   \---internal
|           com.katalon.cucumber.properties
|           com.kms.katalon.composer.project.properties
|           com.kms.katalon.composer.testcase.properties
|           com.kms.katalon.composer.testcase.settings.properties
|           com.kms.katalon.core.mobile.android.properties
|           com.kms.katalon.core.webservice.properties
|           com.kms.katalon.execution.properties
|           com.kms.katalon.execution.webservice.properties
|           com.kms.katalon.execution.webui.properties
|           com.kms.katalon.execution.windows.properties
|           com.kms.katalon.integration.qtest.properties
|           selfheal.webui.properties
|
+---Test Cases
|       TC01 - Login.tc
|       TC02 - logout.tc
|       TC03 - DashboardProduk.tc
|
+---Test Listeners
\---Test Suites
    \---Final Project
            .meta
            Final Project After Office.groovy
            Final Project After Office.ts
```
## 🚀 Execution Guide
1. Open the Project in Katalon Studio:
   * Launch Katalon Studio.
   * Go to File > Open Project > select the katalon-saucelabs-mobile directory.
     
2. Start the Android Emulator / Device:
   * Open Android Studio > Device Manager > Launch your Android Virtual Device (e.g., Pixel 7 - API 33).
   * Alternatively, connect a physical Android device via USB and confirm detection using adb devices in terminal.
     
3. Verify Appium Service:
   * Katalon Studio manages and detects the local Appium driver automatically during execution.
     
4. Run Test Suites:
   * Navigate to Test Suites > open MobileTestSuite.
   * Click the dropdown arrow next to the Run button on the toolbar, then select Android.
   * Choose your active Android Device / Emulator and click OK
  
## 🧪 Test Suite & Test Coverage
| Nama Test Suite | Method | Expected Status | Status |
| --- | --- | --- | --- |
| Login, Logout, View Dashboard Produk | E2e | 200 OK |🟢 PASSED |

## 🔒 Security & Best Practices
* Local APK files and test artifacts are excluded from remote tracking via .gitignore.
* No sensitive credentials, secrets, or API keys are stored within this repository.


