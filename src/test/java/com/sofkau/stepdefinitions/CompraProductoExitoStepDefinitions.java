package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.tasks.CompraProductoExito.compraProducto;
import static com.sofkau.tasks.SeleccionarProducto.seleccionarProducto;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductoExitoStepDefinitions extends Configuracion {


    @Dado("que el usuario esta en la pagina web registrado")
    public void que_el_usuario_esta_en_la_pagina_web_registrado() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );
    }

    @Cuando("selecciona los productos y se dirige apagar")
    public void selecciona_los_productos_y_se_dirige_apagar() throws InterruptedException {
                theActorInTheSpotlight().attemptsTo(
                        compraProducto().conUsuario("ospina_88@hotmail.com")
                                .conPassword("Emilia#2019")


        );
               Thread.sleep(6000);
        theActorInTheSpotlight().attemptsTo(
                seleccionarProducto()
               .producto("camaron titi")
                        .ciudad("pereira")
                        .almacen("Exito pereira")
                       //
        );

    }

    @Entonces("el usuario debe ver un mensaje pago exitoso")
    public void el_usuario_debe_ver_un_mensaje_pago_exitoso() {

    }


}
