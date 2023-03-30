package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    public static final Target BOTON_CUENTA = Target.
            the("Mi cuenta")
            .located(By.cssSelector(".vtex-menu-2-x-styledLinkIcon.vtex-menu-2-x-styledLinkIcon--header-link.mh2"));

    public static final Target INGRESAR_CON_EMAIL_Y_CONTRASENIA = Target.
            the("Boton email y contrasenna")
            .located(By.xpath("//span[contains(text(), 'Ingresa con email y contraseña')]"));

    public static final Target CAMPO_EMAIL = Target.
            the("Campo del email")
            .located(By.xpath("//input[@placeholder='Ingresa tu email']"));

    public static final Target CAMPO_CONTRASENIAA = Target.
            the("Campo del contrasenna")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_PARA_ENTRAR = Target.
            the("Boton entrar")
            .located(By.xpath("//span[contains(text(), 'Entrar')]"));

    public static final Target CAMPO_BUSCAR_PRODUCTO = Target.the("campo buscar producto")
            .located(By.xpath("//input[contains(@placeholder, 'Buscar en exito.com')]"));

    public static final Target BOTON_LUPA = Target.the("Boton Lupa")
            .located(By.xpath("(//button[@class=' vtex-store-components-3-x-searchBarIcon vtex-store-components-3-x-searchBarIcon--search flex items-center pointer bn bg-transparent outline-0 pv0 pl0 pr3'])[1]"));


    public static final Target SELECCIONAR_BUSCAR_CIUDAD  = Target.the("Boton seleccionar ciudad")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target SELECCIONAR_ALMACEN = Target.the("Boton seleccionar tienda")
            .located(By.xpath("(//input[@type='text' and @aria-autocomplete='list'])[2]"));

    public static final Target BOTON_CONFIRMAR_DIRECCION = Target.the("Boton seleccionar tienda")
            .located(By.xpath("//button[normalize-space()='Confirmar']"));

    public static final Target SELECCIONAR_PRODUCTO = Target.the("Campo busqueda")
            .located(By.cssSelector("body > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(8) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > a:nth-child(1) > article:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > button:nth-child(1) > div:nth-child(1) > div:nth-child(1) > span:nth-child(1)"));

}
