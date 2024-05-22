package steps;

import action.users.UserAction;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class userStep extends UserAction {
    public userStep() {

    }

    @Quando("que faco a requisicao de post do usuario com id {int} nome {string} e senha {string}")
    public void queFacoARequisicaoDePostDoUsuarioComIdNomeESenha(int id, String userName, String password) {

        deveRetornarSucessoQuandoInserirUser(id, userName, password);
    }

    @E("valida que o password do usuario retornado igual a {string}")
    public void validaQueOPasswordDoUsuarioRetornadoIgualA(String password) {
        validaUserPassword(password);
    }

    @Entao("valida que o nome do usuario retornado e igual a {string}")
    public void validaQueONomeDoUsuarioRetornadoEIgualA(String userName) {
        validaUserName(userName);
    }


}
