package org.ot5usk.pages.wb_pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.abstract_pages.BasketPage;
import org.ot5usk.pages.wb_pages.wb_elements.wb_default_elements.WbDefaultPageElements;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static org.ot5usk.utils.TextConverter.convertText;

public class WbBasketPage extends BasketPage {

    public final static String URL = "https://www.wildberries.ru/lk/basket";
    public static final SelenideElement PRODUCT_NAME = $x("//div/a/span[@class='good-info__good-name']");

    public WbBasketPage() {
        super(URL);
        super.setDefaultPageElements(new WbDefaultPageElements());
    }

    @Step("Получение названия товара в корзине")
    @Override
    public String getProductName() {
        return convertText(PRODUCT_NAME.shouldBe(visible).getText());
    }
}



