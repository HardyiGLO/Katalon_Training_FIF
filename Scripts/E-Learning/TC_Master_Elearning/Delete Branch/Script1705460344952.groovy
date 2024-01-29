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

WebUI.callTestCase(findTestCase('E-Learning/TC_Login/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('E-Learning/Master Elearning/Add Branch/Page_Master Elearning  Elearning CMS/span_Master Elearning'))

WebUI.waitForPageLoad(5)

WebUI.setText(findTestObject('E-Learning/Master Elearning/Delete Branch/Search_box'), branch_name)

WebUI.click(findTestObject('E-Learning/Master Elearning/Delete Data Master_branch/Page_Master Elearning  Elearning CMS/btn_del_branch'))

WebUI.click(findTestObject('E-Learning/Master Elearning/Delete Branch/Confirm_del_branch/Page_Master Elearning  Elearning CMS/button_Ya, Hapus'))

