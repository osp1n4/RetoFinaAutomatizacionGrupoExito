package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.ui.PaginaRegistro.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class AgregarCarritoCompra implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(SELECCIONAR_PRODUCTO1,isPresent()),
                WaitUntil.the(SELECCIONAR_PRODUCTO1,isCurrentlyVisible()),
                WaitUntil.the(SELECCIONAR_PRODUCTO1,isCurrentlyEnabled()),
                WaitUntil.the(SELECCIONAR_PRODUCTO1,isClickable()),
                Click.on(SELECCIONAR_PRODUCTO1),

                WaitUntil.the(BOTON_CARRITO_COMPRA,isPresent()),
                WaitUntil.the(BOTON_CARRITO_COMPRA,isCurrentlyVisible()),
                WaitUntil.the(BOTON_CARRITO_COMPRA,isCurrentlyEnabled()),
                WaitUntil.the(BOTON_CARRITO_COMPRA,isClickable()),
                Click.on(BOTON_CARRITO_COMPRA)
        );
    }

    public static AgregarCarritoCompra agregarCarritoCompra(){
        return new AgregarCarritoCompra();
    }
}


