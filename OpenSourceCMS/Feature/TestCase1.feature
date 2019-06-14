Feature: Free opensourcecms Login Feature

Scenario Outline: Free opensourcecms Login Test Scenario
Given user is already on Login Page
When title of login page is Username or Email Address
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
| username | password|
|opensourcecms|opensourcecms|
|opensourcecms|opensourcecms| 