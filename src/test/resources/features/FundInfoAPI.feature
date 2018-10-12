Feature: Spring api controller bdd

  Background:
    Given baseRestUri is https://spring-rediscache-poc.apps.cac.preview.pcf.manulife.com/fundinfo


  Scenario: 1 REST GET /deletecache2
    When the client calls GET /deletecache
    Then the client receives status code equal to 200

    Scenario: Add new Pet
      Given set Accept header to application/json
    And I set Content-Type header to application/json
    And I set body to {"category": {"id": 0,"name": "string"},"name": "doggie","photoUrls": ["string"],"tags": [{"id": 0,"name": "string"}],"status": "available"}
    When I POST /pet
    Then response code should be 200


#  Scenario: 2 Add new Fund - FundID = 1
#    Given set Accept header to application/json
#    And set body to {"id": 1,"fundName": "123","categoryId": 1,"fundMangerName": "123","longName": "123","shortName": "123","cusipID":"123"}
#    When the client calls POST /1
#    Then the client receives status code equal to 200
##    Then the client receives status code equal to 400
#    Then the client receives body which contains id as 1
#    Then the client receives body which contains fundName as 123
#    Then the client receives body which contains categoryId as 1
#    Then the client receives body which contains fundMangerName as 123
#    Then the client receives body which contains longName as 123
#    Then the client receives body which contains shortName as 123
#    Then the client receives body which contains cusipID as 123
#
#
#  Scenario: 3 REST GET FundID = 1
#    When the client calls GET /1
#    Then the client receives status code equal to 200
#    Then the client receives body which contains id as 1
#    Then the client receives body which contains fundName as 123
#    Then the client receives body which contains categoryId as 1
#    Then the client receives body which contains fundMangerName as 123
#    Then the client receives body which contains longName as 123
#    Then the client receives body which contains shortName as 123
#    Then the client receives body which contains cusipID as 123
#
#
#  Scenario: 4 Update Fund - FundID = 1
#    Given set Accept header to application/json
#    And set body to {"id": 1,"fundName": "123","categoryId": 1,"fundMangerName": "123456","longName": "123456","shortName": "123456","cusipID":"123456"}
#    When the client calls PUT /1
#    Then the client receives status code equal to 200
#    Then the client receives body which contains id as 1
#    Then the client receives body which contains fundName as 123
#    Then the client receives body which contains categoryId as 1
#    Then the client receives body which contains fundMangerName as 123456
#    Then the client receives body which contains longName as 123456
#    Then the client receives body which contains shortName as 123456
#    Then the client receives body which contains cusipID as 123456
#
#  Scenario: 5 REST GET FundID = 1
#    When the client calls GET /1
#    Then the client receives status code equal to 200
#    Then the client receives body which contains id as 1
#    Then the client receives body which contains fundName as 123
#    Then the client receives body which contains categoryId as 1
#    Then the client receives body which contains fundMangerName as 123456
#    Then the client receives body which contains longName as 123456
#    Then the client receives body which contains shortName as 123456
#    Then the client receives body which contains cusipID as 123456
#
#
#  Scenario: 6 REST DELETE FundID = 1
#    When the client calls Delete /1
#    Then the client receives status code equal to 200
#
#  Scenario: 7 REST GET FundID = 1 (Response status code NOT equal to 200)
#    When the client calls GET /1
#    Then the client receives status code not equal to 200
#
#  Scenario: 8 Add new Fund - FundID = 2
#    Given set Accept header to application/json
#    And set body to {"id": 2,"fundName": "234","categoryId": 2,"fundMangerName": "234","longName": "234","shortName": "234","cusipID":"234"}
#    When the client calls POST /2
#    Then the client receives status code equal to 200
#    Then the client receives body which contains id as 2
#    Then the client receives body which contains fundName as 234
#    Then the client receives body which contains categoryId as 2
#    Then the client receives body which contains fundMangerName as 234
#    Then the client receives body which contains longName as 234
#    Then the client receives body which contains shortName as 234
#    Then the client receives body which contains cusipID as 234
#
#  Scenario: 9 Update Fund without updating cache - FundID = 2
#    Given set Accept header to application/json
#    And set body to {"id": 2,"fundName": "123","categoryId": 2,"fundMangerName": "123456","longName": "123456","shortName": "123456","cusipID":"123456"}
#    When the client calls PUT /2/nocache
#    Then the client receives status code equal to 200
#
#
#  Scenario: 10 REST GET FundID = 2
#    When the client calls GET /2
#    Then the client receives status code equal to 200
#    Then the client receives body which contains id as 2
#    Then the client receives body which contains fundName as 234
#    Then the client receives body which contains categoryId as 2
#    Then the client receives body which contains fundMangerName as 234
#    Then the client receives body which contains longName as 234
#    Then the client receives body which contains shortName as 234
#    Then the client receives body which contains cusipID as 234
#
#  Scenario: 11 REST GET /deletecache
#    When the client calls GET /deletecache
#    Then the client receives status code equal to 200
#
#
#  Scenario: 12 REST GET FundID = 2
#    When the client calls GET /2
#    Then the client receives status code equal to 200
#    Then the client receives body which contains id as 2
#    Then the client receives body which contains fundName as 123
#    Then the client receives body which contains categoryId as 2
#    Then the client receives body which contains fundMangerName as 123456
#    Then the client receives body which contains longName as 123456
#    Then the client receives body which contains shortName as 123456
#    Then the client receives body which contains cusipID as 123456
#
#  Scenario: 13 REST DELETE FundID = 2
#    When the client calls Delete /2
#    Then the client receives status code equal to 200
#
#  Scenario: 14 REST GET FundID = 2 (Response status code NOT equal to 200)
#    When the client calls GET /2
#    Then the client receives status code not equal to 200
#
#  Scenario: 15 REST GET /deletecache
#    When the client calls GET /deletecache
#    Then the client receives status code equal to 200
#
