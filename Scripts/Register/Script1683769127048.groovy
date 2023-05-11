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
Mobile.scrollToText('No account yet? Create one', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Login/linkRegister'), 0)

Mobile.tap(findTestObject('Login/linkRegister'), 0)

Mobile.waitForElementPresent(findTestObject('Register/inputName'), 0)

Mobile.verifyElementExist(findTestObject('Register/inputName'), 0)

Mobile.scrollToText('Already a member? Login', FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Register/inputEmail'), 0)

Mobile.verifyElementExist(findTestObject('Register/inputPassword'), 0)

Mobile.verifyElementExist(findTestObject('Register/inputVerifyPassword'), 0)

Mobile.verifyElementExist(findTestObject('Register/linkLogin'), 0)

Mobile.comment('invalid register')

Mobile.tap(findTestObject('Register/buttonRegister'), 0)

Mobile.verifyElementExist(findTestObject('Register/errorMessageName'), 0)

Mobile.setText(findTestObject('Register/inputName'), 'testing1', 0)

Mobile.setText(findTestObject('Register/inputEmail'), 'testeryopmail.com', 0)

Mobile.tap(findTestObject('Register/buttonRegister'), 0)

Mobile.verifyElementExist(findTestObject('Register/errorMessageEmail'), 0)

Mobile.setText(findTestObject('Register/inputEmail'), 'tester@yopmail.com', 0)

Mobile.tap(findTestObject('Register/buttonRegister'), 0)

Mobile.verifyElementExist(findTestObject('Register/errorMessagePassword'), 0)

Mobile.setText(findTestObject('Register/inputPassword'), 'password', 0)

Mobile.setText(findTestObject('Register/inputVerifyPassword'), 'password1', 0)

Mobile.tap(findTestObject('Register/buttonRegister'), 0)

Mobile.verifyElementExist(findTestObject('Register/errorMessageConfirmPassword'), 0)

Mobile.setText(findTestObject('Register/inputVerifyPassword'), 'password', 0)

Mobile.tap(findTestObject('Register/buttonRegister'), 0)

Mobile.verifyElementExist(findTestObject('Register/messageSucces'), 0)

