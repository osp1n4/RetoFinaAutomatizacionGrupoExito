package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.sofkau.ui.PaginaRegistro.*;
import static com.sofkau.ui.SeleccionarProducto.CAMPO_BUSQUEDA;

public class CompraProductoExito implements Task {
    private String usuario;
    private String password;

    private String producto;

    public CompraProductoExito conUsuario(String usuario){
        this.usuario = usuario; return this;}

    public CompraProductoExito conPassword(String password){
        this.password = password; return this;}

    public CompraProductoExito producto(String producto){
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

    public static CompraProductoExito compraProducto(){
        return new CompraProductoExito();
    }
}

