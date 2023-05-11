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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.Path, false)

Mobile.waitForElementPresent(findTestObject('Login/imageLogin'), 5)

Mobile.verifyElementExist(findTestObject('Login/imageLogin'), 5)

Mobile.verifyElementExist(findTestObject('Login/inputEmail'), 0)

Mobile.verifyElementExist(findTestObject('Login/inputPassword'), 0)

Mobile.tap(findTestObject('Login/buttonLogin'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Login/errorMessageEmail'), 0)

Mobile.setText(findTestObject('Login/inputEmail'), 'tester@yopmail.com', 0)

Mobile.tap(findTestObject('Login/buttonLogin'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Login/errorMessagePassword'), 0)

Mobile.setText(findTestObject('Login/inputPassword'), 'password', 0)

Mobile.tap(findTestObject('Login/buttonLogin'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Login/textViewTitle'), 0)

Mobile.verifyElementExist(findTestObject('Login/textViewEmail'), 0)

Mobile.verifyElementExist(findTestObject('Login/textViewPassword'), 0)

