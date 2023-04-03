package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompraExitosa extends PageObject {

    public static final Target MENSAJE_CONFIRMACION_COMPRA  = Target.the("Mensaje de confirmacion de la compra")
            .located(By.cssSelector("body div div div div div h3 strong"));

}
