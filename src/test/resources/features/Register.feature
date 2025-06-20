# language: pt

  Funcionalidade: Criar conta
    Eu como usuário Adote Pet
    Quero criar uma conta
    Para poder acessar a funcionalidade do sistema

    Cenario: CT01 - Criar conta valida
      Dado que o usuário acessa a página inicial do site
      E clicar no link "Cadastrar"
      E deverá ser redirecionando para página de cadastro
      Quando preencher o formulário com dados validos
      Entao deverá ser redirecionado para a página de login