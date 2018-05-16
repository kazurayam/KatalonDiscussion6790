Katalon Studio Tips: Implicit constraint with XPath as the Selector of a Test Object
=====

# What is this?

This is a small [Katalon Studio](https://www.katalon.com/) project for demonstration purpose.
You can clone this out on your PC and execute it with your Katalon Studio.

This project is developed to propse a solution for the following discussion

- https://forum.katalon.com/discussion/6790/no-xpath-access-to-text-nodes


# Rule of thumb:

Xpath selector for an Test Object is required to be a valid xpath expression which returns an element node. If you set selector with an xpath which returns a text node, then  findTestObject(String <test object name>) would be evaluated to null. 