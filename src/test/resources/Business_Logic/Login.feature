Feature: Login functionality

Background: User cancelled initial Login window
Given User provide browser name as "Chrome" and exe location as "H:\\automation support\\chromedriver.exe"
Given user enter url as "https://www.flipkart.com"
Given user cancel initial Login window

Scenario: Login functionality with valid credentials
When user navigate on Login tab
When user click on MyProfile
When user enter "asaraj.mhase@gmail.com" as username
When user enter "Teju@1989" as password
When user click on Login button
Then Application shows user profile to user