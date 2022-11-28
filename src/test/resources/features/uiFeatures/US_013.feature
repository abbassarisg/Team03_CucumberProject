@US013yeni
Feature: US013
  @US013TC01
  Scenario: US013_TC001
    Given ibrahim medunna sayfasina gider
    And  kullanici giristeki Sign in butonuna tiklar
    And  kullanici doktor rolunde gerekli bilgileri doldurulur
    And  kullanici Sign in butonuna tiklar
    And  kullanici acilan ekran doktor My Pages yazisina tiklar
    And  kullanici acilan yazida My Appointments yazisini tiklar
    And  kullanici acilan sayfada edit yazisina tiklar
    And  kullanici “request A test” yazisina tiklar
    And  kullanici acilan ekranda istedigi testleri secer
    And  kullanici test kisminda save butonuna tiklar
    Then basarili sekilde save olundugu  dogrulanir

  @US013TC02
  Scenario: US013_TC002
    Given ibrahim medunna sayfasina gider
    And  kullanici giristeki Sign in butonuna tiklar
    And  kullanici personel rolunde gerekli bilgileri doldurulur
    And  kullanici Sign in butonuna tiklar
    And kullanici personel rolunde My Pages butonuna tiklar
    And  kullanici acilan yazida Search Patient butonuna tiklar
    And  kullanici Patient SSN arama kutusuna hastanin SSN’s’n’ girer
    And  kullanici acilan sayfada Show Appointments’e tiklar
    And kullanici acilan bolumde gerekli hastanin show test''ne tiklar
    And kullanici acilan bolumde View Results'a tiklar
    And kullanici acilan bolumde Edit'e tiklar
    And kullanici result bolumune gerekli bilgileri girer
    And kullanici description bolumune gerekli bilgileri girer
    And kullanici personel bolumunden testi onaylamak icin Save butonuna basar
    And kullanici personel bolumunden testi onaylamak icin Save olundugunu dogrular

  @US013TC03
  Scenario: US013_TC003
    Given ibrahim medunna sayfasina gider
    And  kullanici giristeki Sign in butonuna tiklar
    And  kullanici doktor rolunde gerekli bilgileri doldurulur
    And  kullanici Sign in butonuna tiklar
    And kullanici acilan ekran doktor My Pages yazisina tiklar
    And  kullanici acilan yazida My Appointments yazisini tiklar
    And  kullanici acilan sayfada edit yazisina tiklar
    And kullanici Show Test Result'a tiklar
    And kullanici doktor rolunde View Resulta tiklar
    And kullanici acilan ekranda ID, Name gibi bilgilerin oldugunu dogrular

  @US013TC04
  Scenario: US013_TC004
    Given ibrahim medunna sayfasina gider
    And  kullanici giristeki Sign in butonuna tiklar
    And  kullanici doktor rolunde gerekli bilgileri doldurulur
    And  kullanici Sign in butonuna tiklar
    And kullanici acilan ekran doktor My Pages yazisina tiklar
    And  kullanici acilan yazida My Appointments yazisini tiklar
    And  kullanici acilan sayfada edit yazisina tiklar
    And kullanici Request inpatient butonuna basar
    And kullanici acilan ekran doktor My Pages yazisina tiklar
    And kullanici acilan ekranda My inpatient butonuna basar
    And yatan hastanin oldugu dogrulanir





