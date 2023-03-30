package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PaginaRegistro.*;
import static com.sofkau.ui.PaginaRegistro.CAMPO_BUSCAR_PRODUCTO;
import static com.sofkau.ui.SeleccionarProducto.CAMPO_BUSQUEDA;


public class SeleccionarProducto implements Task {


    private String producto;
    private String ciudad;
    private String almacen;


    public SeleccionarProducto producto(String producto){
        this.producto = producto; return this;}
    public SeleccionarProducto ciudad(String ciudad){
        this.ciudad = ciudad; return this;}
    public SeleccionarProducto almacen(String almacen){
        this.almacen = almacen; return this;}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CAMPO_BUSCAR_PRODUCTO),
                Enter.theValue(producto).into(CAMPO_BUSQUEDA),
                Click.on(BOTON_LUPA),
                Click.on(SELECCIONAR_BUSCAR_CIUDAD),
                Hit.the(Keys.ENTER).into(SELECCIONAR_ALMACEN),
                Click.on(SELECCIONAR_ALMACEN),
                Hit.the(Keys.ENTER).into(SELECCIONAR_ALMACEN),
                Click.on(BOTON_CONFIRMAR_DIRECCION)


        );
    }

    public static SeleccionarProducto seleccionarProducto(){
        return new SeleccionarProducto();
    }
}
