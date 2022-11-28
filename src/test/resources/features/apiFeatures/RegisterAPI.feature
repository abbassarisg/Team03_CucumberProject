
  Feature: US001 Medunna Register

    @api
    Scenario: US001 Medunna RegisterAPI
      Given kullanici "https://medunna.com/api/register"
      When kullanici post request gönderir
      Then kullanici Status kodunun 200 oldugunu dogrular
      And kullanici response bodyi dogrular