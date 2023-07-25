package com.Internet.herokuapp.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import static org.junit.Assert.assertEquals;

import com.Internet.herokuapp.pages.EmployeeApi;


public class EmployeeApiTest {
    private EmployeeApi employeeApi = new EmployeeApi();
    private Response response;

    @Given("Je veux créer un employe avec le nom {string}, le salaire {string} et lage {string}")
    public void je_veux_créer_un_employe_avec_le_nom_le_salaire_et_lage(String name, String salary, String age) {
        response = employeeApi.createEmployee(name, salary, age);
    }

    @When("Je fais une requête POST")
    public void je_fais_une_requête_POST() {
        // La requête POST est déjà faite dans la méthode Given
    }

    @Then("Je devrais obtenir une réponse avec le statut {int}")
    public void je_devrais_obtenir_une_réponse_avec_le_statut(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }
}
