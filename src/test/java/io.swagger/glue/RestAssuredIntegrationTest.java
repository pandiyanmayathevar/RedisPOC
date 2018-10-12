package io.swagger.glue;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.SSLConfig;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ResponseBody;
import org.junit.After;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.PostConstruct;

import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;
import static com.jayway.restassured.http.ContentType.JSON;
import static org.slf4j.LoggerFactory.getLogger;

/**
 * Default step definition for consuming a rest api
 * {@link ContextConfiguration} ContextConfiguration and {@link SpringBootTest} @SpringBootTest annotation
 * are mandatory to be able to run cucumber unit test on spring rest controllers
 */
@ContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class RestAssuredIntegrationTest {

    private static final Logger logger = getLogger(RestAssuredIntegrationTest.class);
    @LocalServerPort
    private int serverPort;

    String baseUri;
    String body;
    String headerName;
    String headerValue;
    ResponseBody resBody;

    protected Response response;

    public void executeGet(String url, Object... params) {
        logger.info("GET {} {}", url, params);
        RestAssured.useRelaxedHTTPSValidation();
        response = given()
                .config(RestAssured.config().sslConfig(
                        new SSLConfig().allowAllHostnames()))
                .when().get(url, params);
    }

    public void executePost(String url) {
        logger.info("POST {} {}", url, body);
        response = given().header(headerName,headerValue).contentType(JSON).body(body).post(url);
    }

    public void executePut(String url) {
        logger.info("PUT {} {}", url, body);
        response = given().header(headerName,headerValue).contentType(JSON).body(body).put(url);
    }

    public void executeDelete(String url, Object... params) {
        logger.info("GET {} {}", url, params);
        response = when().delete(url, params);
    }

    @PostConstruct
    public void initHttpClient() {
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.port = serverPort;
    }

    @After
    public void teardown() {
        RestAssured.reset();
    }


}
