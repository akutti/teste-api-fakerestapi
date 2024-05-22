package action.users;

import data.body.UserBody;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;


public class UserAction {
    public String uriUser = "Users";
    UserBody userBody = new UserBody();
    Response response;

    public void deveRetornarSucessoQuandoInserirUser(Integer id, String userName, String password) {
        response = given().log().all()
                .body(userBody.bodyUser(id, userName, password))
                .when()
                .post(uriUser)
                .then().log().all()
                .extract().response();
        assertEquals(HttpStatus.SC_OK, response.getStatusCode());
    }

    public void validaUserName(String userName) {
        assertEquals(userName, response.body().path("userName"));
    }

    public void validaUserPassword(String password) {
        assertEquals(password, response.body().path("password"));
    }

}
