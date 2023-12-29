import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import groovy.console.ui.SystemOutputInterceptor as SystemOutputInterceptor
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.pandemic'(['getText'])

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Login_page/Page_Login/input_Sign in_LoginName'), usrname)

WebUI.setText(findTestObject('Login_page/Page_Login/input_Sign in_loginPassword'), passwrd)

WebUI.click(findTestObject('Login_page/Page_Login/btn_login(submit)using xpath contains'))

WebUI.waitForPageLoad(3)

//WebUI.verifyElementPresent(findTestObject('LogOut/Page_Starbridges - Main Menu/a_Preferences_menu-sign-out'), 3, FailureHandling.OPTIONAL)
if (WebUI.verifyElementPresent(findTestObject('LogOut/Page_Starbridges - Main Menu/a_Preferences_menu-sign-out'), 3, FailureHandling.OPTIONAL)) {
    WebUI.comment('element logout terdeteksi, sukses login')

    WebUI.getText(findTestObject('Login_page/title_username/Page_1703660413453/user_name'))

    WebUI.click(findTestObject('LogOut/Page_Starbridges - Main Menu/a_Preferences_menu-sign-out'))

    WebUI.delay(2)

    WebUI.closeBrowser( //CustomKeywords.'com.kazurayam.ksbackyard.HighlightElement.on'(findTestObject('Login_page/Page_Login/gettexterror'))
        )
} else {
    WebUI.getText(findTestObject('starbridges_login/Page_1703134001710/Page_1703134001710/Page_1703144535754/gettexterror'))

    WebUI.closeBrowser()
}

