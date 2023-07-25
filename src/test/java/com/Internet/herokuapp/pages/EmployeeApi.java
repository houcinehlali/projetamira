package com.Internet.herokuapp.pages;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class EmployeeApi {
    private static final String BASE_URL = "https://dummy.restapiexample.com/api/v1";

    public Response createEmployee(String name, String salary, String age) {
        String payload = String.format("{\"name\":\"%s\", \"salary\":\"%s\", \"age\":\"%s\"}", name, salary, age);

        return given()
                .header("Content-Type", "application/json")
                .body(payload)
                .when()
                .post(BASE_URL + "/create");
    }
}

