package org.ot5usk.pages.wb_pages.wb_elements.wb_default_elements;

import org.ot5usk.pages.abstract_pages.elements.default_page_elements.DefaultPageElements;

public class WbDefaultPageElements extends DefaultPageElements {

    public WbDefaultPageElements() {
        super.setChangeCity(new WbChangeCity());
        super.setSearchBar(new WbSearchBar());
        super.setNavigationBar(new WbNavigationBar());
    }
}
