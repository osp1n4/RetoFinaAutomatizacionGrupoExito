#language:es
#encoding:UTF-8
#Author: Nevardo Antonio Ospina Zuñiga

Característica: inciar seccion en página web www.exito.com
  yo como usuario de la página web del éxito
  quiero iniciar sesion con mi cuenta registrada
  para poder comprar productos de mi interés en la página web

  @InicioSesión
  Escenario: Iniciar sesion
    Dado que el usuario esta en la pagina de inicio del exito
    Cuando completa los campos para iniciar sesion
    Entonces el usuario debe ver un mensaje de hola cuando ingrese a su cuenta




