package com.sofkau.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.sofkau.tasks.Refrescar.thePage;
import static com.sofkau.ui.PaginaRegistro.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class RealizarPago implements Task {
    private String name;
    private String lastName;
    private String telefono;
    private String numeroDocumento;

    public RealizarPago conName(String name) {
        this.name = name;
        return this;
    }

    public RealizarPago conLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public RealizarPago conTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public RealizarPago conNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!CAMPO_ACEPTAR_TERMINOS.resolveFor(actor).isSelected()) {
            actor.attemptsTo(Click.on(CAMPO_ACEPTAR_TERMINOS));
        }
        actor.attemptsTo(

                Enter.theValue(name).into(CAMPO_DATOS_COMPRADOR_NAME),
                Enter.theValue(lastName).into(CAMPO_DATOS_COMPRADOR_LAST_NAME),
                Enter.theValue(telefono).into(CAMPO_DATO_NUMERO_CELULAR),
                Enter.theValue(numeroDocumento).into(CAMPO_DATO_NUMERO_DOCUMENTO),
                Enter.theValue(name).into(CAMPO_DATOS_COMPRADOR_NAME),
                Enter.theValue(lastName).into(CAMPO_DATOS_COMPRADOR_LAST_NAME),


                Click.on(BOTON_CONTINUAR),

                Scroll.to(BOTON_FECHA_ENTREGA),
                Click.on(BOTON_FECHA_ENTREGA),
                Click.on(SELECCIONADA_FECHA),
                Click.on(BOTO_CONTINUAR_PAGINA_PAGO),

                Click.on(BOTON_PSE),
                WaitUntil.the(BOTON_IR_A_PAGAR_PRODUCTO, isPresent()),
                WaitUntil.the(BOTON_IR_A_PAGAR_PRODUCTO, isCurrentlyVisible()),
                WaitUntil.the(BOTON_IR_A_PAGAR_PRODUCTO, isCurrentlyEnabled()),
                WaitUntil.the(BOTON_IR_A_PAGAR_PRODUCTO, isClickable()),
                Click.on(BOTON_IR_A_PAGAR_PRODUCTO)

        );
    }

    public static RealizarPago realizarPago() {
        return new RealizarPago();
    }
}
