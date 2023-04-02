package com.sofkau.tasks;

import com.sofkau.ui.ConfirmacionCompraExitosa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaInicial implements Task {
    private ConfirmacionCompraExitosa paginaInicial;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(paginaInicial)
        );
    }
}
