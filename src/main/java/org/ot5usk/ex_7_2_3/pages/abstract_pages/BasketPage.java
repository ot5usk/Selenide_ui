package org.ot5usk.ex_7_2_3.pages.abstract_pages;

import io.qameta.allure.Step;

public abstract class BasketPage extends Page {

    @Step("Получение названия товара в корзине")
    public abstract String getProductName();

    public BasketPage(String url) {
        super(url);
    }
}
