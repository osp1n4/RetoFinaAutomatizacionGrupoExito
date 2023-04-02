package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.sofkau.ui.PaginaRegistro.*;
import static com.sofkau.ui.SeleccionarProducto.CAMPO_BUSQUEDA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;


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
                WaitUntil.the(BOTON_UBICACION, isPresent()),
                WaitUntil.the(BOTON_UBICACION, isCurrentlyVisible()),
                WaitUntil.the(BOTON_UBICACION, isCurrentlyEnabled()),
                WaitUntil.the(BOTON_UBICACION,isClickable()),
                Click.on(BOTON_UBICACION),

                Click.on(SELECCIONAR_BUSCAR_CIUDAD),
                Enter.theValue(ciudad).into(SELECCIONAR_BUSCAR_CIUDAD),
                Hit.the(Keys.ENTER).into(SELECCIONAR_BUSCAR_CIUDAD),
                Click.on(SELECCIONAR_UBICION_ALMACEN),
                Hit.the(Keys.ENTER).into(SELECCIONAR_UBICION_ALMACEN),
                Click.on(BOTON_CONFIRMAR_DIRECCION),
                Click.on(CERRAR_VENTANA_DIRECCION),

                WaitUntil.the(CAMPO_BUSCAR_PRODUCTO, isPresent()),
                WaitUntil.the(CAMPO_BUSCAR_PRODUCTO, isCurrentlyVisible()),
                WaitUntil.the(CAMPO_BUSCAR_PRODUCTO, isCurrentlyEnabled()),
                WaitUntil.the(CAMPO_BUSCAR_PRODUCTO,isClickable()),
                Click.on(CAMPO_BUSCAR_PRODUCTO),

                Enter.theValue(producto).into(CAMPO_BUSQUEDA),
                Click.on(BOTON_LUPA_CAMPO_BUSCADOR)

        );
    }

    public static SeleccionarProducto seleccionarProducto(){
        return new SeleccionarProducto();
    }
}
