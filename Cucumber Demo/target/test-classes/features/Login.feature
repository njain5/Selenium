Feature: Application Login

Scenario: Home Page default Login
Given User is on Net Banking landing Page
When User log into Application with Username "jin" and Password "1234"
Then Home page is populated
And cards displayed are "true"

Scenario: Home Page default Login
Given User is on Net Banking landing Page
When User log into Application with Username "john" and Password "5676"
Then Home page is populated
And cards displayed are "false"