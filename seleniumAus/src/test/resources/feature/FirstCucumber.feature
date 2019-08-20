Feature: FirstCucumber

#Background: 
#       Given I launch the browser
#       Then I navigate to amazon url
#  
#Scenario Outline: Amazon
#   
#   When I enter "<Data>" in search textbox
#   And I click on Seach Button
#   Then I get the totoal count
#   Then I close the browser
#   
#Examples:              
#     |Data| |Data2|
#     |iPhone|
#     |Samsung|
#     |RedMi|
     

Scenario Outline: Number
   
   When I print <Data> <Data>
   
Examples:
     |Data| |Data2|
     |2|    |2|
     |3|    |3|
     
  

