@Productos
Feature: Compra de productos


   Background: Probar la compra de productos con diferentes metodos de pago
      Given Navego a siman.com

  Scenario: Iniciar sesion
    And Inicio sesion en siman.com
    Then Inicio sesion correctamente

  Scenario Outline: Probar metodo de pago meses sin intereses
      When Busco <producto> en siman.com
      #And Selecciono producto
      #And Dar click a boton de Siman Pro
      #And Selecciono garantia <garantia>
      #And Doy click al boton comprar
      #And Doy click al boton finalizar compra
      #And Elijo metodo de pago meses sin intereses
      #And Elejir <banco>
      #And Elijo <cantidad> de meses
      #And Doy click al boton de comprar ahora
      #Then Producto fue comprado exitosamente

    Examples:
      |  producto   | garantia | banco    | cantidad |
      |464544100006 |opcion 1  |Promerica |     1    |
      |464544100006 |opcion 1  |Cuscatlan |     2    |
      |464544100006 |opcion 1  |BAC       |     1    |
      |464544100006 |opcion 1  |Davivienda|     2    |

#  Scenario Outline: Probar metodo de pago por cuotas
      #When Busco <producto> en siman.com
      #And Selecciono producto
      #And Dar click a boton de Siman Pro
#    #And Selecciono garantia <garantia>
#    And Doy click al boton comprar
#    And Doy click al boton finalizar compra
#    And Elijo metodo de pago por cuotas
#    And Doy click al boton de comprar ahora
#    Then Producto fue comprado exitosamente
#
#    Examples:
#      |  producto   | garantia |
#      |464544100006 |opcion 1  |
#      |464544100006 |opcion 2  |
#      |464544100006 |opcion 3  |
#      |464544100006 |opcion 4  |


