package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SeleccionarProducto extends PageObject {

    public static final Target CAMPO_BUSQUEDA = Target.the("Campo busqueda")
            .located(By.cssSelector("input[placeholder='Buscar en exito.com']"));


}
