package com.epam.webservices.test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HeaderTest extends BaseTest {

    @Test
    public void checkHeader() {
        Response response = RestAssured.when()
                .get("/users")
                .andReturn();
        String contentHeader = response.getHeader("Content-Type");
        Assert.assertEquals(contentHeader, "application/json; charset=utf-8", "Incorrect Header");
    }
}
