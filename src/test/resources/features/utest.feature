Feature: Daniel want create a user into the utest page for use the platform
  @Scenario1
  Scenario: Daniel register in the utest page
    Given He stay into the platform
    When He fill the data into the forms
    |strName|strLastName|strEmail|strMonth|strDay|strYear|strSpoken|strCity|strZip|strCountry|strComputer|strVersion|strLenguage|strMovil|strModel|strOs|strPassword|
    |Daniel|Garcia|dagarciap1233222d@gmail.com|October|20|1996|Arabic|Bogotá|111131|Colombia|Windows|10|Italian|Huawei|Y8p|Android 10|STTGGaadll96$|
    Then He register in the platform
    |strTextButton|
    |Complete Setup chevron_right|