package org.ot5usk.pages.abstract_pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import lombok.Getter;
import lombok.Setter;
import org.ot5usk.pages.abstract_pages.elements.default_page_elements.ChangeCity;
import org.ot5usk.pages.abstract_pages.elements.default_page_elements.DefaultPageElements;
import org.ot5usk.pages.abstract_pages.elements.default_page_elements.NavigationBar;
import org.ot5usk.pages.abstract_pages.elements.default_page_elements.SearchBar;

import static com.codeborne.selenide.Selenide.open;

@Getter
@Setter
public abstract class Page {

    private String url;
    private DefaultPageElements defaultPageElements;

    static {
        Configuration.browserSize = "1920x1080";
    }

    public Page() {
        openPage();
    }

    public Page(String url) {
        this.url = url;
    }

    public Page openPage() {
        open(url);
        return this;
    }

    public void openAnotherPage(String url) {
        open(url);
    }

    public static String determineCurrentUrl() {
        return Selenide.webdriver().driver().getWebDriver().getCurrentUrl();
    }

    public ChangeCity changeCity() {
        return defaultPageElements.changeCity();
    }

    @Step("Определение поисковой строки")
    public SearchBar searchBar() {
        return defaultPageElements.searchBar();
    }

    @Step("Выполнение поискового запроса")
    public CatalogPage search(String query) {
        return defaultPageElements.searchBar().search(query);
    }

    public NavigationBar navigationBar() {
        return defaultPageElements.navigationBar();
    }
}
