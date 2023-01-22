package org.example.courier;

import io.restassured.response.ValidatableResponse;

import static org.apache.http.HttpStatus.*;
import static org.hamcrest.Matchers.*;

public class CourierAssertions {
    public void createdSuccessfully(ValidatableResponse response) {
        response.assertThat()
                .statusCode(SC_CREATED)
                .body("ok", is(true))
                ;
    }

    public void creationFailed(ValidatableResponse response) {
        response.assertThat()
                .statusCode(SC_BAD_REQUEST)
                .body("message", notNullValue())
                ;
    }

    public void creationConflicted(ValidatableResponse response) {
        response.assertThat()
                .statusCode(SC_CONFLICT)
                .body("message", notNullValue())
                ;
    }

    public void loggedInSuccessfully(ValidatableResponse response) {
        response.assertThat()
                .statusCode(SC_OK)
                .body("id", greaterThan(0))
                ;
    }

    public void loggedInWithoutRequiredFieldFailed(ValidatableResponse response) {
        response.assertThat()
                .statusCode(SC_BAD_REQUEST)
                .body("message", notNullValue())
                ;
    }

    public void loggedInWithInvalidFieldFailed(ValidatableResponse response) {
        response.assertThat()
                .statusCode(SC_NOT_FOUND)
                .body("message", notNullValue())
                ;
    }

    public void deletedSuccessfully(ValidatableResponse response) {
        response.assertThat()
                .statusCode(SC_OK)
                .body("ok", is(true))
                ;
    }
}
