package action.users;

import core.BaseTest;
import data.body.User;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.kohsuke.rngom.parse.host.Base;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


public class PostUserAction {



    public void deveRetornarSucessoQuandoInserirUser2() {
        given().log().all()
                .body(new User(1234, "Wendy Boyer Jr", "HsmUmwp2V5Hf8XZ"))
                .when()
                .post("/users")
                .then().log().all()
                .statusCode(200)
                .body("id", is(1234))
                .body("userName", is("Wendy Boyer Jr"))
                .body("password", is("HsmUmwp2V5Hf8XZ"));
    }
}
