package com.epam.webservices.test;

import com.epam.webservices.model.Post;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BodyTest extends BaseTest {

    @Test
    public void checkBody() {
        Response response = RestAssured.when()
                .get("/users")
                .andReturn();
        ResponseBody<?> responseBody = response.getBody();
        Post[] posts = responseBody.as(Post[].class);
        System.out.println(posts);
        Assert.assertEquals(posts.length, 10, "Incorrect number of users");
    }
}
