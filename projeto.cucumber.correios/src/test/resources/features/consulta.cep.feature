#Author:liviacarolineguimaraes@gmail.com

@regressivos
Feature: Realizar consulta de cep ou endereco no site correios

Como usuario do site correios
Quero acessar site
Para realizar consultas de cep ou endereco

  Background: Given que esteja na home
  
  @Positivo
  Scenario: Realizar consulta de cep ou endereco
  
  When enviar dados para busca
  Then valido os dados retornados
