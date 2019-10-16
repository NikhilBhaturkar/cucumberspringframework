#Author: nikhilbhaturkar@gmail.com

Feature:
As a user, I want to login to the application
so that I can view the home page

Scenario: login google to the application
Given Login google page of the application
When Search Selenium Text
Then Click the Search button
