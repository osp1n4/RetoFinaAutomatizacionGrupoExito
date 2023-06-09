package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRegistro.*;

public class IniciarSesion implements Task {
    private String usuario;
    private String password;

    private String producto;

    public IniciarSesion conUsuario(String usuario){
        this.usuario = usuario; return this;}

    public IniciarSesion conPassword(String password){
        this.password = password; return this;}

    public IniciarSesion producto(String producto){
        this.producto = producto; return this;}


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_CUENTA),
                Click.on(INGRESAR_CON_EMAIL_Y_CONTRASENIA),
                Enter.theValue(usuario).into(CAMPO_EMAIL),
                Enter.theValue(password).into(CAMPO_CONTRASENIAA),
                Click.on(BOTON_PARA_ENTRAR)


        );
    }

    public static IniciarSesion iniciarSesion(){
        return new IniciarSesion();
    }
}

