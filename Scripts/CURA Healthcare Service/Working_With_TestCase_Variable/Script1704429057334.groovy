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

def expectedTitle

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Page_CURA Healthcare Service/btnMakeAppointment'))

for (def index : (0..0)) {
    if (true) {
        WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtUsername'), username)

        WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtPassword'), password)

        WebUI.click(findTestObject('Page_CURA Healthcare Service/btnLogin'))
		
		WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/h2loginFailed'), 'Login failed! Please ensure the username and password are valid.')
    } 
	
	else {
		WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtUsername'), username)
		
		WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtPassword'), password)
		
		WebUI.click(findTestObject('Page_CURA Healthcare Service/btnLogin'))
		
		String actualTitle = WebUI.getText(findTestObject('Page_CURA Healthcare Service/h2MakeAppointment'))
		
		expectedTitle = 'Make Appointment'
		
		WebUI.verifyEqual(actualTitle, expectedTitle)
    }
}

WebUI.closeBrowser()



