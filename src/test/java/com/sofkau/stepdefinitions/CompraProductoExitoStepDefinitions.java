package com.sofkau.stepdefinitions;

import com.sofkau.setup.Configuracion;
import com.sofkau.tasks.AbrirPaginaInicial;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import static com.sofkau.tasks.IniciarSesion.iniciarSesion;
import static com.sofkau.tasks.NavegarAlRegistro.navegarAlRegistro;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraProductoExitoStepDefinitions extends Configuracion {


    @Dado("que el usuario esta en la pagina de inicio del exito")
    public void que_el_usuario_esta_en_la_pagina_de_inicio_del_exito() {
        configurarNavegador();
        theActorInTheSpotlight().wasAbleTo(
                new AbrirPaginaInicial()

        );
    }


    @Cuando("completa los campos para iniciar sesion")
    public void completa_los_campos_para_iniciar_sesion() {
                theActorInTheSpotlight().attemptsTo(
                        iniciarSesion().conUsuario("ospina_88@hotmail.com")
                                .conPassword("Emilia#2019")

        );
    }


    @Entonces("el usuario debe ver un mensaje de hola cuando ingrese a su cuenta")
    public void el_usuario_debe_ver_un_mensaje_de_hola_cuando_ingrese_a_su_cuenta() {

    }
}
