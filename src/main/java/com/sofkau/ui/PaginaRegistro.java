package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaRegistro extends PageObject {
    public static final Target BOTON_CUENTA = Target.
            the("Campo mi cuenta ")
            .located(By.cssSelector(".vtex-menu-2-x-styledLinkIcon.vtex-menu-2-x-styledLinkIcon--header-link.mh2"));

    public static final Target INGRESAR_CON_EMAIL_Y_CONTRASENIA = Target.
            the("Boton ingresar con email y contrasenna")
            .located(By.xpath("//span[contains(text(), 'Ingresa con email y contraseña')]"));

    public static final Target CAMPO_EMAIL = Target.
            the("Campo del email")
            .located(By.xpath("//input[@placeholder='Ingresa tu email']"));

    public static final Target CAMPO_CONTRASENIAA = Target.
            the("Campo del contrasenna")
            .located(By.xpath("//input[@type='password']"));

    public static final Target BOTON_PARA_ENTRAR = Target.
            the("Boton para entrar en la pagina")
            .located(By.xpath("//span[contains(text(), 'Entrar')]"));

    public static final Target CAMPO_BUSCAR_PRODUCTO = Target.the("Campo buscar producto")
            .located(By.xpath("//input[contains(@placeholder, 'Buscar en exito.com')]"));

    public static final Target BOTON_LUPA_CAMPO_BUSCADOR = Target.the("Boton Lupa ubicado en el campo buscador")
            .located(By.xpath("(//button[@class=' vtex-store-components-3-x-searchBarIcon vtex-store-components-3-x-searchBarIcon--search flex items-center pointer bn bg-transparent outline-0 pv0 pl0 pr3'])[1]"));


    public static final Target SELECCIONAR_BUSCAR_CIUDAD  = Target.the("Campo seleccionar ciudad")
            .located(By.xpath("//input[@aria-autocomplete='list']"));

    public static final Target SELECCIONAR_UBICION_ALMACEN = Target.the("Campo seleccionar tienda de su interes")
            .located(By.xpath("(//input[@type='text' and @aria-autocomplete='list'])[2]"));

    public static final Target BOTON_CONFIRMAR_DIRECCION = Target.the("Boton seleccionar direccion")
            .located(By.xpath("//button[normalize-space()='Confirmar']"));
    public static final Target CERRAR_VENTANA_DIRECCION = Target.the("Cerrar ventana de confirmacion direccion")
            .located(By.xpath("//*[name()='path' and contains(@data-name,'Path 373')]"));
    public static final Target BOTON_UBICACION = Target.the("Boton seleccionar tienda")
            .located(By.xpath("//span[@class='exito-geolocation-3-x-addressResult']"));

    public static final Target SELECCIONAR_PRODUCTO = Target.the("Campo busqueda")
            .located(By.xpath("(//img[@alt='Camarón tití precocido x 400 Gramo'])[1]"));

    public static final Target SELECCIONAR_PRODUCTO1 = Target.the("Elegir producto")
            .located(By.xpath("(//span[@class='exito-vtex-components-4-x-buttonText' and text()='Agregar'])[2]"));

    public static final Target BOTON_CARRITO_COMPRA = Target.the("Boton carrito de compra")
            .located(By.xpath("//a[@class='exito-header-3-x-minicartLink']"));

    public static final Target BOTON_IR_A_PAGAR = Target.the("Boton de ir a pagar")
            .located(By.xpath("//a[@class='btn btn-large btn-success pull-left-margin btn-place-order']"));

    public static final Target CAMPO_DATOS_COMPRADOR_NAME = Target.the("Nombre del usuario apagar la factura")
            .located(By.xpath("//*[@id='client-first-name']"));
    public static final Target CAMPO_DATOS_COMPRADOR_LAST_NAME = Target.the("Apellido del usuario apagar la factura")
            .located(By.xpath("//*[@id='client-last-name']"));

    public static final Target CAMPO_DATO_NUMERO_CELULAR = Target.the("Celular del usuario apagar la factura")
            .located(By.xpath("//*[@id='client-phone']"));

    public static final Target CAMPO_DATO_NUMERO_DOCUMENTO = Target.the("Documento del usuario apagar la factura")
            .located(By.xpath("//*[@id='client-new-document']"));

    public static final Target BOTON_CONTINUAR = Target.the("Boton confirmar campos de datos")
            .located(By.id("go-to-shipping"));

    public static final Target BOTON_FECHA_ENTREGA = Target.the("Fecha de entrega del producto")
            .located(By.xpath("//button[@id='scheduled-delivery-choose-CompraRecoge_Programado-(ptorecogida_031)']"));


    public static final Target BOTON_SELECCIONAR_FECHA = Target.the("Seleccionar fecha de entrega del producto")
            .located(By.id("scheduled-delivery-choose-CompraRecoge_Programado-(ptorecogida_086)"));

    public static final Target SELECCIONADA_FECHA = Target.the("Seleccionar fecha de entrega del producto")
            .located(By.xpath("//div[@aria-label='day-3']"));

    public static final Target BOTO_CONTINUAR_PAGINA_PAGO = Target.the("Boton para Continuar a la pagina de pago")
            .located(By.xpath("//button[@ class='submit  btn-go-to-payment btn btn-large btn-success']"));

    public static final Target BOTON_PSE = Target.the("Forma de pago por pse")
            .located(By.xpath("//span[text()='PSE']"));



    public static final Target BOTON_IR_A_PAGAR_PRODUCTO  = Target.the("Boton para pagar producto")
            .located(By.xpath("(//button[@id='payment-data-submit'])[2]"));

}
