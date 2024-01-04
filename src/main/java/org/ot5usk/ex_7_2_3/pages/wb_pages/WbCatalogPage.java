package org.ot5usk.ex_7_2_3.pages.wb_pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.ex_7_2_3.pages.abstract_pages.CatalogPage;
import org.ot5usk.ex_7_2_3.pages.wb_pages.wb_elements.wb_default_elements.WbDefaultPageElements;
import org.ot5usk.ex_7_2_3.pages.abstract_pages.BasketPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.ot5usk.ex_7_2_3.utils.TextConverter.convertText;

public class WbCatalogPage extends CatalogPage {

    public final static String URL = "https://www.wildberries.ru/catalog";

    public static final SelenideElement PRODUCT_CARD = $x("//article[@data-nm-id]");
    public static final SelenideElement PRODUCT_CARD_NAME = $x("//article[@data-nm-id][1]//span[@class='product-card__name']");
    public static final SelenideElement ADD_TO_BASKET_BTN = $x("//div[@class='product-page__order-buttons']");
    public static final SelenideElement GO_TO_BASKET_BTN = $x("//span[@class='navbar-pc__icon navbar-pc__icon--basket']");

    public WbCatalogPage(String url) {
        super(url);
        super.setDefaultPageElements(new WbDefaultPageElements());
    }

    @Override
    @Step("Выбор первого товара в каталоге")
    public CatalogPage selectFirstCard() {
        PRODUCT_CARD.shouldBe(visible).click();
        this.setUrl(determineCurrentUrl());
        return this;
    }

    @Override
    @Step("Добавление товара в коризну")
    public CatalogPage addToBasket() {
        ADD_TO_BASKET_BTN.shouldBe(visible).click();
        this.setUrl(determineCurrentUrl());
        return this;
    }

    @Override
    @Step("Переход в коризну")
    public BasketPage goToBasket() {
        GO_TO_BASKET_BTN.shouldBe(visible).click();
        return new WbBasketPage();
    }

    @Override
    @Step("Получение названия товара в каталоге")
    public String getProductCardName() {
        return convertText(PRODUCT_CARD_NAME.shouldBe(visible).getText());
    }
}
