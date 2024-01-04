package org.ot5usk.ex_7_2_3;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.ex_7_2_3.assertions.Asserts;
import org.ot5usk.ex_7_2_3.pages.abstract_pages.BasketPage;
import org.ot5usk.ex_7_2_3.pages.wb_pages.WbCatalogPage;
import org.ot5usk.ex_7_2_3.pages.wb_pages.WbHomePage;

public class AddToBasketTest {

    @DisplayName("Search product and use basket")
    @Description("Добавление товара в коризну")
    @Test
    void test() {
        WbCatalogPage catalog = (WbCatalogPage) new WbHomePage().searchBar().enterSearchQuery("мобильный телефон").performSearchQuery();
        String expectedProductName = catalog.getProductCardName();
        BasketPage basket = catalog.selectFirstCard().addToBasket().goToBasket();
        String actualProductName = basket.getProductName();
        checkProductName(expectedProductName, actualProductName);
    }

    @Step("Проверка наличия товара в корзине")
    void checkProductName(String expectedProductName, String actualProductName) {
        Asserts.checkText(expectedProductName, actualProductName);
    }
}