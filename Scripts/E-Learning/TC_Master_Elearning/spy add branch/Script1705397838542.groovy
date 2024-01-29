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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://130.211.243.37:96/login')

WebUI.setText(findTestObject('Object Repository/E-Learning/Sample/Page_Login  Elearning CMS/input_email'), 'admin@indocyber.com')

WebUI.setEncryptedText(findTestObject('Object Repository/E-Learning/Sample/Page_Login  Elearning CMS/input_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/E-Learning/Sample/Page_Login  Elearning CMS/button_Login'))

WebUI.click(findTestObject('Object Repository/E-Learning/Sample/Page_Home  Elearning CMS/span_Master Elearning'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/E-Learning/Sample/Page_Master Elearning  Elearning CMS/button_Add                                 _6c91be'))

WebUI.setText(findTestObject('Object Repository/E-Learning/Sample/Page_Master Elearning  Elearning CMS/input_name'), 'hardy')

WebUI.setText(findTestObject('Object Repository/E-Learning/Sample/Page_Master Elearning  Elearning CMS/input_instanceCode'), 
    'kode')

WebUI.click(findTestObject('Object Repository/E-Learning/Sample/Page_Master Elearning  Elearning CMS/span_-- Choose PIC --'))

WebUI.click(findTestObject('Object Repository/E-Learning/Sample/Page_Master Elearning  Elearning CMS/input_isActive'))

WebUI.click(findTestObject('Object Repository/E-Learning/Sample/Page_Master Elearning  Elearning CMS/button_Close'))

WebUI.click(findTestObject('Object Repository/E-Learning/Sample/Page_Master Elearning  Elearning CMS/button_Log out'))

WebUI.closeBrowser()

