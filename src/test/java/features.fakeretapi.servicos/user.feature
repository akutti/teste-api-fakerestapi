#language:pt

Funcionalidade: Criar um usuario

  @user
  Esquema do Cenario: Criar um usuario com sucesso
    Quando que faco a requisicao de post do usuario com id <id> nome "<userName>" e senha "<password>"
    Entao valida que o nome do usuario retornado e igual a "<userName>"
    E valida que o password do usuario retornado igual a "<password>"

    Exemplos:
      | id | userName        | password    |
      | 1  | aline kutti     | senha 123   |
      | 2  | Mauricio avila  | senha 124   |

  @userObrigatorio
  Esquema do Cenario: Criar um usuario com sucesso e validar obrigatoriedade dos campos
    Quando que faco a requisicao de post do usuario com id <id> nome "<userName>" e senha "<password>"
    Entao valida que o nome do usuario retornado e igual a "<userName>"
    E valida que o password do usuario retornado igual a "<password>"

    Exemplos:
      | id | userName        | password    |
      | 1  |                 | senha 123   |
      | 2  | Mauricio avila  |             |