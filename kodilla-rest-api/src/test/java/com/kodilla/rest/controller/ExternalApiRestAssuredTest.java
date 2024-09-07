package com.kodilla.rest.controller;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ExternalApiRestAssuredTest {

    @Test
    void testGetPostShouldReturnStatus200AndValidateResponse() {
        given().  // [1]
                header("Content-Type", "application/json").
                when().
                get("https://jsonplaceholder.typicode.com/posts/1").  // [2]
                then().
                assertThat().
                statusCode(200).  //  [3]
                body("userId", equalTo(1)).  //  [4]
                body("id", equalTo(1)).
                body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")).
                body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")).
                log().all();  // [5]
    }

    @Test
    void shouldUpdatePost() {
        // Given
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        Map<String, Object> updatedPostData = new HashMap<>();
        updatedPostData.put("id", 1);
        updatedPostData.put("title", "Updated title");

        // When
        Response response = given()
                .header("Content-Type", "application/json")
                .body(updatedPostData)
                .when()
                .put("/posts/1")
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        // Then
        assertEquals(200, response.getStatusCode());
        assertEquals("Updated title", response.jsonPath().getString("title"));
        assertEquals(1, response.jsonPath().getInt("id"));

    }
}