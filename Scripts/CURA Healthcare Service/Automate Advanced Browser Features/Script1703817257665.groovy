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
import org.openqa.selenium.JavascriptExecutor as JavaScriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.openBrowser('https://katalon-demo-cura.herokuapp.com/')

//WebUI.maximizeWindow()
//Get window title
title = WebUI.getWindowTitle()

WebUI.verifyMatch(title, 'CURA Healthcare Service', true)

//Get url of the window
WebUI.getUrl()

//Define a variable and store window index
int currentTab = WebUI.getWindowIndex()

//Open a new tab
WebDriver driver = DriverFactory.getWebDriver()

JavaScriptExecutor js = (driver as JavaScriptExecutor)

js.executeScript('window.open();')

//Switch to a new tab
WebUI.switchToWindowIndex(currentTab + 1)

WebUI.navigateToUrl('https://www.google.com/')

WebUI.getWindowIndex()

//Switch to window by title
WebUI.switchToWindowTitle('CURA Healthcare Service')

//Switch window by url
WebUI.switchToWindowUrl('https://www.google.com/')

//Close window by title
//WebUI.closeWindowTitle('CURA Healthcare Service')
//Close window by index
WebUI.closeWindowIndex(1)

WebUI.delay(3)

WebUI.closeBrowser()

