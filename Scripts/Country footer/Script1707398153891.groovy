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

WebUI.openBrowser('https://www.amazon.com/ref=nav_logo')

WebUI.refresh()

WebUI.click(findTestObject('Country footer/Page_Amazon.com. Spend less. Smile more/a_United States'))

WebUI.click(findTestObject('Country footer/Page_Go to website/span_United States'))

WebUI.click(findTestObject('Country footer/Page_Go to website/Page_Go to website/a_Japan ()'))

WebUI.click(findTestObject('Country footer/Page_Go to website/Page_Go to website/span_Go to website'))

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Country footer/Page_Go to website/Page_Go to website/span_Japan ()'))

WebUI.click(findTestObject('Country footer/Page_Go to website/Page_Go to website/a_India'))

WebUI.click(findTestObject('Country footer/Page_Go to website/Page_Go to website/span_Go to website'))

