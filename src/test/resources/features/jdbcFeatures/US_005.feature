
@US_005_DATABASE
Feature: US_005 hastalar hastahaneden randevu olusturabilmeli

  @databaseTest
  Scenario: TC14 kullanici DataBase kullanarak olusturulan hastanin bilgilerini dogrular.
    Given kullanici medunna DataBase kismina baglanir
    When kullanici DataBase kismindan kaydedilen hastanin bilgilerini alir ve DataBase ile dogrular


