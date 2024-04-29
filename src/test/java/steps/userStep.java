package steps;

import action.users.PostUserAction;

import core.BaseTest;

import io.cucumber.java.pt.Dado;



public class userStep extends PostUserAction {
    public userStep() {

        }
        @Dado("que faco a requisicao de post do usuario")
        public void quefacoARequisicaoDePostDoUsuario() {
            deveRetornarSucessoQuandoInserirUser2();
    }
}
