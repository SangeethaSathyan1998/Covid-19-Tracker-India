##Author : Sangeetha Sathyan

@covidfeature
Feature: Automate the functionality of Covid Tracker

Scenario: To determine the results of covid tracking for corresponding states

Given The user is on Covid Tracker Page
When The user selects the state from the dropdown
Then The corresponding results are displayed.
And The covid distribution pie chart is dispayed.
And THe covid cases line chart representation is displayed.