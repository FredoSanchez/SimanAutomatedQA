@Productos
Feature: Probar las categorias de productos

  Scenario: Desplegar menu
    Given Navego a siman.com
    When Doy click al menu desplegable de categorias
    Then Se despliega el menu