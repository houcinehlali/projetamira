Feature: Cr�ation dun employe
 @tag2
  Scenario: Cr�ation dun employe avec des informations valides
    Given Je veux cr�er un employe avec le nom "amira", le salaire "123k" et lage "23"
    When Je fais une requ�te POST
    Then Je devrais obtenir une r�ponse avec le statut 200
