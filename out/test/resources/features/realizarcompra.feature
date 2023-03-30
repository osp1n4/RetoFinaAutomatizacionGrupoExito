#language:es
#encoding:UTF-8
#Author: Nevardo Antonio Ospina Zuñiga

Característica: Realizar compra en la página web www.exito.com
  yo como usuario registrado de la página web del éxito
  quiero seleccionar  productos agregandolo al carrito de compra
  para poder pagar los productos de mi interés

  @Compra
  Escenario: Compra exitosa
    Dado que el usuario esta en la pagina web registrado
    Cuando selecciona los productos y se dirige apagar
    Entonces el usuario debe ver un mensaje pago exitoso



