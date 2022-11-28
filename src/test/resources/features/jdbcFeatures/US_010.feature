Feature: Us_010_DataBase ile Randevulari dogrulama
  @Database
  Scenario: US_010 Backend database testi

  Given Connect to database
  And   Get appointment information of all patients from the table
  Then  The verify query result



