
@US_005_API
Feature: US_005 hastalar hastahaneden randevu olusturabilmeli

  @apiTest
  Scenario: TC01 kullanici API kullanarak olusturulan hastanin bilgilerini dogrular.
    When kullanici adrese GET istegi gonderir
    Then kullanici Status kodun 200 oldugunu dogrular
    And kullanici kaydedilen hastanin bilgilerini dogrular

