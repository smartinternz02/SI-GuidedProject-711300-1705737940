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

WebUI.openBrowser('https://www.amazon.com/')

WebUI.refresh()

for (def n : (0..2)) {
    if (n == 0) {
        WebUI.selectOptionByLabel(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/select_All Departments'), 
            'Books', false)

        WebUI.verifyOptionSelectedByLabel(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/select_All Departments'), 
            'Books', false, 0)

        WebUI.setText(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
            'DA VINCI CODE')

        WebUI.click(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))
    } else if (n == 1) {
        WebUI.selectOptionByLabel(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/select_All Departments'), 
            'Computers', false)

        WebUI.verifyOptionSelectedByLabel(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/select_All Departments'), 
            'Computers', false, 0)

        WebUI.setText(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
            'laptops and accessories')

        WebUI.click(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))
    } else {
        WebUI.selectOptionByLabel(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/select_All Departments'), 
            'Music, CDs & Vinyl', false)

        WebUI.verifyOptionSelectedByLabel(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/select_All Departments'), 
            'Music, CDs & Vinyl', false, 0)

        WebUI.setText(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_field-keywords'), 
            'bohemian rhapsody vinyl record')

        WebUI.click(findTestObject('Search category/Page_Amazon.com. Spend less. Smile more/input_Search Amazon_nav-search-submit-button'))
    }
}

WebUI.delay(3)

WebUI.closeBrowser()

