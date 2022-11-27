@All
Feature: US001 Medunna Register

  Background:Medunna anasayfasına gider
    Given kullanici medunna sayfasina gider
    When kullanici giris ikonuna tiklar
    And kullanici register ikonuna tiklar

  @TC01
  Scenario: kullanici gecerli SSN girer
    And kullanici 2 saniye bekler
    And kullanici gecerli SSN girer
    And kullanici  firstname girer
    And kullanici 2 saniye bekler
    And Kullanici  lastname girer.
    And kullanIci  username girer
    And kullanici 2 saniye bekler
    And kullanici  email girer
    And kullanici 2 saniye bekler
    And kullanici password girer
    And kullanici 2 saniye bekler
    And kullanici tekrar password girer
    And kullanici 2 saniye bekler
    And kullanici register butonuna basar
    Then kullanici kayit oldugunu dogrular

Scenario Outline: Gecersiz SSN
And kullanici gecersiz bir  "<SSN>" girer
  And kullanici  firstname girer
  And kullanici 1 saniye bekler
  And Kullanici  lastname girer.
  And kullanIci  username girer
  And kullanici 1 saniye bekler
  And kullanici  email girer
  And kullanici 1 saniye bekler
  And kullanici password girer
  And kullanici 1 saniye bekler
  And kullanici tekrar password girer
  And kullanici 1 saniye bekler
  And kullanici register butonuna basar
  And kullanicinin kayıt olamadıgı dogrulanir

  Examples:
    | SSN |
    | 123456789 |
    | 12-3456-789 |
    | 1-2345678-9 |
    | 123-45-67890 |
    |  |


  Scenario: Bos firstname ve lastname
    And kullanici 1 saniye bekler
    And kullanici gecerli SSN girer
    And kullanici  firstname kismini bos birakir
    And kullanici 1 saniye bekler
    And Kullanici  lastname kismini bos birakir
    And kullanIci  username girer
    And kullanici 1 saniye bekler
    And kullanici  email girer
    And kullanici 1 saniye bekler
    And kullanici password girer
    And kullanici 1 saniye bekler
    And kullanici tekrar password girer
    And kullanici 1 saniye bekler
    And kullanici register butonuna basar
    Then kullanici required uyarisi alir

    Scenario Outline: Gecersiz email
      And kullanici 1 saniye bekler
      And kullanici gecerli SSN girer
      And kullanici  firstname girer
      And kullanici 1 saniye bekler
      And Kullanici  lastname girer.
      And kullanIci  username girer
      And kullanici 1 saniye bekler
      And kullanici gecersiz "<email>" girer
      And kullanici 1 saniye bekler
      And kullanici password girer
      And kullanici 1 saniye bekler
      And kullanici tekrar password girer
      And kullanici 1 saniye bekler
      And kullanici register butonuna basar
      Then kullanicinin kayıt olamadıgı dogrulanir
      Examples:
        | email |
        |  |
        | emailimcom |
        | email.com |
        | @email.com |
        | aemail.com |
        | aemail@com |


      @usr
  Scenario Outline: Gecersiz email
    And kullanici 1 saniye bekler
    And kullanici gecerli SSN girer
    And kullanici  firstname girer
    And kullanici 1 saniye bekler
    And Kullanici  lastname girer.
    And kullanici gecersiz olan "<username>" girer
    And kullanici 1 saniye bekler
    And kullanici  email girer
    And kullanici password girer
    And kullanici 1 saniye bekler
    And kullanici tekrar password girer
    And kullanici 1 saniye bekler
    And kullanici register butonuna basar
    Then kullanicinin kayıt olamadıgı dogrulanir
    Examples:
      | username |
      | Frta? |
      | *** |









