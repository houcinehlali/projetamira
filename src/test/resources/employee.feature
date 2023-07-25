Feature: Création dun employe
 @tag2
  Scenario: Création dun employe avec des informations valides
    Given Je veux créer un employe avec le nom "amira", le salaire "123k" et lage "23"
    When Je fais une requête POST
    Then Je devrais obtenir une réponse avec le statut 200
