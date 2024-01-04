package org.ot5usk.ex_7_2_3.pages.wb_pages.wb_elements.wb_default_elements;

import org.ot5usk.ex_7_2_3.pages.abstract_pages.elements.default_page_elements.DefaultPageElements;

public class WbDefaultPageElements extends DefaultPageElements {

    public WbDefaultPageElements() {
        super.setChangeCity(new WbChangeCity());
        super.setSearchBar(new WbSearchBar());
        super.setNavigationBar(new WbNavigationBar());
    }
}
