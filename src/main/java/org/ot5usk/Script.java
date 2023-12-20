package org.ot5usk;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Script {

    public static final String MUST_BE_LOADED = "//div[contains(@class, 'main-page')]";
    public static final String SEARCH_BAR = "#searchInput";
    public static final String SEARCH_BUTTON = "#applySearchBtn";
    public static final String PRODUCT_CARD = "//article[@data-nm-id]";
    public static final String EXPECTED_PRODUCT_NAME = "//h1[@data-link='text{:selectedNomenclature^goodsName}']";
    public static final String ADD_TO_CART_BTN = "//div[@class='product-page__order-buttons']//div[@class='order']";
    public static final String GO_TO_CART_BTN = "//div[@class='navbar-pc__item j-item-basket']";
    public static final String PRODUCT_NAME_IN_CART = "//div/a/span[@class='good-info__good-name']";

    public static void main(String[] args) {
        Configuration.browserSize = "1920x1080";
        Selenide.open("https://www.wildberries.ru");
        Selenide.$x(MUST_BE_LOADED).shouldBe(visible);
        Selenide.$(SEARCH_BAR).shouldBe(visible).sendKeys("мобильный телефон");
        Selenide.$(SEARCH_BUTTON).shouldBe(visible).click();
        Selenide.$x(PRODUCT_CARD).shouldBe(visible).click();
        String expectedProductName = Selenide.$x(EXPECTED_PRODUCT_NAME).shouldBe(visible).getText();
        Selenide.$x((ADD_TO_CART_BTN)).shouldBe(visible).click();
        Selenide.$x(GO_TO_CART_BTN).shouldBe(visible).click();
        String ProductNameFromCart = Selenide.$x(PRODUCT_NAME_IN_CART).shouldBe(visible).getText();
        assertEquals(expectedProductName, ProductNameFromCart);
    }
}
