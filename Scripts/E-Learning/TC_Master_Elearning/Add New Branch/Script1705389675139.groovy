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

WebUI.waitForElementVisible(findTestObject('E-Learning/Master Elearning/Add Branch/Page_Master Elearning  Elearning CMS/button_add_branch'), 
    15)

WebUI.click(findTestObject('E-Learning/Master Elearning/Add Branch/Page_Master Elearning  Elearning CMS/button_add_branch'))

WebUI.setText(findTestObject('E-Learning/Master Elearning/Add Branch/Page_Master Elearning  Elearning CMS/input_Name_name'), 
    branch_name)

WebUI.setText(findTestObject('E-Learning/Master Elearning/Add Branch/Page_Master Elearning  Elearning CMS/input_Kode Instansi_instanceCode'), 
    kode_instalasi)

WebUI.click(findTestObject('E-Learning/Master Elearning/Lov_Add_Branch/LOV_PIC/arrow_selection'))

WebUI.selectOptionByIndex(findTestObject('E-Learning/Master Elearning/Lov_Add_Branch/LOV_PIC/List_value'), pic, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('E-Learning/Master Elearning/Add Branch/Page_Master Elearning  Elearning CMS/button_Save'))

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

