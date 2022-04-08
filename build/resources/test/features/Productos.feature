@Productos
Feature: Compra de productos


   Background: Probar la compra de productos con diferentes metodos de pago
      Given Navego a siman.com

@Inicio
  Scenario: Iniciar sesion
    And Inicio sesion en siman.com
    Then Inicio sesion correctamente

@Forro
#  Scenario Outline: Probar metodo de pago meses sin intereses
#      When Busco <producto> en siman.com
#      And Selecciono producto 1
#      And Dar click a boton de Siman Pro
#      And Selecciono garantia <garantia>
#      And Doy click al boton comprar
#      And Doy click al boton finalizar compra
#      And Doy click a proceder a pagar
#      And Elijo metodo de pago meses sin intereses
#      And Elejir <banco>
#      And Elijo <cantidad> de meses
#      And Doy click al boton de comprar ahora
#      Then Producto fue comprado exitosamente

#    Examples:
#      |  producto   | garantia | banco    | cantidad |
#      |464544100006 |opcion 5  |BAC       |     2    |
#      |464544100006 |opcion 5  |Cuscatlan |     2    |
#      |464544100006 |opcion 5  |BAC       |     1    |
#      |464544100006 |opcion 5  |Davivienda|     2    |


@Refri
  Scenario Outline: Probar metodo de pago por cuotas
    When Busco <producto> en siman.com
    And Selecciono producto 2
    And Dar click a boton de Siman Pro
   #And Selecciono garantia <garantia>
    And Doy click al boton comprar
    And Doy click al boton finalizar compra
    And Doy click a proceder a pagar
    And Elijo metodo de pago por cuotas
    And Doy click al boton de comprar ahora
    Then Producto fue comprado exitosamente

    Examples:
      |  producto   | garantia |
      |103245282    |opcion 2  |
#      |103245282    |opcion 3  |
#      |103245282    |opcion 1  |
#      |103245282    |opcion 4  |


