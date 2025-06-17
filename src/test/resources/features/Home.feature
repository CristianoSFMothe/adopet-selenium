# language: pt

Funcionalidade: Acessar a Página Inicial
  Eu como usuário do site Adote Pet
  Quero acessar a página inicial
  Para verificar a disponibilidade de Pet para adoção

  Cenario: CT01 - Valitar a página inicial do site
    Dado que o usuário acessa a página inicial do site
    Então a página deverá conter o texto "Boas-vindas!"
    E o texto "Adotar pode mudar uma vida. Que tal buscar seu novo melhor amigo hoje? Vem com a gente!"