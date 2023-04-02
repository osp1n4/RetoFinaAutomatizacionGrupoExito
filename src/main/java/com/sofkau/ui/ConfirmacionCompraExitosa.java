package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmacionCompraExitosa extends PageObject {

    public static final Target MENSAJE_CONFIRMACION_COMPRA  = Target.the("Boton para pagar producto")
            .located(By.xpath("//h3[@class='mt-5']"));

    //h3[@class='mt-5']
}
