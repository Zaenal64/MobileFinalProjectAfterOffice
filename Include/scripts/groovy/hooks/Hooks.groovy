package hooks

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java.Scenario
import internal.GlobalVariable

class Hooks {

    @Before
    void beforeScenario(Scenario scenario) {
        println "========== START SCENARIO: " + scenario.getName() + " =========="
        
        // Membuat path dynamic / project-relative
        String dynamicApkPath = RunConfiguration.getProjectDir() + '/' + GlobalVariable.APK_PATH
        
        // Menjalankan aplikasi dengan dynamic path
        Mobile.startApplication(dynamicApkPath, true)
    }

    @After
    void afterScenario(Scenario scenario) {
        Mobile.closeApplication()
    }
}