package core;


import io.restassured.http.ContentType;

public interface Constantes {

    String APP_BASE_URL = "https://fakerestapi.azurewebsites.net/api";
    String APP_BASE_PATH = "/v1";

    ContentType APP_CONTENT_TYPE = ContentType.JSON;

    Long MAX_TIME_OUT = 5000L;
}
