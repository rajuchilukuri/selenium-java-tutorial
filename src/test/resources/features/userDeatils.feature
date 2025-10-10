@test
Feature:



  mvn test -Dcucumber.filters.tag="@test"
  Scenario:
    Given user fill the form
    |name|email|phone|address|
    | raju   | raju.chil@gmail.com    |  0778   |  7,florian     |


    Scenario Outline:
      Given user fill the details
      |<name>|<email>|<phone>|<address>|

      Examples:
      |name|email|phone|address|
      |raju|ra@gmail.com|089|1,bis|
      |raju|ra@gmail.com|089|1,bis|
      |raju|ra@gmail.com|089|1,bis|
      |raju|ra@gmail.com|089|1,bis|

