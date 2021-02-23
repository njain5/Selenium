Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize browser with chrome
And Navigate to "www.qaclickacademy.com" Site
And Click on Login link on homepage to land on secure signin page

When User enters <username> and <password> and logs in
Then Verify that user is successfully login

Examples:
|username							|password			|
|test99@gmail.com					|123456				|
|For Parameterization use Outline 	|123545				|


