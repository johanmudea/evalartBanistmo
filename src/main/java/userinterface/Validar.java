package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Validar extends PageObject {


    public static final Target ITEM1 = Target
            .the("item1")
            .located(By.xpath("//div[@id='text-22-sub_row_1-0-2-0-0']/div/ul/li/a[2]"));

    public static final Target ITEM2 = Target
            .the("item2")
            .located(By.xpath("//div[@id='text-22-sub_row_1-0-2-2-0']/div/ul/li/a[2]"));

    public static final Target CART = Target
            .the("cart")
            .located(By.xpath("//li[@id='wpmenucartli']/a/span[2]"));

    public static final Target DELETE = Target
            .the("delete")
            .located(By.cssSelector(".cart_item:nth-child(1) .remove"));

    public static final Target PRICE = Target
            .the("precio")
            .located(By.xpath("//div[@id='page-34']/div/div/div/div/table/tbody/tr[3]/td/strong/span[@class='woocommerce-Price-amount amount']"));

    public static String valor = PRICE.toString();

}