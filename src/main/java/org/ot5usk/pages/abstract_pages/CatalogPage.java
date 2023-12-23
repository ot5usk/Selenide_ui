package org.ot5usk.pages.abstract_pages;

import io.qameta.allure.Step;

public abstract class CatalogPage extends Page {

    public CatalogPage(String url) {
        super(url);
    }

    @Step("Выбор первого товара в каталоге")
    public abstract CatalogPage selectFirstCard();

    @Step("Добавление товара в коризну")
    public abstract CatalogPage addToBasket();

    @Step("Переход в коризну")
    public abstract BasketPage goToBasket();

    @Step("Получение названия товара в каталоге")
    public abstract String getProductCardName();
}
