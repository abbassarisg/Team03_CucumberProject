Feature: Verify appointment
  @Afra
  Scenario: Us_010_Tc_005 Verify appointment with api
    Given Doctor lokman set the base url
    When  Doctor send the request and get the response
    Then  Doctor status code should be 200
    Then  Doctor verify response

