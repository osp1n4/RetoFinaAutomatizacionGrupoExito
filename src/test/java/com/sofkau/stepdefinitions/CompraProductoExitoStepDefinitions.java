package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Assertions;

import java.io.IOException;
import java.util.List;

import static com.sofkau.questions.MensajeConfirmacionCompra.mensajeConfirmacionCompra;
import static com.sofkau.tasks.AgregarCarritoCompra.agregarCarritoCompra;
import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.RealizarPago.realizarPago;
import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.tasks.SeleccionarProducto.seleccionarProducto;
import static com.sofkau.util.Variables.getUserPasword;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class CompraProductoExitoStepDefinitions extends Configuracion {
    public static Logger LOGGER= Logger.getLogger(CompraProductoExitoStepDefinitions.class);

    private List<String> credenciales = getUserPasword();

    public CompraProductoExitoStepDefinitions() throws IOException {
    }

    @Dado("que el usuario esta en la pagina web registrado")
    public void queElUsuarioEstaEnLaPaginaWebRegistrado() {

        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()
        );
    }

    @Cuando("el usuario ingresa los datos de registro selecciona los productos")
    public void el_usuario_ingresa_los_datos_de_registro_selecciona_los_productos() {

        try {
            theActorInTheSpotlight().attemptsTo(
                    iniciarSesion()
                            .conUsuario(credenciales.get(0))
                            .conPassword(credenciales.get(1))
            );
            LOGGER.info("El usuario fue registrado con exito ");

        } catch (Exception e) {
            LOGGER.info("Fallo al realizar el registro en la pagina web");
            LOGGER.info(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

        try {
            theActorInTheSpotlight().attemptsTo(
                    thePage(),
                    seleccionarProducto()
                            .ciudad("Medellin")
                            .almacen("Exito pereira")
                            .producto("camaron titi")
            );

            LOGGER.info("El usuario selecciono los productos y registro la direccion de la tienda con exito ");

        } catch (Exception e) {
            LOGGER.info("Fallo al seleccionar los productos de la pagina web");
            LOGGER.info(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }


        try {
            theActorInTheSpotlight().attemptsTo(
                    agregarCarritoCompra()
            );

            LOGGER.info("El usuario agrego los productos al carrito de compra con exito ");

        } catch (Exception e) {
            LOGGER.info("Fallo al realizar los registros de producto al carrito de compra");
            LOGGER.info(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }
    @Cuando("se dirige apagar los productos")
    public void se_dirige_apagar_los_productos() {
        try {
            theActorInTheSpotlight().attemptsTo(
                    realizarPago()
                            .conName("Nevardo Antonio")
                            .conLastName("Ospina Zuñiga")
                            .conTelefono("3147655512")
                            .conNumeroDocumento("1093216364")
            );
            LOGGER.info("El usuario registro los datos personales con exito ");

        } catch (Exception e) {
            LOGGER.info("El registro de los datos personales fallaron");
            LOGGER.info(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }

    }


    @Entonces("el usuario debe ver un mensaje pago exitoso")
    public void el_usuario_debe_ver_un_mensaje_pago_exitoso() {
        try {
            theActorInTheSpotlight().should(
                    seeThat(mensajeConfirmacionCompra(),equalTo("Detalles de tu compra"))
            );

            LOGGER.info("Prueba realizada con exito ");
            quitarDriver();

        } catch (Exception e) {
            LOGGER.info(" Fallo al realizar la assercion");
            LOGGER.info(e.getMessage());
            Assertions.fail();
            quitarDriver();
        }
    }


}
