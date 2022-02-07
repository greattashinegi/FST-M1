@activity1_1
Feature: First Test

@SmokeTests
  Scenario:Opening webPage in Selenium
Given User is on Google Homepage
  When User types in Cheese and hits ENTER
  Then Show how many search results were shown
  And Close the browser
