package com.sofkau.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class MensajeConfirmacionCompra implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }

    public static MensajeConfirmacionCompra mensajeConfirmacionCompra(){
        return new MensajeConfirmacionCompra();
    }
}
