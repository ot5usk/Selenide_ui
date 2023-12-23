package org.ot5usk.utils;

import io.qameta.allure.Step;

import java.util.Arrays;
import java.util.List;

public class TextConverter {

    @Step("Преобразование значения для будущей проверки")
    public static String convertText(String text) {
        List<String> temp = Arrays.stream(text.split(" ")).toList();
        temp = temp.stream().map(e -> e.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase()).toList();
        temp = temp.stream().filter(e -> !e.isEmpty()).toList();
        StringBuilder sb = new StringBuilder();
        for (String s : temp) {
            sb.append(s);
        }
        return sb.toString();
    }
}
