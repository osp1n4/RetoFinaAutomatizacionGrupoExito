#language:es
#encoding:UTF-8
#Author: Nevardo Antonio Ospina Z

Característica: Iniciar sesion en pagina web del exito
  yo como usuario de la pagina web del exito
  quiero ingresar a la pagina onlinea con el usuario y password
  para poder comprar productos de la página web exito

  @InicioSesión
  Escenario: Iniciar sesion
    Dado que el usuario esta en la pagina de inicio
    Cuando el usuario completa los campos usuario y password para iniciar sesion
    Entonces el usuario debe ver un mensaje hola en la pagina principal