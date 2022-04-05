@Productos
Feature: Compra de productos


   Background: Probar la compra de productos con diferentes metodos de pago
      Given Navego a siman.com
      When Busco producto en siman.com
      And Selecciono producto
      And Dar click a boton de Siman Pro


  Scenario Outline: Probar metodo de pago meses sin intereses
      And Selecciono garantia <garantia>
      And Doy click al boton comprar
      And Doy click al boton finalizar compra
      And Elijo metodo de pago meses sin intereses
      And Elejir <banco>
      And Elijo <cantidad> de meses
      And Doy click al boton de comprar ahora
      Then Producto fue comprado exitosamente

    Examples:
      | garantia | banco    | cantidad |
      |opcion 1  |Promerica |     1    |
      |opcion 1  |Cuscatlan |     2    |
      |opcion 1  |BAC       |     1    |
      |opcion 1  |Davivienda|     2    |

  Scenario Outline: Probar metodo de pago por cuotas
    And Selecciono garantia <garantia>
    And Doy click al boton comprar
    And Doy click al boton finalizar compra
    And Elijo metodo de pago por cuotas
    And Doy click al boton de comprar ahora
    Then Producto fue comprado exitosamente

    Examples:
      | garantia |
      |opcion 1  |
      |opcion 2  |
      |opcion 3  |
      |opcion 4  |


