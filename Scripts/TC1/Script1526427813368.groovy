import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/6790_testbed.html')

def text = WebUI.getText(findTestObject('Page_sample/div_node'))
WebUI.verifyEqual(text, 'Text 1Text 2')

def leadingPart = text.substring(0, text.indexOf('Text 2'))
WebUI.verifyEqual(leadingPart, 'Text 1')


WebUI.closeBrowser()

