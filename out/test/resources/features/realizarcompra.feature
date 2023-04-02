#language:es
#encoding:UTF-8
#Author: Nevardo Antonio Ospina Zuñiga

Característica: Realizar compra en la página web www.exito.com
  yo como usuario registrado de la página web del éxito
  quiero seleccionar  productos agregandolo al carrito de compra
  para poder comprar los productos de mi interés

  @Compra
  Escenario: Compra exitosa
    Dado que el usuario esta en la pagina web registrado
    Cuando el usuario ingresa los datos de registro selecciona los productos
    Y se dirige apagar los productos
    Entonces el usuario debe ver un mensaje pago exitoso



