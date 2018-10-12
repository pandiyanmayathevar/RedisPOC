#Feature: Swagger petstore api bdd
#
#  Background:
#    Given baseRestUri is https://metadatadbservice-dev.apps.cac.preview.pcf.manulife.com
#
#
#
#  Scenario: 1 Add new Fund - FundID = 1
#    Given set Accept header to application/json
#    And set body to {"submission_status":"staged","submission_date":"2018-10-10T17:26:12.999 EDT","client_id":"rpspswsduext","client_user":"New Client","client_contract":"70300","client_data":"{\"after_market_Indicator\":\"Y\",\"business_code\":\"Inforce\",\"contract_status\":\"AC\",\"company_name\":\"JH - FE/BIT/BAT USE ONLY - CN\",\"client_user\":\"SDU Developer\",\"submitter_role\":\"Trustee\"}","storage_location_id":"001a476c-7bc8-4939-8a89-0696246ad521","file_info":[{"fileName":"myTestResults.docx","fileSize":"26320896"}]}
#    When the client calls POST /saveFileMetaData
#    Then the client receives status code equal to 200
##    Then the client receives status code equal to 400
##    Then the client receives body which contains id as 1
##    Then the client receives body which contains fundName as 123
##    Then the client receives body which contains categoryId as 1
##    Then the client receives body which contains fundMangerName as 123
##    Then the client receives body which contains longName as 123
##    Then the client receives body which contains shortName as 123
##    Then the client receives body which contains cusipID as 123
#
#
