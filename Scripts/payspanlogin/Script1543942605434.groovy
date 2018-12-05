import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://confluence.payformance.net/login.action;jsessionid=C725B98E2921575D950E50CECB38F096?os_destination=%2Fpages%2Fviewpage.action%3Ftitle%3DPreQA+Environment%26spaceKey%3DPRODUCTDEV')

WebUI.setText(findTestObject('Object Repository/payspanlogin/Page_Log In - Confluence/input_Username_os_username'), 'nmohammed')

WebUI.setEncryptedText(findTestObject('Object Repository/payspanlogin/Page_Log In - Confluence/input_Password_os_password'), 
    'Nnn2D/CHcRjr0ebP8i9X1A==')

WebUI.click(findTestObject('Object Repository/payspanlogin/Page_Log In - Confluence/input_Remember me_login'))

